package method;
// 자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다.
public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,1);
    }
    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }
    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
