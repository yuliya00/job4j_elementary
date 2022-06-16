package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return right > left ? right : left;
    }

    public static void main(String[] args) {
        int rsl = Max.max(3, 5);
        System.out.println(rsl);
    }
}
