package method;
// 메서드 호출과 값 전달 1
public class MethodValue0 {
// "자바는 항상 변수의 값을 복사해서 대입한다." -> 이 개념을 명확히 알고 있는 것이 중요하다.
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
