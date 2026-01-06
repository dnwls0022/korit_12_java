package ch12_inheritance.product;
/*
깃허브에 완전판이 올라감
왜 오류가 발생하는지,어떻게 검증하는지 어려움을 겪을수있다,

부모 -자식의 상속관계가 성립되어있을때,
부모클래스에서 기본 생성자 없이 매개변수 생성자만 있다면
자식클래스에서 완벽한 기본 생성자를 만드는 것이 불가능하다

자식클래스의 객체를 생성 시 필수적으로 부모 클래스의 생성자를 호출하기 떄문
자식클래스에서 정의되지않은 일부 필드와 메서드를 어떻게 사용하냐 부모클래스의 객체를 생성한 다음에 자식 클래스에서 고유
필드와 메서드를 더하여 합치는 과정을 거친다

그래서 부모 클래스의 생성자 정의 방식을 따르지 않으면
자식 클래스에서 오류가 발생함

또한 어떤 객체를 생성할떈 저희는
A a = new A(); 방식으로 생성..
A a = new B(); 같은방식으로 생성하는 내용이있다,.
*/
public class Product extends  Item {
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
