package ch_13abstraction.abstract_classes;
    //추상메서드가 하나라도 잇으면 그 클래스는 추상메서드라고 지시해야함 abstract class
public abstract class Factory {
    //필드
    private  String name;

    //추상메서드
    public abstract void produce(String model);
    public abstract void manage();

    //getter.setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //고유메서드
    public  void showInfo(){
        System.out.println("공장의 정보를 출력합니다. \n 공장이름 :"+name);
    }
    }
