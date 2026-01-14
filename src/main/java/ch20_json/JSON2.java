package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
class  User{
    private  String username;
    private  String password;
    private  String email;
    private  String name;
    private  String age;
}
public class JSON2 {
    public static void main(String[] args) {
        //객체생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        //하나는 한줄 /하나는 pretty pringting 적용한 버전 보여주기위해두개생성

        /*
        user1객체 생성, kim1/ 9876/a@test.com/김일/20 의 필드명을 가지도록하고
        json클래스참조하여 json데이터로바꾸기
         */

        User user1 =new User("kim1","9876","a@test.com","김일","20");
        String jsonData1 = gson.toJson(user1);
        String jsonData2 = gsonBuilder.toJson(user1);
        System.out.println(jsonData1);
        System.out.println(jsonData2);

        /*
          map자료형은 -> json데이터로 바꾸는것도가능
          productmap1생성
          "productCode", "",
          "productname" "아이폰16프로맥스"로만들기

          map에 key value값을 가지고있으니
          json의 property로 일대일대응가능
          map생성
         */

        Map<String,String> productMap1 = new HashMap<>();
        productMap1.put("productCode","");
        productMap1.put("productname","아이폰16프로맥스");

        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct1);
        System.out.println(jsonProduct2);
        /*
            tojson()이라는 메서드는 argument로 java script 자체를 넣는것도 map으로 생성된 entry를 json형태로
            바꾸는 것도 가능하다는 것을 확인할수있다. jsonobject객체도 바꿀수있다.

            반대로 json -> map / java object로 바꾸는 것도가능

            string data 인json " " 포함해서 생성하는게 귀찮기때문에 user1과 productmap1을 json으로 바꾼 데이터로 바꾸기

            jsondata2를 user2객체로 변경... string -> user 로 바꾸는것임
            jsonproduct2를 product로 바꿈

         */
        //CLASS자료형으로 해줘야함
        User user2 =gsonBuilder.fromJson(jsonData2, User.class);
        System.out.println(user2);
        Map<String,String> productmap2 = gson.fromJson(jsonProduct1, Map.class);
        System.out.println(productmap2);

        // jsondata1 /2 를 usermap1으로 바꿀수있다.
        // field :fieldvalue

        // jsonProduct1/ 2는 java Object 로 바꾸지못함 -> 클래스 정의 x


        // json클래스참조하여 json데이터로바꾸기
        //User user1 =new User("kim1","9876","a@test.com","김일","20");
        //String jsonData1 = gson.toJson(user1);
        /*
           jsondata1을  map자료형의 usermap1으로변경
           콘솔에출력
         */
        Map<String, String> usermap1 = gson.fromJson(jsonData1,Map.class);
        System.out.println(usermap1);

        //map.class???
        List<User>users =new ArrayList<>();
        users.add(user1);
        System.out.println(users);
        String jsonusers = gsonBuilder.toJson(users);
        System.out.println(jsonusers);



    }
}
