package ch19_collections.testitem;
import java.util.*;
public class Meeting {
    public static void main(String[] args) {
           //set을 사용해서  String 데이터인 participant을
           // HashSet: "가장 빠르게 데이터를 찾을 수 있는 기술(Hash)을 쓴" 실제 제품에 저장
           // <> 안이 비어있는 이유는 왼쪽(SET<String)을 보고 스스로 맞춰넣음
           Set<String> participant = new HashSet<>();
           // 2. 사용자로부터 참석자 이름을 계속해서 입력 받을 예정
           Scanner scanner = new Scanner(System.in);
           // 3. --- 모임 참석자 명단 관리 ---
           //    [ 종료 ] 라고 입력하면(equals) 프로그램을 종료합니다.
           System.out.println("  --- 모임 참석자 명단 관리 ---");
           System.out.println("  [ 종료 ] 라고 입력하면 프로그램을 종료합니다. ");
            // 4. 사용자로부터 참석자 이름을 계속해서 입력 받는중
            while (true) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String name = scanner.nextLine();

            //5. 종료 라고 입력하면 더 이상 이름을 입력받지 않음.
                //항상참이니까 무한루프 밑에서 언젠가 끝내줘야함
                if (name.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다");
                break;
                }

            // 6. 입력 받은 이름을 Set에 추가
                // list명.add(name)
                participant.add(name);

            //7. 최종 모임 참석자 명단을 콘솔에 출력
                System.out.println("\n ----최종 참석자----");
                System.out.println(participant);

                int a =1;
                int b= 2;

                int temp =a;
                a =b;
                b=temp;
                System.out.println(a);
                System.out.println(b);
            }
    }
}


