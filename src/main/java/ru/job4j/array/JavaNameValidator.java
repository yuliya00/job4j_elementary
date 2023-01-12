package ru.job4j.array;

import java.lang.Character;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!(name.isEmpty() || Character.isDigit(name.codePointAt(0)) || Character.isUpperCase(name.codePointAt(0)))) {
            for (int i = 1; i < name.length(); i++) {
                int rsl = name.codePointAt(i);
                if (isLowerLatinLetter(rsl) || isSpecialSymbol(rsl) || isUpperLatinLetter(rsl) || Character.isDigit(i)) {
                    valid = true;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 || code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 || code < 123;
    }
}



