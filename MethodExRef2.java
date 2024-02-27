package method.ex;
// 반복 출력 리펙토링
public class MethodExRef2 {
    public static void main(String[] args) {
        String message = "Hello World!";
        printMessage(message,3);
        printMessage(message,5);
        printMessage(message,7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++)
            System.out.println(message);
    }
}
