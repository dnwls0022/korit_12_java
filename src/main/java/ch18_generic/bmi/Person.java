package ch18_generic.bmi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter

public class Person {
    //필드생성
    private String name;
    private double height;
    private double weight;


}
