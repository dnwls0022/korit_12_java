package ch_13abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
         Factory factory1 = new Factory() {
            //추상클래스는 원래는 객체생성 x
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ ' + model +']을 생산합니다");
            }

            @Override
            public void manage() {
                System.out.println("가전제품공장을 관리합니다.");
            }
        };
        factory1.setName("임시공장"); // 원래 객체 생성을 못하는데 팩토리 객체가
        factory1.produce("모니터"); // 생성되었고, 메서드 호춣도된다.
        /*
         이상의 개념은 익명 클래스로  java.1 -> 이 해석은 자주쓰인다기 보다 추후 학습에서 람다식으로 대체되는
         경우가있다. (그리고 자바스크립트에서도 동일한 형식을 사용함)

         재사용하지않고 한번만, 즉 이 경우엔 팩토리메서드에서만 한 번 쓰고 지운다면 사용하기좋다

         우린 교육 상황이기 때문에 모든 클래스를 한 번 정의하고ㅓ 그걸로 객체 한 두게 만들고 치우는 경우가 없어서 모든
         것을 객체명 익명클래스로 정의...
         기본적으로 프로그램에서 동시에

         */
        //폰 팩토리 객체생성
        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");

        phoneFactory1.produce("아이폰 에어 2");
        phoneFactory1.manage();

        phoneFactory1.showInfo();

        /*
        상속과 합쳐서 생각...... 추상 클래스는 상속을 전제로 한다는 것을 알 수 있다. 하지만 자바 버전 업에 따라
        익명클래스를 통해 팩토리메인메서드에서만 임시적으로 쓸 수 있는 객체를 생성하는것이가능

        그리고 메서드 오버라이딩 경우 '재정의' 를 전제로 하고있기 때문에 부모 클래스와
        자식클래스이 메서드 호출 결과가'다르게' 굴러 갈 경우에만 오버라이드가 요구되고 동일한
        경우에는 그냥 부모 클래스의; 메서드를 호출하면된다.

        그러면  우린 부모클래스에만 적힌 메서드의 호출 방식과 리턴에 대해서 명확히 알아야 자식클래스에서 직접적으로 정의되지
        않은 메서드를 호출하고 원하는 결과값을 얻을수있다,

        만약 부모 클래스에 쇼 인포 메서드가 있는걸..모른다면 폰팩토리클래스에 별개의 쇼 인포메서드를 따로 정의했다.
         */

    }
}
