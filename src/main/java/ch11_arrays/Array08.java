package ch11_arrays;
/*
 향샹된 for문 (enhanced for loop)

 일반 for문 과의 차이점:
 일반 for문의 경우 index넘버를 명확히 알고 있어야 하지만 일일이
 element의숫자를 세는것이 번거롭기 때문에
 arr01.length와 같은 일종의 field참조를 통해 int 값을 추출하여 대입해야햇음.

 for부분에서 int i는 for문 내부에서만 선언되고, 내부에서만 사용가능

 이를 응용하여 배열 내의element에 for문 내부에서만 사용하는 변수에 대입하는 방식을
 사용하여 index 넘버의 사용없이 적용할수있는 for반복문이 있다. 이를향상된 for문이라함.

 읽기만가능,쓰기x

 for(자료형 변수명 :반복가능객체(배열)){
 반복실행문
 }
 */
public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        //1~200  숫자대입
        // 일반 for문 12345...200

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.println(nums[i] + " ");
        }
        System.out.println();
        //향상된 for문
        // for(자료형 변수명 : 배열명) {반복실행문}
        for (int number : nums) {      //자료형 변수명... 선언했다고볼수있다.
            System.out.println(number + "");
        }
        System.out.println();
        // 오류발생! System.out.println(number);
        /*
        1. 첫번째 단락에서 nums 의 첫번째 element인 1을  number에 대입 ->초기화
        number =1 ; 이 됐다.



       ...
       nums의 199번지에 있는 200이 number에 재대입된다.

       -number를 for문밖에서 쓰면 구문오류가난다-

       String배열에 김일,김이,김삼,김사,김오 라는 element(원소)를 가지도록 초기화 하고(배열명name)
       일반 for문으로  김일,김이,김삼,김사,김오 출력
       향상된 for문으로 동일하게출력
       */
        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "/ ");
        }
        System.out.println();
        System.out.println("--------------------");

        //향상된
        for (String name : names) {
            System.out.println(name + "/");
        }

    /*
    ex)
    1번 : 김일
    2번 : 김이
    3번 : 김삼
    4번 : 김사
    5번 : 김오
    로 출력되도록 일반 for / 향상된 for
    */
        String[] persons = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + "번 :" + persons[i]);
        }
        //향상된 for
        int i = 0;
        for (String person : persons) {
            System.out.println(++i + "번 : " + person);


        }

    }

}






















