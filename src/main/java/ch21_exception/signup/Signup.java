package ch21_exception.signup;

import ch21_exception.scores.InvalidScoreException;

import java.util.Scanner;

public class Signup {
    public static void checkId(String id)throws InvalidIdException{
        if(id.length() <8 )
            throw new InvalidIdException("아이디는 8글자 이상이어야합니다.");

    }

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("아이디입력>>>");

        try {
            String id = scanner.nextLine();
            checkId(id);
            System.out.println("아이디가 성공적으로 저장되었습니다.");
        }catch (InvalidIdException e){
            System.out.println("아이디오류"+e.getMessage());

        }catch (Exception e){
            throw new RuntimeException(e);
        }






    }
}
