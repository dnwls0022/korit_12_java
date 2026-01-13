package ch18_generic.bmi;

public class Bmi {
    // 메서드 정의 시에는 '='를 쓰지 않고 바로 소괄호를 엽니다.
    public double calcBmi(Person person) {
        // cm 단위를 m 단위로 변환
        double mHeight = person.getHeight() / 100;

        // BMI 공식 적용하여 결과 리턴
        return person.getWeight() / (mHeight * mHeight);
    }

    public void printResult(Person person, double bmi) {
        String status = "";

        if (bmi < 18.5) {
            status = "저체중";
        } else if (bmi < 23) {
            status = "정상";
        } else if (bmi < 25) {
            status = "비만전단계";
        } else if (bmi < 30) {
            status = "1단계 비만";
        } else if (bmi < 35) {
            status = "2단계 비만";
        } else {
            status = "3단계 비만";
        }

        System.out.println(person.getName() + " 님의 키는 " + person.getHeight() +
                " cm, 몸무게는 " + person.getWeight() + " kg, bmi 지수는 " +
                String.format("%.2f", bmi) + " 으로 " + status + "입니다.");
    }
}