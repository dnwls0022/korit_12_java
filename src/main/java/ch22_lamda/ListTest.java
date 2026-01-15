package ch22_lamda;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNums = new ArrayList<>();
        // 짝수만뽑아서  evenNums 에 대입 evenNums 를 출력
        // 향상된 포문 (데이터타입:변수명 리스트변수명)
        for (Integer num : nums){
            if(num % 2 ==0) evenNums.add(num);

        }
        System.out.println(evenNums);
        //필터내부에[ 람다식쓰임
        //★★★★람다식 ★★★★★
        // stream, filter, for Each, soutc 새로운용어 4개
        nums.stream().filter(n -> n%2 == 0 ).forEach(System.out::println);


















    }
}
