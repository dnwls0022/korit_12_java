package ch09_getter_setter;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
        //필드에 값을 직접 대입하는 방법
        person1.name = "김일";
        person1.age = 10;
        person1.address = "부산광역시 부산진구";
        // setter를 경유하여 필드에 값을 대입하는 방법;
        // setter는 method이므로 객체명.메서드명();
        person1.setName("김일일");
        person1.setAge("-10");
        person1.setAddress("부산진구...");
        //getter 사용해서 field조회 방법
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAddress());

        // 여기서 getter만을 사용하여
        // 김일일 학생의 나이는 0 살이고 주소는 서울특별시 종로구입니다. 라고 출력하도록 작성하시오

        System.out.println(person1.getName() + "학생의 나이는 " + person1.getAge()
                + "살이고 , 주소는" + person1.getAddress() + "입니다.");

        // String/Scanner들은 class에 해당한다. 그런데 우리는 이미 class를 배웠으니까,
        //거기에
        //

        int lengthOfName = person1.getName().length();     //chaining method
        System.out.println(lengthOfName);

        // chaining method 잘 작동하려면 특정 메서드의 결과값이 어떻게 되는가를 아는것이 중요!


        person1.setName("디카프리오");
        person1.setName("김일이");
    }













































}














