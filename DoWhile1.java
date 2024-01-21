package loop;
// 해당 반복문은 조건이 만족되지 않아 어떠한 값도 출력하지 않는다.
public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;

        while (i < 3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
