package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    public static void main(String[] args) {
        double result = distance(0, 1, 0, 2);
        double result1 = distance(0, 3, 3, 2);
        double result2 = distance(3, 0, 3, 5);
        System.out.println("result (0, 1) to (0, 2) " + result);
        System.out.println("result (0, 3) to (3, 2) " + result1);
        System.out.println("result (3, 0) to (3, 5) " + result2);
    }
}
