package ch17_static.builders;

import lombok.ToString;

import java.util.Locale;
@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;

    }

    public static class Builder {
        private String name;
        private int age;
        private String address;
     /*
      class 내에 static class라고 하는 것을 정의했는데
      Builder라고하는 static클래스 내에 field 정의했다.
      클래스니까 field와 method들로 이루어져있다.
      method들을 정의하는 영역이 됩니다. builder pattern 필수영역.
      */
        //메서드명이 name이란 명사 매개변수가 string name
        //  접근제어자 public
        public Builder name(String name){
            this.name =name;   //argument로 들어온 string data 를 builder의 field인 name에 대입
            return this;     // 그러면 name() 호출 전에는 field의 name 에 값이 없어야
                             // Builder 타입의 객체가 리턴 name field에 값이 들어간 상태에서 메서드에 동사가아닌 명사임
        }
        public Builder age (int age) {
            this.age = age;
            return this;
        }

        //address 메서드
        public Builder address (String address) {
            this.address=address;
            return this;
        }

        /*
         field명과 동일한 메서드를 정의했음.
         그리고 메서드가 호출된 결과로 Builder 객체에 field값이 대입된 상태된 후에
         그, 객체가 return되는 형태
          */

        //접근제어자가 퍼블릭
        //리턴타입이 펄슨
          //      매개변수가 x
        public  Person build(){
            return new Person(this);

        }



























    }
}

