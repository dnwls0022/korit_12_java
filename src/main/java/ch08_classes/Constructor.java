package ch08_classes;


    /*  생성자
    생성자는 객체가 생성될떄 호출되는 특별한 '메서드'
    객체생성예시
    클래스명 객체명 = new 쿨래스명();
    Classexample example = new calssexample();
    :사실 calssexample(); 가 생성자에 해당된다.

    public class constructor
    특징:
    1.클래스의 이름과 생성자의 이름은 동일하다.
    (다른 메서드들과 달리  파스칼 케이스로 작성되고.그리고 메서드는 동사로 시작되는데 예는 클래스
    이름이랑 똑같으니까 명사임.
    2. return값이 없다. call1, call2유형으로 생각됨
    3. 객체 초기화 : 생성자는 객체의 필드, '초기화'를 담당.

    생성자 정의 형식 :
    1.기본생성자 :  매개변수가 없는 생성자
    (얘는 쿨래스를 만들떄 디폴트값으로 생성되기 때문에 정의하지 않아도 될떄가있다. car~~만들지않았다. 즉 디포ㅓㄹ트로 생성된
    기본 생성자를 이용하여 객체를 생성했습니다.
    2. 매개변수 생성자: 하나 이상의 매개변수를 가지는 생성자
    */


public class Constructor {
    //필드선언
    int num;
    String name;

    /*

     */
    //기본 생성자
    public Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    //매개변수 생성자
    public Constructor(int number) {
        System.out.println("RequiredArdsConstrctor(int 매개변수를 필요로 하는 생성자)");
        this.num = number; //this : 해당클래스에서 객체를 생성하게 되면 객체 이름으로 대체된다.
    }

    public Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자");
        this.name = title;  // this.필드명 = 매개변수;
    }

    public Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("AllArgsConstructor(int, String 매개변수를 필수로 요구하는 생성자)");
    }
    // 이것도 뭐 AllArgsContructor긴한데 저는 이거까지 고려하는 분이랑
    // 같이 일하기 싫습니다... Builder 패턴에서 비슷한거 학습할 예정
    public Constructor(String name, int num) {
        this.num = num;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(name + " 학생의 번호는 " + num + " 번 입니다.");
    }
}


/*
지시 사항 # 1
        String title을 매개변수로 하는 생성자를 정의하고,
        RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을
        출력할 수 있도록 작성한 뒤
        ConstructorMain으로 가서 constructor4라는 객체명을 지니고, title에 "김사"으로
        이름 붙이고 객체를 생성한 후,
        System.out.println(contructor4.name);을 입력하여 콘솔에 "김사"를 출력하시오.

        지시 사항 # 2
        int num, String name을 매개변수로 하는 생성자를 정의하고
        AllArgsConstructor(int, String 전부를 매개변수로 요구하는 생성자) 라는 안내문을
        출력할 수 있도록 작성한 뒤
        ConstructorMain으로 가서 contructor5라는 객체명을 지니고, 5, "김오"라고
        값을 대입한 객체를 생성한 후
        sout(constructor5.num);
        sout(constructor5.name);
        을 출력하시오.
        지시사항 3
        Car.java  파일 내에있는 displayinfo() 메서드를 참조하여
        Constructor5.displayinfo();를 호출했을 경우
        김오 학생의 학번은 5번 이다.
        틀 큰
 */
