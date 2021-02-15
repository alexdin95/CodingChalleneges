package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfStringContainsOnlyDigits {

    public static boolean containsOnlyDigits(String s) {
        if (s == null || s.isBlank()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("1234a"));
        System.out.println(containsOnlyDigits("12 34"));
        System.out.println(containsOnlyDigits("1234b"));
        System.out.println(containsOnlyDigits("1234"));
    }

}



