package method;
// main 에서 정의한 변수명과 메서드의 매개변수(파라미터) 변수의 이름이 같은 경우.
public class MethodValue2 {
// "자바는 항상 변수의 값을 복사해서 대입한다."
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 5
    }
    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); // 10
    }
}
/*
    각각의 메서드 안에서 사용되는 변수는 서로 완전히 분리된 다른 변수이다. 변수명이 같아도 완전히 다른 변수이다.
 */