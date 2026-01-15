package ch22_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        //리스트로 출력하기
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);


        /*
        각 element를 추출하여 for문 /향상된 for문작성 콘솔에이와같이출력되도록
        과일명:사과
        과일명:딸기
        과일명:블루베리

         */
        //일반포문
        //리스트는 사이즈
        for(int i =0; i < fruits.size(); i++){
            System.out.println("과열명:"+ fruits.get(i));
        }

        //향상된 포문
        for(String fruit : fruits);
        System.out.println("과열명:"+ fruits);

        //람다식활용한 메서드 foreach
        fruits.forEach(fruit -> System.out.println("과일명:"+ fruit));

        System.out.println();
        //"과일명:" +fruit 리턴된것
        fruits.stream().map(fruit ->"과일명:" +fruit).forEach(System.out::println);
        System.out.println(fruits);

        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);
        nums.forEach(num-> System.out.print((nums))+" ");
        System.out.println("\n"+ nums);




    }
}
