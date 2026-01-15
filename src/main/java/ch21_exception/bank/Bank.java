package ch21_exception.bank;

import ch21_exception.signup.InvalidIdException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    private  int valance = 10000;
    public void withdraw(int amount) throws InsufficientBalanceException{
            if(amount > valance){
                int gap = amount -valance;
                throw new InsufficientBalanceException("현재잔액");
            }
    }












    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        Bank bank = new Bank();
        try {
            System.out.println("현재잔액"+ bank.valance+ "원");
            System.out.println();
            int money = scanner.nextInt();
            bank.withdraw(money);
            System.out.println("출금 후 잔액"+ (bank.valance-money)+"원");

        }catch (InsufficientBalanceException e){
            System.out.println();
        }catch (InputMismatchException e){
            System.out.println("정수만입력가능");
        }finally {
            System.out.println("프로그램 정상종료");
        }
    }
}
