package ch11_arrays;

import java.util.Arrays;

/*
다차원 배열( Multi -Dinensional Array) 중에서 2차원배열
: 다차원 배열은 2차원 이상의 배열을 의미하지만 개발 환경 상 2아원 배열 이상을
다루는 경우는 드물기 때문에 2차원배열을 기준으로진행
  형식 :
  int [][] arr01 = new int[크기][크기]; 선언방식 #1
  int [][] arr02 = new int[크기][크기]; 선언방식 #2

  int [][] arr03 = { {1,2}, {3,4}, {5,6} } 선언방식 #3 초기화

 2차원 배열선언시 열의 크기는 지정하지 않ㄹ아도 되지만 형의 크기는 항상 지정해야함
 -> 2번 형식

    row 행                          -세로 열
    column 열                       -가로 행
   1열 2열 {column)
 {  ↓ ↓
   {1,2}  →  1행 (row)
   {3,4}  →  2행 (row)
   {5,6}  →  3행 (row)
 }


 */
public class Array13Multi {
    public static void main(String[] args) {
        int [][] arr03 = { {1,2}, {3,4}, {5,6} };
        //5 출력
        System.out.println(arr03[2][0]);
        //2 차배열은 내부 원소가 배열이란점
        System.out.println(arr03);
        System.out.println(arr03[2]);

        System.out.println(Arrays.toString(arr03));

        //2차배열 원소추출 -> 중첩 for문 사용
        for( int i =0; i < arr03.length; i++){
            //내부가 1차 배열 평소에 쓰던 반복문을 또 써야함
            for(int j = 0; j< arr03[i].length; j++){
                System.out.println(arr03[i][j] + "/");
            }
            System.out.println();
        }

        //2차배열 원소추출 -> 중첩 for문 사용
        for( int i =0; i < arr03.length; i++) {
            // 여기가 1차배열만 출력가능 다차원 x
            System.out.println(Arrays.toString(arr03[i]));

        }
        // 향상된 for문출력
        //1-2-
        //3-4-
        //5-6-
        //출력

        for (int[]firstArray : arr03)
            for (int secondElement : firstArray){
            System.out.print(secondElement + " -");
        }
        System.out.println();
    }
}
