package operater;
// 연산이 복잡한 경우에는 보기 편하게 괄호를 씌워주는게 편함.
// 개발에서 가장 중요한 것은 단순함과 명확함이다.

public class Operater4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
/*
    연산자 우선순위 암기법 (실무에서도 우선순위를 암기하지는 않는다, 이해만 해두자!)
    1. 괄호 ()
    2. 단항 연산자(예: ++, --, !, ~, new, (type))
    3. 산술 연산자(*, /, % 우선, 그 다음에 +, -)
    4. Shift 연산자(<<, >>, >>>)
    5. 비교 연산자 (<, <=, >, >=, instanceof)
    6. 등식 연산자 (==, !=)
    7. 비트 연산자(&, ^, |)
    8. 논리 연산자 (&&, ||)
    9. 삼항 연산자(? :)
    10. 대입 연산자 (=, +=, -=, *=, /=, %= 등등)

    [ 1. 상식선에서 우선순위를 사용하자 ]
    [ 2. 애매하면 괄호()를 사용하자 ]
 */