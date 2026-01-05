package ch11_arrays;
/*
이하의 score배열 값을 분석해서
90이상은a
80이상은b
70이상은c
60이상은d
59이하는 f

실행 예
A등급 몇 명
B등급 몇 명
C등급 몇 명
......
F등급 몇 명
 */

public class Array07 {
    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        /*
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] > 89) a++;
                else if (scores[i] > 79) b++;
                else if (scores[i] > 69) c++;
                else if (scores[i] > 59) d++;
                else f++;
            }
        }
        System.out.println("a 등급인원 :" + a + "명");
        System.out.println("b 등급인원 :" + b + "명");
        System.out.println("c 등급인원 :" + c + "명");
        System.out.println("d 등급인원 :" + d + "명");
        System.out.println("e 등급인원 :" + f + "명");
                                                      */
        //풀이법 2
        int[] grade = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] > 89) grade[0]++;
                else if (scores[i] > 79) grade[1]++;
                else if (scores[i] > 69) grade[2]++;
                else if (scores[i] > 59) grade[3]++;
                else grade[4 ]++;    //[i]가 아니라 [0]으로 하드코딩
            }
        }
        System.out.println("a 등급인원 :" + grade[0] + "명");
        System.out.println("b 등급인원 :" + grade[1] + "명");
        System.out.println("c 등급인원 :" + grade[2] + "명");
        System.out.println("d 등급인원 :" + grade[3] + "명");
        System.out.println("e 등급인원 :" + grade[4] + "명");


    }

}



