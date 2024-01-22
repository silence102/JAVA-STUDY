package loop;
// continue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다.
// break, continue는 반복문에서 사용할 수 있는 키워드다.
// while, do-while, for와 같은 모든 반복문에서 사용할 수 있다.
public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
