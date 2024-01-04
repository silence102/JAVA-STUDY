package variable;
// 변수 타입(형): 정수(int), 실수(double), 불리언(boolean0, 캐릭터(char), 스트링(String)
// 자신의 타입에 맞는 값을 사용해주기. 그렇지 않으면 컴파일 오류 발생.
// int a = "100"; // 정수가 들어갈 자리에 String 타입이 들어가서 발생한 오류.
// java: incompatible types: java.lang.String cannot be converted to int
public class Var7 {

    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리언(boolean)    true, false 입력 가능
        char d = 'A'; // (character) 문자 하나
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입
        // 변수에 할당되는 문자, 글자는 리터럴(literal)이라고 한다.
        // 변수의 값은 변할 수 있지만 개발자가 입력한 고정된 값인 리터럴은 변하지 않는다.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        // Tip. ctrl + D 키를 누르면 한 줄을 다 복사, 붙여넣기 한다
    }
}
