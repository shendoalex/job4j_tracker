package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String track = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(track);
    }

    public static void main(String[] args) {
        Jukebox firstTune = new Jukebox();
        firstTune.music(1);
        Jukebox secondTune = new Jukebox();
        secondTune.music(2);
        Jukebox noTune = new Jukebox();
        noTune.music(4);
    }
}
