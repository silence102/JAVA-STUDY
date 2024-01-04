package variable;

public class Var6 {

    public static void main(String[] args) {
        int a; // 지역 변수 선언
        // System.out.println(a); // 초기화 없이 실행 // 주석 풀면 컴파일 오류 발생
            // 해당 에러를 해결하지 않으면 다른 예제를 실행 할 때에도 에러가 발생할 수 있다.
        /*
            컴파일 에러 발생
            java: variable a might not have been initialized
            -> 변수가 초기화 되지 않았다는 오류
         */
    }
}
// 컴퓨터 메모리는 여러 시스템이 함께 사용하는 공간이다.
// 그래서 어떠한 값들이 계속 저장된다.
// 변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다.
// 그런데 그 공간에 기존에 어떤 값이 있었는지는 아무도 모른다.
// 따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다.
// => 이런 문제를 예방하기 위해 자바는 변수를 초기화 하도록 강제한다.