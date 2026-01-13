package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;


    /*
    현재 animaldata의 필드인 애니멀에 애니멀 클래스의 상속을 받은 타이거/ 휴먼 객체를 필드에 대입.

    T엔 어떠한 클래스도 들어갈수없다. 현재상황에선 카 클래스의 객체도 애니멀에 들어갈수없다.

    특정 클래스라면(animal 클래스의 상속을 받은 서브클래스라면) 해당 클래스에 맞는 객체정보를 출력.
     */
    public void showData(){
        ((Animal) animal). move();
        // T에는 아무 클래스나 들어갈수있다. 애니멀부분은 애니멀로형변환!!.
        //
        if(animal.getClass() == Human.class){
            //형변환
            // 올바른 코드
            ((Human) animal).read();


        } else if (animal.getClass() == Tiger.class) {
            ((Tiger) animal).hunt();
        }else  {
            System.out.println("아직고유메서드가 없거나 애니멀의 서브클래스가아님");

        }
    }
}
