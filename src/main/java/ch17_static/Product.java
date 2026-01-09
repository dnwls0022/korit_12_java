package ch17_static;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Product {
    //field선언
    private String name;
    private int instanceCnt=0;
    @Setter
    @Getter
    private static int cnt =0;
    @Getter
    private static String title = "제품입니다.";
    public Product() {
        System.out.println("Product클래스의 객체가 생성되었다");
        instanceCnt++;
        cnt++;


    }
    public void increaseInstanceCnt(){
        System.out.println("현재 : "+ getInstanceCnt() +  "에서" + (++instanceCnt) +"로 증가되었다.");

    }

}

