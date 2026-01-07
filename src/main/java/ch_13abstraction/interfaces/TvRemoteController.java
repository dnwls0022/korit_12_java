package ch_13abstraction.interfaces;

public class TvRemoteController  {
    //필드선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        System.out.println("Tv 리모컨 객체가 생성되엇다");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    /*

     */

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();
    }

    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());

    }
}

