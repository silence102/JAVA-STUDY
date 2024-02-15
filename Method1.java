package method;
// 메서드 시작
// 프로그램 여러 곳에서 같은 계산을 여러번 반복해야 하는 경우 + 변경, 제거 등 모두 수정해야 하는 경우 -> 메서드 이용하기
public class Method1 {
    // 자바에서는 함수를 메서드라 한다. 메서드도 함수의 한 종류이다.
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + "연산 수행");
        int sum1 = a + b;
        System.out.println("결과 1 출력: " + sum1);

        System.out.println("====================");

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + "연산 수행");
        int sum2 = x + y;
        System.out.println("결과 2 출력: " + sum2);
    }
}
/*
    " 재사용 가능 "
    함수(function): 블랙박스와 같다(내부는 몰라도 된다). 함수를 호출할 때는 외부에서 필요한 값만 입력하면 된다.
    add 함수(덧셈 함수) : add(a, b) = a + b
    avg 함수(평균 함수) : avg(a, b) = (a + b) / 2
 */