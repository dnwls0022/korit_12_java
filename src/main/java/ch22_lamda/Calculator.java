package ch22_lamda;
@FunctionalInterface
public interface Calculator {
    //내부에 추상메서드가 단 하나인 인터페이스에서만 람다식사용
    int compute(int a, int b);
}
