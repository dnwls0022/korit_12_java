package ch09_getter_setter;

public class Person {

    //필드선언
    String name;
    int age;
    String address;
    //기본 생성자
    public Person(){}

    //이름 매개변수 생성자
    public Person(String name) {
        this.name = name;
    }
    //setName , setAge, setAddress 작성
    public void setName(String name){
        if(name.length()>4){
            System.out.println("변경할수없습니다.");
            return; //method를 종료하는 명령어
        }
        this.name = name;
    }
    public void setAge(String name){
        if(age<0 || age >100){
            System.out.println("불가능한 나이 입력입니다 :");
        }
        System.out.println("변경 전 :"+this.name);
        this.name = name;
        System.out.println("변경 후 :"+this.name);
    }
    public void setAddress(String name){
        this.name = name;
    }
    //getName, getAge, getAddress 작성
    public String getName(){ //필드와 개터의 자료형이 일치해야함.
        return name;
    }
    public int getAge(){ //필드와 개터의 자료형이 일치해야함.
        return age;
    }
    public String getAddress(){ //필드와 개터의 자료형이 일치해야함.
        return address;
    }








    //personMain person1 객체를 기본 생성자를 통해 생성

    //person1.name = "김일", person1.age = -10 , person.address = "부산광역시 부산진구"
    // 대입//

    /*
        setName() 메서드에 비지니스 로직을 추가히시오.
        1. argument로 들어온 string 데이터의 글자 수를 파악
        2. 4글자 초과 - "변경 불가" 출력 기존이름을 그대로 사용할 것
        3. 4글자 이하 "이름이 변경되었음"
        "변경전: 김일일"
        "변경 후 :김일이"
        4. 되도록 작성하고 person main에서 person1의 이름을 setter를 통해 변경하시오
        5. 이상의 코드를 작성했을 때의 실행 예는 아래와 같다.
        변경 할 수 없다. -> 이때 set name("디카프리오")를 적용하시오.
        이름이 변경되었다.
        변경 전: 김일일
        변경 후: 김일이
         */



















}
