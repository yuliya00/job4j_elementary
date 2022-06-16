package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean result = LogicNot.notEvenAndPositive(5);
        System.out.println(result);
        boolean result1 = LogicNot.evenOrNotPositive(8);
        System.out.println(result1);
        boolean result2 = LogicNot.notEvenAndPositive(0);
        System.out.println(result2);
        boolean result3 = LogicNot.evenOrNotPositive(0);
        System.out.println(result3);
        boolean result4 = LogicNot.evenOrNotPositive(-5);
        System.out.println(result4);
        boolean result5 = LogicNot.notEvenAndPositive(-3);
        System.out.println(result5);
    }
}
