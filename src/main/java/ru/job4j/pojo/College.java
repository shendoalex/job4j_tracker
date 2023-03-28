package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petr Kuzmich Arsentev");
        student.setGroup("Stajor");
        student.setDateOfStart("01.01.2023");
        System.out.println(student.getFio() + " study in group: " + student.getGroup() + " from date: " + student.getDateOfStart());
    }
}
