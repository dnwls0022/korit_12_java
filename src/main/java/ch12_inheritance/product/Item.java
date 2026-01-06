package ch12_inheritance.product;
/*
부모 클래스 item
클래스 product
실행클래스 productMain

Item클래스에
1.fiel 선언 private String name / private String category
2.AllArgsConstructor생성
3.setter getter생성
4. product상속

product클래스에
1. field 선언 private int price; / private int stock
2. AllArgsConstructor생성
3. 고유 field에 대한 Setter/getter 생성
 */
public class Item {
    private String name;
    private String category;


    //AllArgs Constructor생성

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }
    //고유 field에 대한 Setter/getter 생성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
