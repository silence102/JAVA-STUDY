package scanner.ex;
// 홀수 짝수 구하기
import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("입력한 정수 " + number + "는 짝수입니다.");
        } else {
            System.out.println("입력한 정수 " + number + "는 홀수입니다.");
        }
    }
}

