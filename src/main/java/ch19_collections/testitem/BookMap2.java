package ch19_collections.testitem;

import java.util.*;

public class BookMap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer>book = new HashMap<>();
        book.put("java프로그래밍입문",2);
        boolean endOfProgram = false;
        String bookTitle;
        while (!endOfProgram) {
            System.out.println("--도서재고관리프로그램--");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");

            int option = scanner.nextInt();
            scanner.nextLine(); // nextint가 있으니 배리어필요
            switch (option){
                case 1 :
                    System.out.println("새 도서명을 입력하세여 >>>");
                     bookTitle = scanner.nextLine();

                    if(book.containsKey(bookTitle)){ // true 면 있는책
                        System.out.println("이미재고에 있습니다.");
                    }else { // 일치하는 책이 없을때 실행되는조건문
                        System.out.println("재고수량입력");
                        int cnt = scanner.nextInt();
                        scanner.nextLine();
                        book.put(bookTitle,cnt);
                        System.out.println(bookTitle+"도서가"+ cnt + "권추가되었습니다,");

                    }
                    break;
                case 2:
                    //case 는 뒤에 ;아닌 :이다
                    System.out.println(" 수량을변경할 도서명입력>>>");
                    String bookTitle1 = scanner.nextLine();
                    if(book.containsKey(bookTitle1)){ // true 면 있는책
                        //기존가이드풀이
                        System.out.println("\n 새로우재고수량입력>>>");
                        int cnt = scanner.nextInt();
                        scanner.nextInt();
                        book.replace(bookTitle1, cnt);


                        //
                        System.out.println("재고 변경문입력 >>>");
                        int temp = scanner.nextInt();
                        int stock = book.get(bookTitle1)+temp;
                        System.out.println(bookTitle1+"도서가 "+stock+"권으로 변경되었슴.");
                        book.put(bookTitle1,stock);
                        // 추가수정사항 책이팔리면 내가-1입력 --book

                    }else { // 일치하는 책이 없을때 실행되는조건문
                        System.out.println("해당재고가도서에없음");
                    }
                    break;
                    //switch는 다  1,2,3 끝날때마다 break써야하나?
                case 3:
                    Set<String> bookTtitleSet =book.keySet();

                    List<String> bookTitles = new ArrayList<>();
                    bookTitles.addAll(bookTtitleSet);
                    for (String books : bookTitles){
                        System.out.println("도서명"+ books + "현재재고"+ book.get(books));

                    }
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    endOfProgram =true;
                    break;  //case의 break; switch 문만빠져나오고 while문만빠져나오지않기때문.
                default:
                    System.out.println("잘못된선택");
            }
            //2번메뉴를 재고입고, 3번메뉴를 재고출고로변경
            // 입고선택시 입고량을 입력받아 기존재고에 +시키고
            /*
            출고선택시출고량을입력받아 기존재고에서 -> - 한다

            하지만 출고량이 기존재고본보다 초과일경우재고가충분하지않습니다.라는
            출력문을안내하고 다시메뉴선택
            // 다시메뉴선택 으로 돌아갈수있도록 수정 return ;
            System.out.print("메뉴를 선택하세요 >>> ");
            book3a만들어서

             */
        }

    }
}
