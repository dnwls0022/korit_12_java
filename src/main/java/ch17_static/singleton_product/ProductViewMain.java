package ch17_static.singleton_product;

public class ProductViewMain {
    public static void main(String[] args) {


        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();



        System.out.println(ProductView.count);
        System.out.println(ProductView.getInstance().toString());

        //


        /*
         다양하게 검증했을때
         getInstance()메서드는 생성자를 호출하는 method이기 때문에 기본적으로 호출함수만큼
         객체가 생성되어야한다.

         하지만 내부에 조건문을 통해 하나의 객체라도 생성되어있다면 해당 객체를 리턴하게끔 작성되어있기 때문에 걀과적으로 생성자가호출되는횟수는
         1고정
         */

    }
}
