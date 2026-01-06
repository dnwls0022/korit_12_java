package ch12_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Animal();
        animal.move();
        animal.setAnimalName("동물");
        animal.setAnimalAge(13);
        // Animal 클래스의 지시사항완료.
        Tiger tiger1 =new Tiger();
        tiger1.setAnimalName("호랑이");
        tiger1.setAnimalAge(1);
        System.out.println("이 호랑이의 이름은" +
                tiger1.getAnimalName()+"이고 나이는"+
                tiger1.getAnimalAge()+ "입니다.");
        tiger1.move();
        tiger1.hunt();
        tiger1.hunt("사료");
        //animal.hunt(); // 부모클래스는 자식클래스의메서드호출 x

        //tige1에 몸무게 1.4입력
        //호랑이 몸무게 1.4t
        //출력
        tiger1.setWeight(1.4);
        System.out.println(tiger1.getAnimalName()+"의 몸무게는"+tiger1.getWeight()+"살 입니다");
        System.out.println("..............");

        Human human1 =new Human();
        human1.move();
        human1.setAnimalName("우진");
        human1.setAnimalAge(26);
        System.out.println("안녕하세요 제 이름은"+ human1.getAnimalName() + "이고 나이는"+human1.getAnimalAge()+
                        "살입니다./n내년에는" + (human1.getAnimalName()+1) + "살이 됩니다");
        human1.read("자바 기초");
    }
}
