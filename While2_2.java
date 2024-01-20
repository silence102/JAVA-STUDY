package loop;
// 문제: i부터 하나씩 증가하는 수를 3번까지 더해라 (i ~ i+2 더하기)
// i 값을 변경하여 간편하게 더하는 값을 변경할 수 있다.
public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
    }
}
/*
    좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다.
    변경 사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은 코드이다.
 */