package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        String max = "";
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() > max.length()) {
                max = strings.get(i);
            }
        }
        for (String s : strings) {
            if (s.length() == max.length()) {
                result.add(s);
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
