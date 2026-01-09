package ch15objects;

public class ObjectTest {
    private  String name;
    private  String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void  showinfo(){
        System.out.println("이름: "+name + "\n주소 :"  + address);


    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
/*
오브젝트 클래스에
오브젝트1객체를 기본생성자를 통해 생성하고 이름에김일/주소 부산연제구
showinfo()호출

object2 객체를 AllargsConstructor를 통해 생성하고 이름에 김이/ 서울 종로구 입력 showinfo()호출

 */