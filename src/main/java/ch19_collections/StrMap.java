package ch19_collections;

import java.util.*;

/*
Map 은 KEY- value pair / 쌍/entry ...

 */
public class StrMap {
    public static void main(String[] args) {
        //Map초기화

        // 키의자료형과 vlaue의 자료형을고정시키기위해 k,V가노옴
        Map<String, String> strMap1 = new HashMap<>();
        // KEY- value 삽입 메서드

        strMap1.put("kor2026001", "김일");
        strMap1.put("kor2026002", "김이");
        strMap1.put("kor2026003", "김삼");
        strMap1.put("kor2026004", "김사");
        strMap1.put("kor2026005", "김오");
        System.out.println(strMap1);
        //같은
        strMap1.put("kor2026005", "kimfive");
        System.out.println(strMap1);

        //key하나 당 value는 하나... 같은 key지정 value입력
        //가장최근걸로 덮어쓰기된다.
        //map 빈 맵 초기화 선언. 경유. 제네릭을 두개쓴다. key안엔 value하나만드갈수있다.

        //MAP<학생의이름, 더블에 배열>...
        Map<String, Double[]> Koreanscore = new HashMap<>();
        Koreanscore.put("김일", new Double[4]);
        //더블은 클래스
        Map<String, Double> Koreanscore1 =new HashMap<>();
        Koreanscore1.put("김일", 94.8);
        Koreanscore1.put("김이", 94.8);
        Koreanscore1.put("김삼", 94.8);
        Koreanscore1.put("김사", 94.8);
        //
        Koreanscore1.put("김오",44.4 );

        Koreanscore1.replace("김육", 76.2);
        System.out.println(Koreanscore1);


        /* 두가지 방법이 존재하는 이유는 .put()의 경우 기존에 key가 존재한다면
        value에 재대입하면되지만. 없는 key라면 새로 생성한다.

        반면. .replace()의 경우 존재하지않는 key라면 value의 계산이 일어나지않는다.
        key가 존재할때만value값이변경된다,.

         */
        //    (map)명사. 동사 목적어
        //            .containeskey() -> boolean  t/f
       //특정 키 존재여부
        // boolean을이용해서 searchkoreaFlag1가 strMap1에 "kor2026001"이 존재하는지 판별하는 코드
        // containsKey containsKey는 단어 뜻 그대로 **"이 키(Key)가 포함되어 있는가?"**를 물어보고
        // 참(true) 또는 **거짓(false)**으로 대답해 주는 메서드입니다.
        // *SET은 중복제거 LIST중복가능
        boolean searchkoreaFlag1 = strMap1.containsKey("kor2026001");
        System.out.println("kor2026001 존재여부 : "+ searchkoreaFlag1);

        boolean searchvalueFlag1 = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("kor2026003")+ "존재여부 :"+ searchvalueFlag1);

        //
        Set<Map.Entry<String,String>> entrySet1 = new HashSet<>();
        //Set 하나 생성하는데 , 내부의 key가 =String ,Value, String ,Map
            // Set<Map.Entry<String,String>> 로 정의했기 때문에 뒤에 strMap1에도 stringe두번
        Set<Map.Entry<String,String>> entrySet2 = strMap1.entrySet();

        // strMap1의 자료형은 당연히 Map . entrySet()의 경우에
        // 자동완성된이유는 그렇게선언했기때문 ... intellj 에서 support라고함
         // strMap1.entrySet()의 호출결과가 일종의 형변환으로이루어진로직
         //해당 자료형으로  return해서 entrySet2 이라는 객체데이터를 담았다고볼수있다.
        System.out.println(entrySet2);
         // Map은 Set으로 바꿨다먄 ...... Set-> List 로 형변환가능

        // Map List 러 바꾸고싶다면 List에 있는 Method도 쓸수있음
        // .sort등일 이용가능

        //key출력
        Set<String> KeySet = strMap1.keySet();
        System.out.println(KeySet);

        // Vlaue Set???

       // Set<String>valueSet = strMap1.values();

        /*
        Key는 출력이안되기 때문에 Set으로 변환하더라도 데이터의 손실이없고 각 Key의 value들은 중복값이 있을 수도
        있기 때문에 그것을 set자료형으로 변경할경우
         */

        Collection<String>values = strMap1.values();
        System.out.println(values);
        //

        /*
        Collections 은 .sort할 때 써봤지만 Collection은 처음이다.
        return 힐땐 다음에 직접써야함..
        */







    }
}