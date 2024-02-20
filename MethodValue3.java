package method;
// changeNumber 메서드를 호출해서 두배를 곱한 수를 입력 받을 수 있도록 변환하기. (원래 목적)
public class MethodValue3 {
// "자바는 항상 변수의 값을 복사해서 대입한다."
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }
    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
/*
    각각의 메서드 안에서 사용되는 변수는 서로 완전히 분리된 다른 변수이다. 변수명이 같아도 완전히 다른 변수이다.
 */