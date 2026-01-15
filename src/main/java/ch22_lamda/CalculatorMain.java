package ch22_lamda;

public class CalculatorMain {
    public static int operate(int a, int b,Calculator c){
        return c.compute(a, b);
    }


    public static void main(String[] args) {


    Calculator add = (x,y) -> x+y;  //Calculator 인터페이스 객체명이 add이고 내부메서드는 compute추상메서드를 구현한 x+y
    Calculator sub = (x,y) -> x-y;
    Calculator mul = (x,y) -> x*y;
    Calculator div = (x,y) -> x/y;

        System.out.println(" 2+3  = "+operate(2,3,add));


        /*
                    operate의 세번째 매개변수 calculatror인터페이스의 서브클래스를 받는다
                    그리고 operator()메서드의 return값은 기본적으로 compute()를 리턴하는 것을 알 수 있다.
                    인터페이스는 추상메서드밖에없으니...구현부가있는 객체값확인
         */
        System.out.println(sub.compute(3,4));
        System.out.println(operate(4,5,mul));

        /*
        클래스들간의 일반메서드/ 정적메서드뿐 아니라 어디서 빠져나온 함수를 인터페이스의
        추상메서드를 구현한 어떤버전을 일반표현식으로 썼든 람다식으로 썻든 다 해석해서
        이렇게 호출할지까지 알 필요가있다.
         */





















    }





}
