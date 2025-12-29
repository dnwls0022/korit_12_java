package ch08_classes;

public class constructor {
    /*  생성자
    생성자는 객체가 생성될떄 호출되는 특별한 '메서드'
    객체생성예시
    클래스명 객체명 = new 쿨래스명();
    Classexample example = new calssexample();
    :사실 calssexample(); 가 생성자에 해당된다.

    public class constructor
    특징:
    1.클래스의 이름과 생성자의 이름ㄴ은 동일하다.
    (다른 메서드들과 달리  파스칼 케이스로 작성되고.그리고 메서드는 동사로 시작되는데 예는 클래스
    이름이랑 똑같으ㅜ니까 명사임.
    2. return값이 없다. call1, call2유형으로 생각됨
    3. 객체 초기화 : 생성자는 객체의 필드, '초기화'를 담당.

    생성자 정의 형식 :
    1.기본생성자 :  매개변수가 없는 생서ㅗㅇ자
    (얘누ㅡㄴ 쿨랴수룰 먼둘떄 디폴트값으로 생소ㅓㅇ되기 때문에 정의하지 않아도 될떄가있다. car~~만들지않았다. 즉 디포ㅓㄹ트로 생성된
    기본 생성자를 이용하여 객체를 생성했습니다.
    2. 매개변수 생성자: 하나 이상의 매개변수ㅠ를 가지는 생성자ㅣ
    */


    public class Constructor {
//필드선언
        int num;
        String name;
        /*

         */

        public Constructor() {
            System.out.println("NoArgsConstructor(기본생성자)");
        }
        public Constructor(int number){
            System.out.println("RequiredArdsConstrctor(int 매개변수를 필요로 하는 생성자)");
            this.num = number;
        }







    }
}
