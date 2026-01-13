package ch18_generic.wildcard;

public class Main {
    //메서드정의
    /*
    animaldata에서는 field로 들어온 객체가 animal 클래스의 서브클래스인지아닌지 구분할수없기때문에
     */
    //접근제어자 리턴타입 메서드명 매개변수
      //      리턴타입 매개변수있으니 call4
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            //애니멀데이터 클래스 휴먼클래스에집어넣고 객체명은 애미널데이터
            // ==뉴애니멀데이터 뒤에는 생성자
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return  animalData;

        } else if (flag ==2 ) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;

        }
        return null;
    }








    public static void main(String[] args) {
      AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
      AnimalData<Human> animalData2 = new AnimalData<>(new Human());
      AnimalData<Car> animalData3 = new AnimalData<>(new Car());
      /*
      AnimalData에 Car객체가 animal field에 들어가있지만 문제가 되지 않습니다.
      그렇다면 animal field에 타이거/휴먼/카 객체가들어가있다. main에서확인 x
       */

      animalData1.showData();
      animalData2.showData();
      // animalData3.showData(); 오류발생
        // 왜냐 애니멀클래스를 확인해야함. animal이라고 형 변환을 시키는부분때문.
        // car를 animal로 형변환시킬수 있는근거없는상태

        // .getanimal 메서드호출
        Main main = new Main();
        //와일드카드적용
        // 이클래스가 뭔진모르지만 애니멀을 상속받아야만함
        AnimalData<? extends  Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends  Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends  Animal> animalData6 = main.getAnimal(100);

        animalData4.showData();
        animalData5.showData();
        // animalData6.showData();
        System.out.println("animalData4");
        System.out.println();

        System.out.println("----필드에 널 대입");
        AnimalData animalData100 = new AnimalData<>(null);
        if (animalData100 == null){
            System.out.println("내부값없음");
        } else {
            System.out.println("객체는있는데 값없음");
        }

        System.out.println(animalData100.getAnimal());
        animalData100.setAnimal(new Car());
        System.out.println(animalData100.getAnimal());
    }
}
