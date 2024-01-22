package loop;
// for 문은 초기화, 조건 검사, 반복 후 작업 등이 규칙적으로 한 줄에 모두 들어 있어 코드를 이해하기 쉽다.
// 특히, 반복을 위해 값이 증가하는 카운터 변수를 다른 부분과 명확하게 구분할 수 있다.
public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) { // 여기서 i가 카운터 변수이다.
            sum = sum + i;
            System.out.println("i=" + i + " sum=" +  sum);
        } // 반복 횟수에 직접적인 영향을 주는 변수부터, 값 증가, 또 조건식 활용까지 for (초기식; 조건식; 증감식) 구조를 활용해서 처리한다.
    }
}
