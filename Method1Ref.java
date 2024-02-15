package method;
// 자바에서는 함수를 메서드라 한다. 메서드도 함수의 한 종류이다.
// 메서드 -> 단순히 무언가를 정의해두고 필요할 때 불러서 사용한다는 개념으로 이해하기.
// * ref: refactoring 줄임.
public class Method1Ref {

    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력: " + sum1);

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과 2 출력: " + sum2);
    }

    // 메서드 정의
    public static int add(int a, int b) { // method declaration 메서드 선언: 반환 타입/ 메서드 이름/ 매개변수(파라미터)
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
/*
    public static int add(int a, int b)
    public static
        - public: 다른 클래스에서 호출할 수 있는 메서드.
        - static: 객체를 생성하지 않고 호출할 수 있는 정적 메서드.
    int: 반환 타입 정의. 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정
    add: 메서드에 이름을 부여. 이 이름으로 메서드를 호출할 수 있다.
    (int a, int b): 메서드를 호출할 때 전달하는 입력 값을 정의. 이 변수들은 메서드 안에서만 사용된다.
        - 메서드 선언에 사용되는 변수를 영어로 파라미터(parameter), 한글로 매개변수라 한다.
 */
/*
    메서드 본문(Method Body)
    {
        System.out.println( .... );
        int sum = a + b;
        return sum;
    }
    메서드가 수행해야 하는 코드 블록이다.
    메서드를 호출하면 메서드 본문이 순서대로 실행된다.
    메서드 본문은 블랙박스다. 메서드를 호출하는 곳에서는 메서드 선언은 알지만 메서드 본문은 모른다.
    메서드 실행 결과를 반환하려면 return 문을 사용해야 한다. return 문 다음에 반환할 결과를 적어주면 된다.
 */
/*
    완성된 메서드 호출하기 int sum = add(5, 10); => int sum = 15;
    - 메서드 호출이 끝나면 해당 메서드가 반환한 결과 값으로 치환된다.

 */