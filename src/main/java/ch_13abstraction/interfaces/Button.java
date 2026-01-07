package ch_13abstraction.interfaces;
/*
    클래스는 단일 상속만 가능한데, 키워드는 extends
    인터페이스는 다중 상속(구현)이 가능합니다. 키워드는 implemen키ts
 */
public abstract class Button implements Press, Up, Down {
    //클래스명  Press, Up, Down


    @Override
    public void onDown() {

    }

    @Override
    public void onPressed() {

    }

    @Override
    public String onUp() {
        return "";
    }
}
