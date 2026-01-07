package ch_13abstraction.interfaces;

public class ChannelUpButton extends Button{
    //ChannelUpButton 올리기
    @Override
    public void onPressed() {
        System.out.println("채널을 한칸 올린다");
    }

    @Override
    public String onUp() {
        System.out.println("채널 올립니다.");
        return "";

    }
}
