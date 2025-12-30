package ch08_classes.product;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();

        product1.productNum = 123456;
        product1.productName = "엘지엘패드";

        Product product2 = new Product(987654);
        product2.productName = "다이소충전기";

        Product product3 = new Product(159357);
        product3.productName = "USB 케이블";
        product3.showInfo();

        Product product4 = new Product(951753);
        product3.productName = "GFlip6 ";
        System.out.println("AllArgsConstructor(int, String 매개변수를 필수로 요구하는 생성자)");
        }
    }

