package casting;
// 큰 범위의 숫자를 작은 범위로 형변환 하는 경우: 명시적 형변환은 가능
public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; /// (명시적) 형변환
        System.out.println(intValue); // 소수점 이하의 숫자는 사라진다.
    }
}
