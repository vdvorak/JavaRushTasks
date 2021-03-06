package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Integer passengersAmount = 0;

        if (str.equals("helicopter")) {
            result = new Helicopter();
        } else if (str.equals("plane")) {
            str = reader.readLine();
            passengersAmount = Integer.parseInt(str);
            result = new Plane(passengersAmount);
        }
        reader.close();
    }
}
