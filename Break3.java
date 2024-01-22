package loop;
// break2를 개선해서 for 문의 장점을 극대화한 코드 작성
public class Break3 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) { // for 문은 조건이 없으면 무한 반복한다.
            sum = sum + i;
            if (sum > 10) { // sum > 10 조건을 만족하면 break를 사용해서 for 문을 나간다.
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
// for 문 없이 while 문으로 모든 반복을 다룰 수 있다.
// 하지만 카운터 변수가 명확하거나, 반복 횟수가 정해진 경우에는 for 문을 사용하는 것이 구조적으로 더 깔끔하고, 유지보수 하기 좋다.