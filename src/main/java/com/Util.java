package com;

import java.util.Set;
import java.util.TreeSet;

class Util {
    private Util() {
    }

    static Integer[] getDigits(int num) {
        Set<Integer> digits = new TreeSet<>();
        collectDigits(num, digits);
        return digits.toArray(new Integer[]{});
    }

    private static void collectDigits(int num, Set<Integer> digits) {
        if (num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }
}
