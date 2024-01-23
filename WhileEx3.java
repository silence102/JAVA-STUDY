package loop.ex;
// max 값이 더한 합 구하기: while 문
public class WhileEx3 {

    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
