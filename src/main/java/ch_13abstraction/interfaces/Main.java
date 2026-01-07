package ch_13abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        // PowerButton powerButton = new PowerButton();
        //ChannelDownButton channelDownButton = new ChannelDownButton();
        // ChannelUpButton channelUpButton = new ChannelUpButton();
        // powerButton.onPressed();



    /*
    버튼들을 만들어서 메인에서 객체생성을 한 후에 메서드를
    호출은 가능
    메인에서 매번 객체를 생성해줘야한다.
    생성자 : 객체를 호출할때 특별한메서드
     */
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton()
        );
    /*
    리모컨.....................객체의 ARGUMENT로 POWERBUTTON생성자를 집어넣음.
    생성자의정의는 : 객체를 생성할떄 호출되는 특별한 메서드 이므로 NEW POWERBUTTON(), 을 통해서 객체가 생성 되었다,.,,
    하지만 객체명이 없는 상태...

    tvRemoteController클래스를 확인해보시면
    THIS.POWERBUTTON = powerButton이라 되어있다..
    이는 argument로 들어온 New powerbutton()이 매개변수인 powerbutton powerbutton으로 치환,,,
    그것이 tvRemoteController 의 필드인 powerbutton에 대입된다.
     */

        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();


        System.out.println(tvRemoteController.onUpChannelUpButton1());
        tvRemoteController.onUpChannelUpButton2();
        tvRemoteController.onPressedPowerButton();


        //중괄호 범위, 대소문자 , 메인과 연결된클래스의 객체명이 서로 맞는지 필수체크
    }
}



