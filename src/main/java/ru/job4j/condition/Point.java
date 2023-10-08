package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(first - second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result1 = distance(0, 1, 3, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 1) to (3, 2) " + result1);
    }
}
