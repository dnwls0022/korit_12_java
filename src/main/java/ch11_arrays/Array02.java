package ch11_arrays;
/*
1.humans 배열에 이름을 입력할 수 있도록 할것.
몇명의 학생을 등록할래? >>> 5

 */

import java.awt.*;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner;
        System.out.println();
        int count = Scanner.nextln();
        scanner.nextline();


        //배열생성
        String[] human = new String[count];
        double[] score = new double[count];


        //이름생성
        for (int i = 0; i < human.length; i++) {
            System.out.println(i + 1 + "번의 학생의 이름을 등록하시오:");

            for (int J = 0; i < score.length; i++) {
                System.out.println(i + 1 + "번의 학생의 점수를 입력하시오:");

            }
            for

