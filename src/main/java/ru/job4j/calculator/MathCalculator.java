package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDev(double first, double second) {
        return sub(first, second)
                + dev(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + sub(first, second)
                + dev(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subAndDev равен: " + subAndDev(10, 20));
        System.out.println("Результат расчета sumAllOperation равен: " + sumAllOperation(10, 20));
    }
}
