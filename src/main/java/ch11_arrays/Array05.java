package ch11_arrays;

import java.util.Scanner;

/*

 */
public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A", "B", "C", "D", "F"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "+ /");
            if (scores[i].equals("F")) {
                System.out.println(scores[i]);
                break;
            }
 System.out.println(scores[i] + "+/");
        }
        System.out.println(scores[scores.length -1]);
    }
    //addPlus() 메서드로 정의
}
