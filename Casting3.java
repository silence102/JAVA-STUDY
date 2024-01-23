package casting;
// 형변환을 할 때 작은 숫자가 표현할 수 있는 범위를 넘어서는 경우: 오버 플로우
public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue); // 출력:2147483647

        intValue = (int) maxIntOver; // 형변환
        System.out.println("intValue = " + intValue); // 출력:-2147483648
    }
}
/*
    오버플로우가 발생하는 것 자체가 문제 -> 오버플로우가 발생했을 때 결과가 어떻게 되는지 계산하는데 시간 낭비하면 안된다!
    오버플로우 자체가 발생하지 않도록 막아야 한다. 이 경우 타입을 int -> long으로 변경하는 식으로 문제 해결하면 된다.
 */