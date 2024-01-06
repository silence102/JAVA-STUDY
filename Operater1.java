package operater;
// 산술 연산자: +(더하기) -(빼기) *(곱하기) /(나누기) %(나머지)
// 연산자(연산 기호)와 피연산자(연산 대상)

public class Operater1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b =  7

        // 뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // int 형은 정수이기 때문에 정수 이하의 표현을 할 수 없다.
        System.out.println("a * b = " + div); // 5/2 -> 2.5 => 2 출력
        // * 숫자는 0으로 나눌 수 없다. ex) 10 / 0 -> 오류 발생

        // 나머지
        int mod = a % b; // 나눈 값의 몫이 아닌 나머지가 출력된다.
        System.out.println("a % b = " + mod);
    }
}
// Tip. Shift + f10: 코드 실행
/*
    연산자 종류: 산술 연산자, 증감 연산자, 비교 연산자, 논리 연산자, 대입 연산자, 삼항 연산자
 */