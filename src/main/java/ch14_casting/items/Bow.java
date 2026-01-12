package game.items;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("검을 크게 휘두릅니다!");
    }

    public void snipe() {
        System.out.println("멀리 있는 적을 저격합니다!");
    }


}
