package ch_13abstraction.interfaces;

public class ChannelDownButton extends Button{
    // ChannelDownButton  내리기
    //오버라이드 오버로드 재정의
    // on은
    // 클래스는 단일 상속만 가능한데, 키워드는 extends
    //    인터페이스는 다중 상속(구현)이 가능합니다. 키워드는 implement 부모클래스에 상속가능한 (인터페이스)자식클래스는 extends써서
    //    다중상속가능하다. but일반클래스는안된다.
    @Override
    public String onUp() {
        return super.onUp();
    }

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 내린다");

    }
    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }
}
