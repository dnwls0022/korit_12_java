package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        //제이슨오브젝트객체생성
        //속성 (키 - 값 쌍)을 추가하는메서드 -> addProperty()메서드
        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "r김일");
        jsonObject1.addProperty("name", 4.5);
        jsonObject1.addProperty("score", 3);

        System.out.println(jsonObject1);


        /*
        map과 차이
        1.  map에서는 key에 ""이 없었고 json에서는 모든 key에
        string자료형처럼 보이도록 ""이 있다.
           따로 " "를 안썻는데 " " 자동출력
        2. map에선 큰솔창에서 출력될때 key1=value로 ==표기되었지만
           json에선 "key1:value1의 형태로작성
           따로 : 를 안썻는데 : 자동출력
         */
        jsonObject1.addProperty("job","대학생인턴");
        System.out.println(jsonObject1);
        jsonObject1.addProperty("job","대기업정규직부럽다...");
        System.out.println(jsonObject1);
        /*
        컴퓨터에서 콘솔에 출력한 결과를 확인했을때, json결과값이 한 줄로 늘어져있다.
        가독성을 개선하는 방법으로 출력하기도한다
        컴퓨터가 읽기 편한 방식이 아니라 사람이 읽기 적합한 형태로 출력하는 것을 pretty printing이라함

         */
        // 데이터공유형언어독립형포맷 json
        //제이슨의 자식클래스의객체만듬 셋프린티프린티메서드실행크리에이트메서드실행 결과값 실행이 Gson....힘들면외우기
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //json 은 자ㅣ료형 string
        // 전체가 스트링인데이터로바꿔주세요 tojson
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
    }
}
