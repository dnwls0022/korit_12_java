package ch21_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
예외 클래스는 별개로 정의했지만 메서드를 호출했을때 예외를 처리해야하하기 때문에 특정예외를 참조
 */
public class AgeMain {
    public static void chackAge(int age) throws InvalidAgeEception {
        if (age < 0 || age > 200) {
            //원랜 내부에 하나하나 쓰고 그 다음에 else를 쓰든 아님 추가 if작성
            throw new InvalidAgeEception("나이는 0-200 사이정수만가능");
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이입력");
        // int age = scanner.nextInt();
        /*
        이전엔 바로 scaaner넣었지만 이젠 여기에 음수혹은 초과정수 그리고 실수를 입력할수있다. 예외가 발생할수있는부분의 코드라인은 try catch러
        김싼다
         */
        try {
            int age = scanner.nextInt();
            chackAge(age);
        } catch (InvalidAgeEception e) {
            System.out.println("나이입력오류" + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("잘못된입력 정수입력해라");

            // throw 하나를던짐
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
