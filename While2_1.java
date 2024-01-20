package loop;
// 1부터 하나씩 증가하며 더하는 원초적인 코드 예시
public class While2_1 {

    public static void main(String[] args) {
        int sum = 0;

        sum = sum + 1;
        System.out.println("i=" + 1 + " sum=" + sum);

        sum = sum + 2;
        System.out.println("i=" + 2 + " sum=" + sum);

        sum = sum + 3;
        System.out.println("i=" + 3 + " sum=" + sum);
    }
}
/*
    좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다.
    변경 사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은 코드이다.
 */