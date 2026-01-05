package ch11_arrays;

public class Array04 {
    private static int i;

    /*
        배열을 매개변수로 하는 메서드정의
        이젠 main에서  사용하ㅣ는 불측정 string배열을 argument(인수) 로하는 메서드를 호출햇을때
        string내부의 elements(원소)들을 한 줄로 출력하는 메서드정의
         */
    public static void main(String[] args) {
        String[] title = {"김일","김이","김삼"};

        System.out.println("첫 번째 사람: " + title[0]);

        /*
    실행 예
    김일/김이/김삼/
    이라고 콘솔에 출력하는 메인작성

     */
        for( int i = 0 ; i < title.length; i++){
            System.out.println(title[i] +"/");

        }
        System.out.println();
        Array04 array04 = new Array04();
        array04.printElements(title);
    }
    public void printElements(String[]names) {
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]+ "/");
        }
        System.out.println();
    }
            
}
