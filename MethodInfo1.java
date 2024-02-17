package method;

public class MethodInfo1 {

    public static void main(String[] args) {
        int info = information (3);
    }
    public static int information(int a) {
        System.out.println(a + "번 정보를 출력합니다.");
        return a;
    }
    public static int add(int a, int b) {
        // 메서드 본문, 실행 코드
        return 1;
    }
//  제어자  반환타입  메서드이름 (매개변수 이름) {               // 제어자(Modifier): public, static 과 같은 부분.
//        메서드 본문                                       // 반환 타입(Return Type): 메서드가 실행 된 후 반환하는 데이터 타입 지정.
//    }                                                   //     - 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 void 를 사용.
}                                                         // 메서드 이름(Method Name): 메서드 이름, 호출하는 데 사용.
                                                          // 매개변수(Parameter): 입력 값으로, 메서드 내부에서 사용할 수 있는 변수. 매개변수는 옵션.
/*                                                        // 메서드 본문(Method Body): 실제 메서드의 코드가 위치. 중괄호 {} 사이에 코드를 작성.
    [ 메서드 호출과 용어정리 ]
    메서드를 호출할 때는 메서드에 넘기는 값과 매개변수(파라미터)의 타입이 맞아야 한다. 물론 넘기는 값과 매개변수(파라미터)의 순서와 갯수도 맞아야 한다.
    ex) 호출: call("hello", 20)/ 메서드 정의: int call(String str, int age)

    인수(Argument): 여기서 "hello", 20 처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라 한다.
    실무에서는 아규먼트, 인수, 인자라는 용어를 모두 사용한다.

    매개변수(Parameter): 메서드를 정의할 때 선언한 변수인 String str, int age 를 매개변수, 파라미터라 한다.
    메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
    실무에서는 매개변수, 파라미터 용어를 모두 사용한다.

    * 인수라는 용어는 '인'과 '수'의 합성어로, '들어가는 수'라는 의미를 가진다. 즉, 메서드 내부로 들어가는 값을 의미한다. 인자도 같은 의미이다.
    * 매개변수, parameter 는 '매개'와 '변수'의 합성어로, '중간에서 전달하는 변수'라는 의미를 가진다. 즉, 메서드 호출부와 메서드 내부 사이에서
        값을 전달하는 역할을 하는 변술라는 뜻이다.
 */