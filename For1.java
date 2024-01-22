package loop;
// for 문도 while 문과 같은 반복문, for 문은 주로 반복 횟수가 정해져 있을 때 사용한다.
// for 문 장점: 개발자가 루프 횟수와 관련된 코드와 나머지 코드를 명확하게 구분할 수 있다.
public class For1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // for (1. 초기식; 2. 조건식; 4. 증감식)
            System.out.println(i);      // 3. 코드
        }                               // 1 ~ 4 까지 순서대로 실행된다. (조건식이 거짓이면 for 문을 빠져나간다.)
    }
}

