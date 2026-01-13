package ch19_collections;

import java.util.*;


/*
   1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 돌릴 것.

 */
public class FieldTrip {
    public static void main(String[] args) {
         //필요한객체생성
        // 사용자로부터 입력받는 객체생성
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 명의 학생이 수학 여행지를 입력하시겠습니까?");
        int num =0;
        //리스트 객체생성,수학여행에가는 학생 수 입력하는 for문
        List<String> FieldTripList = new ArrayList<>();

        num= scanner.nextInt();
        scanner.nextLine();
        for (int i=0 ; i < num; i ++){
            System.out.println((i+1) + " 번째의 학생 수학여행지입력>>>");
            String fieldtrip =scanner.nextLine();  //중점
            FieldTripList.add(fieldtrip);
        }
        System.out.println();
        //입력된 원본 데이터출력
        for(int i =0 ; i < FieldTripList.size(); i++ ){
            System.out.println((i + 1) + " 번 학생의 후보지 : " + FieldTripList.get(i));
        }

        //담을그릇을 만들기 수학여행지를 입력할학생의 그릇..
        //cnt를 정수의값으로 받겠습니다.
        //중복제거하기위한 set옮겨담기, set객체생성
        //1. HashSet<>()......?
        Set<String> FieldTripSet = new HashSet<>(FieldTripList);

        List<String> finalFieldTrips = new ArrayList<>(FieldTripList);


        // 사용자가 입력한 strList.size()의 for문
        System.out.println("수학여행의 후보지");
        for (String fieldtrip:FieldTripSet) {
            System.out.println(fieldtrip);
        }
        System.out.println("입니다.");


        }




    }

