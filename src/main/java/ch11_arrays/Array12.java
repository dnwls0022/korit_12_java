package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        //사용할 객체 생성
        Random random = new Random();
        //사용변수선언
        Integer[] numbers = new Integer[10];
        //배열 내에 값 대입 -> 반복문 //값을 입력하는 것
        // 일반 for문
        for(int i = 0; i< numbers.length ; i ++){
            numbers[i] =random.nextInt();

        }
        //출력
        System.out.println(Arrays.toString(numbers));
        int randomNum = random.nextInt(10);
        System.out.println(randomNum);
          /*
          random.nextint();
          argument 가 없을 떈 가장 작은 정수부터 가장 큰 정수 중 하나를 임의 생성
          random.nextint(한계값);
          argument 가 하나있을떄 한계깞 설절... 0을 포함하기때문
          random.next(10)이라면 0-9 까지 범위
          1-10 까지 범위
           */
          //오름차순 배열
        Arrays.sort(numbers); // 원본배열을 바꾸기 때문에 주의
        System.out.println(Arrays.toString(numbers));
        //내림차순
        Arrays.sort(numbers, Comparator. reverseOrder());
        System.out.println(Arrays.toString(numbers));
        //값을 꺼내서 10곱하기

        /*
        1-100까지 값 다시 입력
        10씩 곱하고 향상된 for문을 통해서 10/120 /79.........../ 출력

         */
    for (Integer number : numbers){
        number = random.nextInt(10) +1;
        number *= 10;
        System.out.println(number + "/");
    }

    }

}
