package scanner.ex;
// 이름과 나이 반복
import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine(); //이전 코드에서 정수를 가져가고 남은 \n를 제거하기 위한 코드

            System.out.println("입력한 이름: " + name + ", 나이:" + age);
        }
    }
}
