package ch18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
    public class ResponseData <T> {
    private  String message;
    private  T data;
}
/*
제네릭 쓸때 Class 에 추가적인 명령어 필요.
<T>
빼고 필드에 T쓰면오류
 */
