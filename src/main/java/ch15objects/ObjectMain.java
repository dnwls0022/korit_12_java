package ch15objects;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectTest object1 = new ObjectTest();
        object1. setName("김일");
        object1. setAddress("부산 연제구");
        ObjectTest object2 = new ObjectTest("김이", "서울종로구");
        object1.showinfo();
        object2.showinfo();
        System.out.println(object1);
        System.out.println("일반");
        System.out.println(object1);
        System.out.println("--------equals-------");


        String example = "인냥";

        boolean result1 = "안녕하세여" == example;
        System.out.println(result1);

        String[] strArray = {"안녕","안녕안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2);
        System.out.println(result3);

        ObjectTest test1 = new ObjectTest("안녕하세요", "안녕");
        boolean result4 = "안녕하세요" == test1.getName();
        System.out.println(result4);
        boolean result5 = strArray[0] == test1.getName();
        boolean result6 = strArray[0] == test1.getName();
        System.out.println(result5);
        System.out.println(result6);

        String example2 = new String("안녕하세요");
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);
        String example3 =new String(example);
        boolean result8 = example3 == example;
        System.out.println(result8);

        boolean result71= "안녕하세요".equals(example2);
        System.out.println(result71);
        boolean result81= example3.equals(example);
        System.out.println(result81);



    }
}
