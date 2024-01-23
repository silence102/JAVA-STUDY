package casting;
// 형변환1 - 자동 형변환
/*
    자바에서 숫자를 표현할 수 있는 범위: int < long < double
    "작은 범위에서 큰 범위로 대입은 허용한다.
 */
public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
/*
    int -> double로 바뀌는 것을 형변환이라고 하는데 원래는 개발자가 직접 해야하는데 // ex) doubleValue = (double) intValue;
    자바에서는 작은 범위 숫자 타입에서 큰 범위 숫자 타입으로 변환을 자동으로 해준다. // ex) doubleValue = intValue;
    이를. 자동 형변환 또는 묵시적 형변환이라고 한다.
 */