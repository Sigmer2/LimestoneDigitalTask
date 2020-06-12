package main.java.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Converter {
    String convert(Integer integer) {
        StringBuilder sb = new StringBuilder();
        boolean isProceed = true;
        IntStream intStream = String.valueOf(integer).chars();
        List<Integer> digits = intStream
                .distinct()
                .map(Character::getNumericValue)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        for (int i = 0; i < digits.size(); i++) {
            if (i < digits.size() - 1) {
                if (digits.get(i) + 1 == digits.get(i + 1)) {
                    if (isProceed) {
                        isProceed = false;
                        sb.append(digits.get(i));
                        sb.append("-");
                    }
                } else {
                    isProceed = true;
                    sb.append(digits.get(i));
                    sb.append(",");
                }
            } else {
                sb.append(digits.get(i));
            }
        }
        return sb.toString();
    }
}
