package com.finix.alexcuva.kataday.day5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(item -> {
            return  hasNothingElse(item) && hasMouth(item) && hasEyes(item) && hasNose(item);
        }).count();
    }

    private static boolean hasNothingElse(String smile) {
        Pattern pattern = Pattern.compile("([^:;)D\\-~])");
        Matcher matcher = pattern.matcher(smile);

        return !matcher.find() && smile.length() > 1 && smile.length() < 4;
    }

    private static boolean hasNose(String smile) {
        if (smile.length() > 2) {
            char nose = smile.charAt(1);
            return nose == '-' || nose == '~';
        }
        return true;
    }

    private static boolean hasEyes(String smile) {
        return smile.startsWith(":") || smile.startsWith(";");
    }

    private static boolean hasMouth(String smile) {
        return smile.endsWith(")") || smile.endsWith("D");
    }
}