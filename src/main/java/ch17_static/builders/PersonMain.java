package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        //Person person = new Person();
    /*
         privatr person(Builder builder)로 정의한 매개변수 생성자만 있으니 기본 생성자가 없다는 점에서 모두 발생
         그리고 private 접근 제어자 때문에 () 내에 Builder 객체를 집어넣는다하더라도 모두 발생

             Allargument로 작성시에
     */
        //Person person = new Person("김일","20","서울종로구");
        //이상의  Argument를 Builder패턴을 적용해서 객체생성

        Person person1 = new Person.Builder()
                .age(21)
                .address("부산진구")
                .name("김일")
                .build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().name("김삼").build();
        System.out.println(person3);

        Person2 person4 = Person2.builder().name("김사").build();
        System.out.println(person4);

        Person2 person5 = Person2.builder().build();
        System.out.println(person5);

        Person2 person6 = Person2.builder()
                .age(26)
                .name("김육")
                .address("광주광역시 북구")
                .build();
        System.out.println(person6);
    }
}





