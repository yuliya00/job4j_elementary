package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int i;
        boolean result;
        for (i = 0; result = i <= 5; i++) {
            System.out.println(i);
        }
    System.out.println("Индекс после цикла равен: " + i);
    System.out.println("Условие выполнения цикла равно: " + result);
       int a;
       boolean rsl;
       for (a = 5; rsl = a <= 10; a++) {
           System.out.println(a);
       }
    System.out.println("Индекс после цикла равен: " + a);
    System.out.println("Условие выполнения цикла равно: " + rsl);
    }
}
