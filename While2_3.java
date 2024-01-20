package loop;
// 새로운문제: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)
// 과제: 코드가 실행되는 횟수를 유연하게 변경할 수 있어야 한다. -> 같은 코드를 반복 실행할 수 있어야 한다.
public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 5;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
/*
    좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다.
    변경 사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은 코드이다.
 */