package ru.htr.kata;

import java.util.function.UnaryOperator;

public class TrainingTasks {
    public static String vertMirror (String s) {
        String[] words = s.split("\n");
        for (int i = 0; i < words.length; i++) {
            String res = "";
            for(int j = 0; j < words[i].length(); j++) {
                res = words[i].charAt(j) + res;
            }
            words[i] = res;
        }
        String result = "";
        for (var i : words) {
            result += i + "\n";
        }
        return result;
    }
    public static String horMirror (String s) {
        String[] words = s.split("\n");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + "\n";
        }
        return result;
    }
    public static String oper(UnaryOperator<String> stringTransformer, String s) {
        String transformedString = stringTransformer.apply(s);
        return transformedString;
    }
}
