package ch18_generic;

import ch18_generic.bmi.Person;
import lombok.Data;

import java.util.Date;

public class Datacontroller {
    public static void main(String[] args) {
        Date now = new Date();
        //필드 자료형 결정 x 객체만들때 지정해줘 !

        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공",now.toString() );
        System.out.println(responseData1);
         //미리정한다? 객체를 생성하는 시점!
        ResponseData<Integer> responseData2 = new ResponseData<>("나이저장성공", 27);
        System.out.println(responseData2);

        ResponseData<Double> responseData3 = new ResponseData<>("학점저장성공", 4.3);
        System.out.println(responseData3);

        ResponseData<Person> responseData4 =
                new ResponseData<Person>("사람객체저장성공", new Person("김일",180, 70));
        System.out.println(responseData4);
        //다양한 클래스에 대고







    }
}
