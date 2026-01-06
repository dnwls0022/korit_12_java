package ch12_inheritance.product;

public class ProductMain {
    public static void main(String[] args) {
        // Item 클래스 건드리지말고 getter이용해서 다음과 같은 추력문이 나오도록
        // 이 상품은 일반 상품입니다.
        //이 상품은 일반 카테고리입니다.
        //System.out.println("이상품은 일반 상품입니다"); //오답!!

        /*
        product 클래스의 인스턴스인 product 생성
        이름 -> 전자제품
        카테고리 ->가전제품
        가격_> 100000
        재고 ->10 으로 생성

        setter 이용해서 가전제품 백색가전제품으로 바꾸고

        getter활용 해당제품은 백색 가전 제품.
         */
        Item item1 = new Item("일반상품","일반 카테고리");
        System.out.println();







        Product product1 = new Product("전자제품", "가전제품",100000, 10);
        product1.setCategory("백색가전제품");
        System.out.println("해당제품은"+ product1.getCategory()+"입니다.");



















    }
}
