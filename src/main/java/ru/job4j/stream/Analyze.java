package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(a -> a.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(0d);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(a -> new Tuple(a.name(), a.subjects()
                        .stream()
                        .mapToDouble(Subject::score)
                        .average()
                        .orElse(0d)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(a -> a.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.averagingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(a -> new Tuple(a.getKey(), a.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(a -> new Tuple(a.name(), a.subjects()
                        .stream()
                        .mapToDouble(Subject::score)
                        .sum()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(a -> a.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.summingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(a -> new Tuple(a.getKey(), a.getValue()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(null);
    }
}
