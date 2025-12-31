package ch11_arrays;

import ch10_access_modifier.bank.Bank2;

public class Arrays01 {
    public static void main(String[] args) {
        int[] arr01 = {1, 2, 3, 4, 5};

        for(int i =0; i<5; i++) {
            System.out.println(arr01[i] + "번 ");
        }
         //이상의 코드를 실행해봤을때 확인이 불가능한 이유는 베열 내부의 값을 확인할수있다.
        // 고려했을때 주소지만 출력된다
        /*
        배열 내부에 다수의 데이터가 있기 때문이다. 콘솔창에서 전체 확인이 불가능하다.
        요소
        즉 element를 확인하기 위해서는 배열 내부로 직접탐색하는 과정이필요
        이때 필요한 개념이 index이다.
        */

        System.out.println(arr01); //주소값만 츌력
        System.out.println(arr01[0]); // 주소값만 출력
        System.out.println(arr01[1]); // 배열명의 형태로 내부 확인가능
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]); // index는 0부터 시작

        //for문 사용해서 arr01에 있는 내부 요소를 출력
        //실행예
        //1 2 3 4 5
        //출력
        //배열의 element개수를 알고있을 때에만 작성이 가능하다
         // int 배열에서는 length사용!!!!!!!******
        //컴퓨터가 직접 한계값을 구해서 알아서 출력하도록 명령을 내릭 필요가있다.
        // *배열명 . lenth ; 문자열데이터 .lenth();
        int[] arr02 = {1,3,4534,5345,35,434,424,43,4,3455,5,534,};

          for(int i =0; i<arr02.length; i++ ){
              System.out.println(arr02[i] +" / ");

          }
         /*
         빈 배열 생성
         자료형1[] 배열명 = new 자료형1[개수];
         미리 개수를 지정해주어야함

         배열 내부의 방 개수/ 주소지의 한계값 - 1을 우리가 항상 알고있는 것이 아니기 떄문에 엘리먼츠값을 출력하기 위한 한계값을 설정할때
         배열명 length를 습관화

          */
        System.out.println();
        int[] arr03 = new int[10];
        System.out.println(arr03[0]);
        //10r개 짜리 비어있는 배열 생성
         // int로 선언했기 때문에 초기화를 하지않는다 - 0

        arr03[0]= 10;
        arr03[1]= 20;
        arr03[2]= 30;
        //처음값을 대입하더라도 int arr03[0] = 10;아님
        //즉 배열을 선언한다는것은 내부의 인덱스넘버를 포함하여 컴퓨터가 알아서 선언 작업을 마친다.
        //arr03[0] 과 같은 부분은 그냥 인트변수를 선언하고 거기에값을 대입함.

        System.out.println(arr03[0]);
        int[] arr04 = new int[40];
        // 이상의 빈 배열에 41부터 80까지 값을순서대로 대입
        //41 42 43.... 80



          //
        System.out.println();
        String[] arr05 = {"안","녕","하","세","여"};
         for (int i=0; i<arr05.length ; i++){
             System.out.println(arr05[i]);

         }


    }



}
