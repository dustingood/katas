package com.example.katas;

import java.util.StringTokenizer;

/**
 * 1. A null or empty string should return 0
 * 2. A single number should return itself
 * 3. Two comma separated numbers should return the sum of the numbers
 * 4. Three or more comma separated numbers should return the sum of the numbers
 * 5. A Negative number should throw an IllegalArgumentException
 * 6. Numbers Greater than or Equal to 1000 should be ignored
 */
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
