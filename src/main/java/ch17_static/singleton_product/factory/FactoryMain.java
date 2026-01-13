package ch17_static.singleton_product.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("제 1 공장");
        Factory factory2 = new Factory("제 2 공장");
        Factory factory3 = new Factory("제 3 공장");
        Factory factory4 = new Factory("제 4 공장");

        // 현재 우리 코드의 소소한 문제점
//        SmartPhone smartPhone1 = new SmartPhone("임의의 공장", "임의의 스마트폰 객체", "임시 넘버");
//        System.out.println(smartPhone1);
        // 공장을 통하지 않고 스마트폰 객체를 생성할 수 있습니다.
        // 이상의 이유 : @AllArgsConstructor를 적용했는데 걔는 기본적으로 public입니다.
        // 그래서 @AllArgsConstructor(access = AccessLevel.PACKAGE)로 수정해주면 11 번 라인이 오류가 발생합니다.

        SmartPhone phone1 = factory1.produceSmartPhone();
        SmartPhone phone2 = factory2.produceSmartPhone();
        SmartPhone phone3 = factory3.produceSmartPhone();
        SmartPhone phone4 = factory4.produceSmartPhone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
    }
}
/*
어떤 공장에서 메서드를 호출했는가와 상관없이
create serial number 메서드를 호출한 결과가 단일한 삼성객체에서 비롯된다는것을 알 수 있다. 싱글톤때문
그레ㅐ서 다수의 공장 객체에서 각각 producesmartphone메서드를 호출하더라도 일원화된 시리얼넘버부여가가능.................
 */
