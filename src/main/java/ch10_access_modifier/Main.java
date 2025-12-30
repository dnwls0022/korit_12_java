package ch10_access_modifier;

class AccessModifierExample { // 간판 클래스는 public이 명시되어야한다.

    //field
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }

}

public class Main {
    public static void main(String[] args) {
        //객체 생성 :default class객체 생성 가능
        AccessModifierExample example = new AccessModifierExample();
        //field 조회
        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
        System.out.println(example.getPrivateVar());
    }
}











