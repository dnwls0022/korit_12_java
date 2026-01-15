package ch21_exception.scores;

import ch21_exception.age_exception.InvalidAgeEception;

import java.util.Scanner;

public class Scores {
    public static void checkScore(int score)throws InvalidScoreException{
        if(score < 0 || score > 100){
            throw new InvalidScoreException("점수는 0-100 정수만가능");
        }
    }



    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("점수입력");

        try {
            int score = scanner.nextInt();
            checkScore(score);
            System.out.println("점수가 성공적으로 저장되었습니다.");
        }catch (InvalidScoreException e){
            System.out.println("점수오류");

        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }



}
