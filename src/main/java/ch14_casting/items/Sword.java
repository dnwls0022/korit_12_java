package game.items;

public class Sword implements Weapon {
    //어택재정의
    @Override
    public void attack() {
        System.out.println("검을 크게 휘두릅니다!");
    }
    //고유메서드 오버라이드x
    public  void parry() {
        System.out.println("검으로 적의 공격을 막아냅니다!");
    }



}
