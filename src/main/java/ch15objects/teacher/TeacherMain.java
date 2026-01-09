package ch15objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 =new Teacher("우진", "코리아아카데미");
        Teacher teacher2 = new Teacher("ㅇㅇ", "아카데미" );
        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);



        /*
         재정의 전과 후가 절대값이 다르다.
         티처에서 .equals를 재정의하기전엔 false가 뜸.
         그땐 티처와 티처2의 주소지까지 확인하여 같은지 아닌지 여부를 확인했다ㅓ면 재정의이후엔 필드에비력ㄱ된
         */
        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        System.out.println(tClass.getSimpleName());
        System.out.println(teacher1.getClass().getSimpleName());

        Field[] fields = tClass.getDeclaredFields();

        System.out.println(fields);

        //두가지 방법필드확인

        //1.반복문사용 2. Arrays사용
        System.out.println(Arrays.toString(fields));
          for (int i =0; i < fields.length; i++){
              System.out.println("필드명 출력 :" +fields[i].getName());
              System.out.println("패키지 명 :"+fields[i].getType());
              System.out.println("클래스 명 출력 :"+fields[i].getType().getSimpleName());
          }

         for (Field field : fields){
             System.out.println("필드명 출력 : " + field.getName());
             System.out.println("패키지 명 :"+field.getType());
             System.out.println("클래스 명 출력 :"+field.getType().getSimpleName());
         }

        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods){
            System.out.println("메서드 명 출력:"+method.getName());
            System.out.println("리턴타입출력:"+ method.getReturnType());
            System.out.println();
        }
    }
}

