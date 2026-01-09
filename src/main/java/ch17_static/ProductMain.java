package ch17_static;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(Product.getTitle());
        // 객체 생성을 하지않았지만 title정적변수를
        // 불러올수있다.
        // 롬복 사용시 : 클래스레벨에 @getter가 있더라도
        // 정적 변수 레벨에 추가적으로 @getter를
        // 적용.

        //객체생성
        Product product1 = new Product();
        product1.setName("아아");
        System.out.println(product1.getName());
        System.out.println("일반 필드 조회 :"+product1.getInstanceCnt());
        System.out.println("정적 필드 조회 :"+product1.getCnt());

        Product product2 = new Product();
        System.out.println("일반 필드 조회 :"+product2.getInstanceCnt());
        System.out.println("정적 필드 조회 :"+product1.getCnt());
        Product.setCnt(0);
        System.out.println("재고초기화 현재재고"+ Product.getCnt());

        product1.increaseInstanceCnt();
        System.out.println(product1.getInstanceCnt());

    }
}
