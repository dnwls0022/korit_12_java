package ch08_classes;
/*
 car의인스턴스 mycar객체생성
 color 빨강, speed에 160 대입
 mycar는 drive메서드 호출
 yourcar는 brake 메서드 호출
 my car, your car에 각각 display메서드 호출
 */
public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();
        myCar.color = "빨강";
        myCar.speed = 160;
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.brake();
        myCar.displayInfo();
        yourCar.displayInfo();

    }
    }













