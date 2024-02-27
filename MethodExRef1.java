package method.ex;
// 평균값 리펙토링
public class MethodExRef1 {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,20,25));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
/*
    메서드를 활용하면 좋은점
    - 전체 구조를 한눈에 볼 수 있다.
    - 메서드로 구조가 명확하게 분리되었기 때문에 변경 사항이 발생하면 쉽게 수정이 가능하다.
    + 메서드 추출(Extract Method): 일반적인 복잡한 코드 -> 메서드를 활용하여 리팩토링 하는 것

    => 메서드를 재사용하는 목적이 아니더라도 적절하게 사용하여 분류하면 구조적으로 읽기 쉽고 유지보수 하기 좋은 코드를 만들 수 있다.
 */