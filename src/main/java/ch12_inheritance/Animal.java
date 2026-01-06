package ch12_inheritance;
/*
상속을 지시하는 키워드 extends

 */

public class Animal {
    private String animalName;
    private int animalAge;

    //기본생성자하나 매개변수생성자 하나짜리 두개
    public Animal() {
    }
    //AnimalConstructor 생성자 하나 생성
    public Animal(String animalAge) {
        this.animalName = getAnimalName();

    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    //getter /setter 생성

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //animal 메서드고유메서드정의



    public void move(){
        System.out.println("움직입니다.");


    }

}