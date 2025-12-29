package ch07_methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Method08StarWriting3 {
    public static String getStar() {
        String result = "";
        // 사용할 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 선언
        int row = 0; // 몇 줄짜리 만들건지
        int choice = 0;     // 증가하는 별인지 감소하는 별인지 etc
        String starResult = ""; // 별은 String 자료형이라서 이런식으로 선언 및 초기화

        System.out.print("몇 줄 짜리 별을 생성하시겠습니까? >>> ");
        row = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까? >>> ");
        choice = scanner.nextInt();
        // 이제 여기서부터 switch문으로 개조할 예정입니다.
        switch (choice)
        {
            case 1:
                for ( int i = 0 ; i < row + 1 ; i++ ) { // 여기 한계값이 i < row+1입니다.
                    // 별을 책임지는 안쪽 for문
                    for( int j = 0 ; j < i ; j++ ) { // i = 0, j = 0 일때 별이 안찍혀서
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for ( int i = 0 ; i < row ; i++ ) {
                    for ( int j = 0 ; j < row - (i + 1) ; j++ ) {
                        result+="  ";
                    }
                    for ( int k = 0 ; k < i + 1 ; k++ ) {
                        result+="🎈";
                    }
                    result+="\n";
                }
                break;
            case 3:
                for ( int i = 0 ; i < row ; i++ ) {
                    for ( int j = row ; j > i ; j-- ) {
                        result+="😊";
                    }
                    result+="\n";
                }
                break;
            case 4:
                for ( int i = 0 ; i < row ; i++ ) {
                    for ( int j = 0 ; j < i ; j++ ) {
                        result += "  ";
                    }
                    for ( int k = row ; k > i ; k-- ) {
                        result += "❤️";
                    }
                    result += "\n";
                }
                break;
            default :
                result = "불가능한 메뉴 입력입니다. 1 - 4 사이의 정수만 입력해주세요.";
        }
        return result;
    }


    // method 호출 영역
    public static void main(String[] args) {
        System.out.println(getStar());
    }

 {

    boolean continued = true;
    while(continued){
        System.out.println(getStar());
        System.out.println("계속하시겠습니까? Yes? 1, 아니면 0을 선택하세요. >>> ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
         switch (answer) {
             case 1:
                 break;
             case 2:
                 continued = !continued;
                 break;
             default:
                 System.out.println("불가능한 선택입니다. 0과 1 중에 선택");
                 continued = !continued;
         }
         }




    }



}














//Classes -> ClassA - 얘는 main없음 / ClassAMain - 얘는 main적용
