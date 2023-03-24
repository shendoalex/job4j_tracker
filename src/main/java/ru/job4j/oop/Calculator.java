package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        Calculator calc = new Calculator();
        System.out.println("Sum: " + sum(1));
        System.out.println("Multiply: " + calc.multiply(2));
        System.out.println("Minus: " + minus(3));
        System.out.println("Divide: " + calc.divide(4));
        System.out.println("Sum of all: " + calc.sumAllOperation(5));
    }
}