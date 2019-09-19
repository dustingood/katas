package com.example.katas;

import java.util.StringTokenizer;

public class Calculator {

    public int add(String s){
        int result = 0;

        if (s != null && s.trim().length() > 0){
            StringTokenizer tokenizer = new StringTokenizer(s, ",");
            while (tokenizer.hasMoreElements()){
                int number = Integer.parseInt(tokenizer.nextToken());

                if(number < 0){
                    throw new IllegalArgumentException(number + " cannot be less than zero.");
                }

                if (number < 1000){
                    result += number;
                }
            }
        }

        return result;
    }

}
