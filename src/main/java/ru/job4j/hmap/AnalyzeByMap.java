package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double finalScore = 0D;
        int divideBy = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                finalScore = finalScore + subject.score();
                divideBy++;
            }
        }
        return finalScore / divideBy;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> resultList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double finalScore = 0D;
            int divideBy = 0;
            for (Subject subject : pupil.subjects()) {
                finalScore = finalScore + subject.score();
                divideBy++;
            }
            Label label = new Label(pupil.name(), finalScore / divideBy);
            resultList.add(label);
        }
        return resultList;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> tempMap = new LinkedHashMap<>();
        List<Label> resultList = new ArrayList<>();
        int pupilCount = 0;
        for (Pupil pupil : pupils) {
            int tempCount = 0;
            for (Subject subject : pupil.subjects()) {
                tempMap.merge(subject.name(), subject.score(), Integer::sum);
            }
            pupilCount++;
        }
        for (Map.Entry<String, Integer> str : tempMap.entrySet()) {
            Label label = new Label(str.getKey(), (double) str.getValue() / pupilCount);
            resultList.add(label);
        }
        return resultList;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> resultList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int tempCount = 0;
            for (Subject subject : pupil.subjects()) {
                tempCount = tempCount + subject.score();
                resultList.add(new Label(pupil.name(), tempCount));
            }
        }
        resultList.sort(Comparator.naturalOrder());
        return resultList.get(resultList.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> tempMap = new LinkedHashMap<>();
        List<Label> resultList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int tempCount = 0;
            for (Subject subject : pupil.subjects()) {
                tempMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> str : tempMap.entrySet()) {
            Label label = new Label(str.getKey(), (double) str.getValue());
            resultList.add(label);
        }
        resultList.sort(Comparator.naturalOrder());
        return resultList.get(resultList.size() - 1);
    }
}
