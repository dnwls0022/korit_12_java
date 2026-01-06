package ch12_inheritance;

public class Tiger extends Animal{
    //자식고유의 필드하나정의
    private double weight;

    public Tiger(){

    }

    public Tiger(String animalName, int animalAge, double weight) {
        super(animalName, animalAge);
        this.weight = weight;
    }

    public Tiger(int animalAge, double weight) {
        super(animalAge);
        this.weight = weight;
    }

    //자식클래스 고유메서드
    public void hunt(){
        System.out.println(getAnimalName() + "이 사냥을 합니다");
    }
    //고유메서드 오버로드
    public void hunt(String prey) {
        System.out.println(getAnimalName() + "이"+prey+ "을 사냥합니다");

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }




    @Override
    public void move() {
        System.out.println("호랑이가");
        super.move(); //super .메서드명()
        // super -부모클래스의 임의의 인스턴스를의미
         //@오버라이드 되어있는 부분은 상위 클래스로 부터 상속받은 메서드임을의미
        // 아에없으면 고유메서드
        //클래스에 없는 메서드를 호출한다면 부모클래스의 메서드를 그대로씀
        //오버라이드가 있다면 부모클래스의 메서드호출
        //재정의가되어있음

        //tiger 클래스에서 기본 생성자 및
        //모든 필드를 다 사용하는 생성자를정의



    }
}
