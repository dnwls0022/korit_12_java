package ch18_generic.bmi;

import ch14_casting.animal.Dog;

public class PesonMain {
    public static void main(String[] args) {
        // 1. Person 객체 생성
        Person person = new Person("김일", 180.0, 80.0);

        // 2. Bmi 객체 생성
        Bmi bmiCalculator = new Bmi();

        // 3. BMI 계산 호출
        double bmiResult = bmiCalculator.calcBmi(person);

        // 4. 결과 출력 호출
        bmiCalculator.printResult(person, bmiResult);
    }
}
      //




















