package ch21_exception.conveni;

import ch21_exception.signup.InvalidIdException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conveni {
    public static void order(int quantity)throws InvalidIdException{
        if(quantity < 1 || quantity > 50){
            throw new InvalidIdException("주문가능수량은 1~50");

        }

    }



    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        try {
            System.out.println();
            int quantity = scanner.nextInt();
            order(quantity);
        }catch (InvalidIdException e){
            System.out.println("주문불가"+ e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("정수만입력가능");
        }catch (Exception e){
            System.out.println("알수없는 예외 발생");
        }finally {
            System.out.println("프로그램이정상종료.");
        }

    }

}
