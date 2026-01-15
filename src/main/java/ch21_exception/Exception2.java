package ch21_exception;

import javax.security.auth.login.LoginException;

class  LoginFailedException extends Exception{
    public LoginFailedException(String message) {
        super(message); //메시지를 인수로 한 로그인실패예외 슈퍼클래스 생성자를 호출한다는것
        System.out.println("로그인 시 오류가 발생하였습니다.");

    }
}
/*
Exception(String message) {
this.message =message;
}
47번라인의 getter(getMessage()) 를 통해서 출력했기 때문에 콘솔상의순서가다르게보임
 */
//예외도 클래스다
public class Exception2 {
    //메서드정의1
    public static void login(String id, String password)throws  LoginFailedException {
        String connectid = "admin";
        String connectPassword = "1a2b3c4d!!";
        //특정 메서드에서 발생하는 것을 지정하고 싶다면 THOROW 명령어를 입력하여야한다.
        if(id.equals(connectid)|| !password.equals(connectPassword)){
            throw new LoginFailedException("로그인실패 : id또는pw가틀림");
            //Throw s없음 :동사원형으로 시작했으니 명령문
            //LoginFailedException 생성자에 string argument 를 집어넣어서 객체생성
            // 그객체를 던지라는의미로해석
        }
    }
    //메인메서드
    public static void main(String[] args) {
        String inputid = "admin";
        String inputpassword = "1234eaeww!!";

        // login (inputid,
         // throws달고다니 오류발생 트라이캐치파이널리 써야함
        try {

            login(inputid, inputpassword);
        }   catch (LoginFailedException e){
            System.out.println("" + e.getMessage());

        }finally {
            System.out.println("프로그램 종료");
        }
    }
}
