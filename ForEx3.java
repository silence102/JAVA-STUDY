package loop.ex;
// max 값까지 더한 합 구하기: for 문
public class ForEx3 {

    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
