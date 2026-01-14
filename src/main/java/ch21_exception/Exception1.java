package ch21_exception;

import java.util.List;


/*
        예외? Exception
        : 개발자가 예측할수있지만
        그에 대한 대비를 할 수 있는 것들을 예외
        오류 Errror?
        : 개발자가 예측가능하지만
        해결할수없거나 예측불가능한것을 모두 정의

        모든 자료형이 클래스 형태로 정의되는 JAVA의 특성 상 자주 일어나는 예외클래스들은 이미 정의를 해놓았다.
 */
public class Exception1 {
    public static void main(String[] args) {
        //int [] ints = new int [5];
        //ints[5] = 3;
        //int a =10;          // 피지수??? no 이젠 나누어지는 수

        //int b =0;           // 지수?? no 이젠 나누는 수
        //double result = a/b;
        //System.out.println(result);

        // int c = 0.123;
        //System.out.println();

        /*
               고전적 형태의 예외처리 방식  -> if문 사용

         */
        /*Scanner scanner =new Scanner(System.in);
        System.out.println("나누어지는 정수를 입력하시오 >>>");
        int a = scanner.nextInt();
        System.out.println("\n나누어지는수를 입력");
        int b = scanner.nextInt();
        // 그러면 개발자가 나누는 수를 0으로 입력할것을 예쌍할수있기때문
        if(b==0){
            System.out.println();

        }else {
            int result = a / b;
            System.out.println(result);
        }
        System.out.println("나눌수없음");

            /*
             예외 처리를 적용한 방식의 코딩 try / catch / finally
             */

       /* int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("결과: " + result);
            //cath오류발생ㅅ기 특정오류를 ㅋ태치문내에작성
            // 수학적예외 e객체  e객체에대한 메시지 갯메서드 스트링자료형  객체.갯메시지라는 것을 호출
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수없음" + e.getMessage());
        } finally {
            System.out.println("얘는에러가발생하든말든 끝에실행된다");
        }
        // ai가 다른클래스에 있는 것까지 오류로그까지 복사
        // finally 는 스위치에서 디폴트와같음

            /*
            왜 예외처리를 하는가?
            : 프로그램을 실행할때 빨갛게되는데......... 가 아니라 프로그램이 정상 종료됨을 보증하기 위하여..
            프로그램정상종료
        */


        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int a = 10;
        int b = 5;
        //시도해봐 nums의 배열을 getter로 불러와서 5번째배열을 가져오도록!
        try {
            int result = a / b;
            System.out.println("결과: " + result);
            System.out.println(nums.get(5));
            //오류를 캐치해  오류는 인덱스의범위가 예외야 이걸 e객체라고 해 e객체의 메시지를출력해
            // ArrayIndexOutOfBoundsException??배열의인덱스값의 경계값범위를 벗어났다는예외?를 캐치했어
        }
        catch (ArithmeticException e) {
            //이걸 e객체라고 해 e객체의 메시지를출력해
            System.out.println(e.getMessage());
            //수학적계산오류를 e라고하고 e객체의 메시지를출력해
        }catch (Exception e){
            System.out.println("알림: 배열의 범위를 벗어난 오류가 발생했습니다.");
            System.out.println("원인: " + e.getMessage());
            throw  new RuntimeException();
        }

            // 예외  e를 발견했는데 이건 내가 발견만했고 최상위의예외클래스에게 던져줄테니 너가해결해줘

        // 캐치문은 나열할수있다.
        // 마지막으로 오류출력하지말고 그 오류를 프로그램정상종료라고 표현해줘
          finally {
            System.out.println("프로그램 정상 종료");
        }

        // try /catch/ finally 를 사용하여 e.getmessage()를 출력하고
        // finally 파트에서는 "프로그램 정상종료라고출력.



        /*
        이상의코드에서 중요한것은 catch문이 복수로 나올수있다.
        예를 들어 catch()사용할때 순서를고려할필요가있다
        leapyear 관련할때 가장 촘촘한 조건을 앞에 위치시킨것
         */







    }

}
