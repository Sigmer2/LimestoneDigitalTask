package com;

import static com.Util.getDigits;

public class Converter {
    public String convert(Integer integer) {
        StringBuilder sb = new StringBuilder();
        boolean isProceed = true;
        Integer[] digits = getDigits(integer);
        for (int i = 0; i < digits.length; i++) {
            if (i < digits.length - 1) {
                if (digits[i] + 1 == digits[i + 1]) {
                    if (isProceed) {
                        isProceed = false;
                        sb.append(digits[i]);
                        sb.append("-");
                    }
                } else {
                    isProceed = true;
                    sb.append(digits[i]);
                    sb.append(",");
                }
            } else {
                sb.append(digits[i]);
            }
        }
        return sb.toString();
    }
}
