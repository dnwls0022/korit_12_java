package ch19_collections;

import java.util.*;

/*
List는 순서가있고 중복허용
set은 순서는 없고 중복허용하지않음
list -> set 혹은 set -> list 로의 형변환필요
예로 list로 전체설문을 받고 set을 통해 중복을 제거하여  후보군만남기는 등의 형태로 사용.
도한 set으로 중복제거후다시 list 로 돌려서 .get으로조회가능
set은순서x

//집합의 개념이 확장된것이 set

그래서 set은 중1때 학습과유사.집합은숫자. set은다양한자료형기줕
 */
public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();

        List<String> stringList = new ArrayList<>();

        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        stringList.add("java");

        //set출력
        System.out.println(strSet);
        //중복제거
        System.out.println(stringList);

        //list element 등을
        strSet.addAll(stringList);
        System.out.println(strSet);
        for (String elem : strSet){
            System.out.println(elem + "언어");

        }
        //일반 for문은 실행 x  ->index가없어서

        //for (int i =0 ; i <strSet.size(); i++){
        //    System.out.println(strSet.get);

        // 중복제거 strSet에서 했기 때문에 중복 제거 버전을 다시 list로 옮길수잇음
        List<String> modifiedList = new ArrayList<>();
        modifiedList.addAll(strSet);
        System.out.println(modifiedList);
        Collections.sort(modifiedList);
        System.out.println(modifiedList);

    }
    }

