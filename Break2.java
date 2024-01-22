package loop;
// break는 반복문을 즉시 종료하고 나간다.
public class Break2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; ; ) { // for 문은 조건이 없으면 무한 반복한다.
            sum = sum + i;
            if (sum > 10) { // sum > 10 조건을 만족하면 break를 사용해서 for 문을 나간다.
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
