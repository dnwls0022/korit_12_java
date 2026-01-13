package ch19_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // Array와 차이점
        //선언방식
        String[]strArray = new String[5];  // 배열 선언 및 초기화
        // 리스트자료형인 내부엘레먼트엔 스트링만들어감, 리스트이름은 STRLIST 어레이리스트의 생성호출해서 객체만듬
        // 리스트선언방식 및 초기화
        List<String>strList = new ArrayList<>();
        // AA = NEW B

        // Array의 차이
        //배열
        strArray[0] = "김영";
        strArray[4] = "김사";
        // list는 메서드를 경유해야함
        strList.add("java");
        strList.add("c");
        strList.add("python");
        strList.add("java script");
        strList.add("c++");
        strList.add("c#");
        // 순서가 보장되어있기때문에 집어넣은 순서대로 값이 들어감
        // 그리고 최초에 list방의 개수를 정하지않음 방이알아서늘어남

        // Array차이점 3 출력방식
        // strArray츨력
        System.out.println(Arrays.toString(strArray));

        System.out.println(strList);

        //Array차이점 3 삭제방식
        strArray[0] = null;
        //그런데 리스트는 생각하면 인덱스넘버가 고정x
        String removeElen1 = "java script";
        boolean isRemoved = strList.remove("java script");
        System.out.println(removeElen1 + "삭제 여부 : "+ isRemoved);
        System.out.println(strList);

        //차이점 array경우 null값을 대입.
        // 0번지가 null이고 여전히 5개짜리 방을 가지고있다.
        // 근데 list의 경우 삭제하니까 아에방이 4개로 줄어듬

        // 정렬방법
        //배열은 Array
        Collections.sort(strList);
        System.out.println(strList);
        //내림차순
        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println(strList);

        /*
        특정엘리먼츠  검색 리승트내와ㅣ
         */

        String searchElements = "python";
        boolean contains1 = strList.contains(searchElements);
        System.out.println(searchElements + "포함여부" + contains1);

        String searcgElements2 = "py";
        boolean contains2 = strList.contains(searchElements);
        System.out.println(searchElements + "포함여부" + contains2);

        /*
        이 list는 엘리먼츠가 명확하게 일치하는지확인
        그래서 py는 python이라는 string데이터의 일부 element전체를 의미x fasle 값이나옴

         strarray에 김0,1,2,3,4,로 넣기
         strarray를 일반 for문으로 출력 결과가 김0님 김1님 ....김4님으로 나오도록
         strarray를 향상된 for문으로작성 김0학생...김4학생 나오도록
         */
        //list는 size쓰기

    for (int i = 0 ; i < strArray.length; i++){
        strArray[i] = "김"+ i;
        System.out.println(strArray[i] + "님 /");


    }
        System.out.println();
    for (String elem : strArray){
        System.out.println(elem + "학생 - ");

    }
        System.out.println();
    // list 는 index추출시에 리스트명.size쓴다. length아님

        // for문으로 strlist를 java안에 / python안에 등으로 출력
        //향상된 for문으로 java공부 / python공부 / c공부 .... 로출력..

        for (int i = 0; i< strList.size(); i++){
            System.out.print(strList.get(i)+ "  ");

        }
        System.out.println();

        for (String elem    : strList){
            System.out.println(elem+"공부");
        }
        System.out.println();


        /*
        이상의 경우에서 배열일 때는 구경도 향상된 for문의장점.
        내부의 인덱스 지정을 .length쓰는데 .size를 쓰는지;등을 고려하지않아도 된다는 점. 출력할때 인덱스넘버를 사용하는갯을 사용하는지등을
         고려하지않아도됨
         */
    }


}
