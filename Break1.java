package loop;
// break는 반복문을 즉시 종료하고 나간다.
// break, continue는 반복문에서 사용할 수 있는 키워드다.
// while, do-while, for와 같은 모든 반복문에서 사용할 수 있다.
public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
