package scope;
// 스코프를 사용해야 하는 이유: 1. 비효율적인 메모리 사용 2. 코드 복잡성 증가
// Scope3_1을 개선한 코드
public class Scope3_2 {

    public static void main (String[] args) {
        int m = 10;
        if (m >  0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

// temp 라는 변수를 생각해야하는 범위가 줄어듬.
// Tip. Ctrl + N: 파일 빨리 찾기
// Tip. Ctrl + E: 이전 파일 이동
// while vs for 문: for 문이 초기식을 이용해 카운터 변수 선언해서 스코프 범위 제한 가능, while 문은 불가능.
/*
    변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자.
    메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있다.
    좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
 */