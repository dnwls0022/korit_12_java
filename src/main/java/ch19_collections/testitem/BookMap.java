package ch19_collections.testitem;

import java.util.*;

public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가.
        Map<String, Integer> strMap1 = new HashMap<>();

        // 2.Map 객체생성 key값에 String value 값에 Integer
        while (true) {
            System.out.println("\n--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            //메뉴판 프롬포트
            int choose = scanner.nextInt();
            scanner.nextLine();
            //메뉴1.2.3.4를 받는 정수값 입력받기
            if (choose == 1) {
                System.out.println("새 도서명을 입력하세요 >>> ");
                String title = scanner.nextLine();
                //도서이름을 입력받음 다음줄에
                if (strMap1.containsKey(title)) {
                    //3. - 이미 존재하는 도서라면(containsKey로 확인) "이미 재고에 있는 도서입니다." 출력
                    System.out.println("이미 등록 되어 있는 도서입니다.");
                    //- 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
                } else {
                    //
                    System.out.println("재고 수량을 입력하세요");
                    int newCnt = scanner.nextInt();
                    if (newCnt < 0) {
                        System.out.println("재고는 음수가 될수 없습니다.");
                    } else {
                        strMap1.put(title, newCnt);
                        System.out.println(title + " 도서가 " + newCnt + "권 추가되었습니다.");
                    }
                }
            }
            else if (choose == 2) {
                System.out.println("재고입고 >>>");
                String title = scanner.nextLine();
                //- 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
                // map의 변수값을 strMap1으로 선언했으니까 Map의 변수가 String Title에서 존재하는지아닌지
                //여부를 묻는 containsKey
                if (strMap1.containsKey(title)) {
                    System.out.println(" 새로운 재고 수량을 입력하세요>>>");
                    int cnt = scanner.nextInt();
                    if (cnt < 0) {
                        System.out.println("재고는 음수가 될수 없습니다>>>");

                    } else {
                        strMap1.replace(title, cnt);
                        System.out.println(title + "도서가" + cnt + "권 추가되었습니다");
                    }
                }
            }
            else if (choose == 3) {
                System.out.println("--- 현재 재고 목록 ---");

                if (strMap1.isEmpty()) {
                    System.out.println("해당 도서가 재고에 없습니다.");
                } else {
                    Set<String> keySet = strMap1.keySet();

                    List<String> keyList = new ArrayList<>(keySet);

                    Collections.sort(keyList);
                    for (String K : keyList) {
                        int value = strMap1.get(K);
                        System.out.println("도서명 : " + K + " , 재고 수량 : " + value + "권");
                    }

                }

            }
            else if (choose== 4){
                System.out.println();
                break;
            }

        }
        scanner.close();
    }
}
