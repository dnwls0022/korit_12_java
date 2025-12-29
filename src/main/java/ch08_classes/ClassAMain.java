package ch08_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        //각체 생성 방법
        // 클래스명 객체명 = new클래스명();
        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        //필드에 값을 대입하는 방법
        // 객체명 속성값= 값;
        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.5;

        System.out.println(classA1.name + "학생의 학번은" + classA1.num + "번 이고, 점수는 " + classA1.score + "점입니다.");
        // 메서드를 호출하는 방법
        // 객체명.메서드명()

        classA1.callName();

        int num = scanner.nextInt();

        // class a의객체 classa2생성
        // 김이/ 2/100을 필드에 대입
        // 다음과 같이 출력
        // 실행 예
        //  100번 학생의 이름은 김 점수는 2,0
        // 김삼을부릅니다


        //각체 생성
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.score = 2;
        classA2.num = 100;

        System.out.println(classA2.num + "번 학생의 이름은" + classA2.name + "이고, 점수는" + classA2.score + "입니다.");

        classA2.name = "김삼"
        classA1.callName();

        //car/ carmain
        //carmain
    }
}



