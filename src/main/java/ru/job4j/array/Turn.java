package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int t = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = t;
            int a = array[1];
            array[1] = array[array.length - 2];
            array[array.length - 2] = a;
            return array;
        }
        return array;
    }
}
