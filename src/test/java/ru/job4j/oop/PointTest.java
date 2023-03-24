package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double result = a.distance(b);
        assertThat(Math.abs(expected - result) < 0.01).isTrue();
    }

    @Test
    public void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double expected = 1;
        double result = a.distance(b);
        assertThat(Math.abs(expected - result) < 0.01).isTrue();
    }

    @Test
    public void when02to10then2dot23() {
        Point a = new Point(0, 2);
        Point b = new Point(1, 0);
        double expected = 2.23;
        double result = a.distance(b);
        assertThat(Math.abs(expected - result) < 0.01).isTrue();
    }

    @Test
    public void when11to22then1dot41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double expected = 1.41;
        double result = a.distance(b);
        assertThat(Math.abs(expected - result) < 0.01).isTrue();
    }
}