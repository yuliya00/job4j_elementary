package ru.job4j.array;

import java.lang.Character;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || Character.isDigit(name.codePointAt(0)) || Character.isUpperCase(name.codePointAt(0))) {
            valid = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int rsl = name.codePointAt(i);
                if (!(isLowerLatinLetter(rsl) || isSpecialSymbol(rsl) || isUpperLatinLetter(rsl)) || Character.isDigit(rsl)) {
                    valid = false;
                }
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean special = false;
        if (code == 36 || code == 95) {
            special = true;
        }
        return special;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean upper = false;
        if (code > 64 || code < 91) {
            upper = true;
        }
        return upper;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean lower = false;
        if (code > 96 || code < 123) {
            lower = true;
        }
        return lower;
    }
}



