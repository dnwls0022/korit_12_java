package ch17_static.singleton_product.factory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;
//매개변수 전체를 요구하는 생성자를 자동 생성하는데 접근 제어자가 Private

@ToString
@AllArgsConstructor(access =  AccessLevel.PACKAGE)
public class SmartPhone {
    private String serialNumber;
    private String company;
    private String name;

}
