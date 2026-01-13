package ch17_static.singleton_product.factory;

import lombok.Getter;

/*
    방금 작성한 ProductView와 인터넷에서의 레퍼런스를 참조하여
    Samsung 클래스의 싱글톤 패턴을 작성하시오.
 */
public class Samsung {
    // 정적 field
    // 단순 이름ㅡ변수,객체 - instance 싱글톤에서는 단 하나의 객체를 담는 그릇이라고하고 관습적으로자주사용한다.
    // 그래서 클래스명을 가져온 samsung instance가된다.
    // private(보안) - 클래스 내부에서만 이 변수에 접근 가능하다 public이었다면 외부에서
    // 삼성인스턴스를 null줄수있거나 바꿀수있다...이걸 방지차원
    // static(공유: 딱 하나만) - 객체를 여러개만들어도 딱 하나만 존재한다.
    // 싱글톤 핵심은 '하나' 그래서 static을 붙이지않는다면 변수도 객체도 새로 생긴다......
    // static을 붙여야만 모든공장이 똑같은 instance만 바라보게된다.
    private static Samsung instance;

    // 일반 field
    @Getter
    private String company;
    private int serialNumber;
    // Factory(String name): 공장을 지을 때도 "공장 이름이 뭔지" 알려줘야 하니까 재료(name)가 들어갑니다.
    //
    //Samsung(): 삼성 본사는 세상에 딱 하나고, 이름도 'Samsung'으로 고정이죠? 생성되는 시점에 외부에서 따로 받아올 정보가 없기 때문에 비워두는 것
    //.....
    //**"본사가 알아서 스스로 태어날 테니 외부 개입은 사절한다"**
    private Samsung() {
        // - company  회사라는 변수에 값을 대입해야하는데 단순히 '삼성'이라고 하지않고 클래스이름을 자동으로 가져오게
        //나중에 클래스이름을 삼성전기로 바꿔도 이 코드는 수정없이 자동으로 바뀐이름을 가져온다.
        //getClass().getSimpleName() 두 코드 모두 힘을합친다.
        /*
        1) getClass(): "너 정체가 뭐니?"라고 묻는 것입니다. 현재 실행 중인 객체의 클래스 정보 전체 (결과: class Samsung)
        2) getSimpleName(): "그 이름 중에서 복잡한 거 빼고 딱 이름만 알려줘"라는 뜻입니다. (결과: Samsung)
        2. 필드 초기화 vs 생성자 초기화, 뭐가 좋을까?
        사실 이건 취향과 상황의 차이인데
        ① 필드에서 바로 초기화
           private int serialNumber = 20260000;
        언제 쓰나?: 모든 객체가 항상 같은 값으로 시작해야 할 때 씁니다.
        ② 생성자에서 초기화
        private Samsung() {
        serialNumber = 20260000;
        }
        조건부 설정이 가능합니다.

      언제 쓰나?: 객체가 생성될 때 외부에서 값을 받아오거나, 특정 계산이 필요할 때 씁니다.
      싱글톤 패턴에서는 둘 다 상관없습니다! 하지만 굳이 따지자면, 작성하신 것처럼 생성자에서 초기화하는 방식이 조금 더 "객체 지향적"인 느낌을 줍니다. 왜냐하면:

      getClass().getSimpleName() 처럼 메서드를 호출해서 나온 결과를 값으로 넣어야 할 때는 필드보다 생성자가 더 안전하고 깔끔

         */
        company = getClass().getSimpleName();
        serialNumber = 20260000;
        System.out.println("삼성 객체가 생성되었습니다.");  // 싱글톤 확인용
    }
    // getinstance메서드
    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }









}
