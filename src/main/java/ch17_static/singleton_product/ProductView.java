package ch17_static.singleton_product;

public class ProductView{
    //정적변수선언 -field
    //싱글톤 패턴만들떈 정적변수이름이 instance
    // 정처기 24.1 실기시험 field명 힌트
    //클래스명.~~~  instance 필드명
    //형식이 정해져있다
    private static  ProductView instance;
    static int count=1;

    //
    private ProductView(){
        int cnt =1;
        System.out.println(cnt + "번 째 객체 생성");
        cnt++;
        System.out.println("정적 변수 참조"+count+ "번 째 객체 생성");
        count++;

    }
    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return  instance;
    }

}
