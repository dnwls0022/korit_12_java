package ch22_lamda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(23,4,5,6,232432,3234,368,2342,435,8786334,344);
        scores.stream()                                          // streamapi 사용
                .filter(s -> s >= 60)                     //  60점미만 빼기
                .map(s-> s +5)                            //  남아있는것에 5점씩더하기
                .sorted()                                        // 오름차순으로 정렬
                .forEach(System.out::println);                   //  각각출력

    }
}
