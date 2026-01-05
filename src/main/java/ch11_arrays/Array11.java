package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*

  Integer[] numbers 배열 선언 10개 index만들기
  0~9번지 nextInt(); 반복실행
  number내에 임의의 정수넣기.

  그 배열 출력.
  오름차순 출력
  내림차순 출력

  각 element를 뽑아서 10씩 곱합니다.
    향상된 for문으로 element를 출력합니다 -> 1239087 / 13409578 / -584976395 / ...
 */
public class Array11 {
    public static void main(String[] args) {
        //number배열 10개선언 후 임의의정수넣기
        Integer[] numbers = {1,2,5,7,8,9,4,6,3,5};
        System.out.println("정렬 전 배열 : " + Arrays.toString(numbers));
        System.out.println("오름차순정렬후배열 :"+ Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator. reverseOrder());
        System.out.println("내림 차순 정렬 후 배열:" + Arrays.toString(numbers));

        // element뽑아서 10씩 곱하기

        for(int i =0; i< numbers.length; i++){
            System.out.println((numbers[i] *= 10)+ "");


        }


        //향상된 for문
        for (Integer num : numbers) {
            // numbers에서 하나씩 꺼낸 값을 num이라고 부르기로 함
            System.out.print((num * 10) + " ");
        }

    }
}

