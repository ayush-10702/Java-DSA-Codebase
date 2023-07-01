package com.ak.String;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();

        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }
    private static void generateAllSubstring(String str){
        for (int i = 0; i < str.length(); i++) {
            String substr="";
            for (int j = i; j <str.length() ; j++) {
                substr+=str.charAt(j);
                System.out.println(substr);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Pratham";
         generateAllSubstring(input);
    }
}
