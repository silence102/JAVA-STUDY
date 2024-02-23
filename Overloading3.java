package method;

public class Overloading3 {
// 두 메서드 이름은 같지만 매개변수의 유형이 다르다.
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));
    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    } // 해당 메서드를 삭제해도 아래 메서드로 위에서 호출한 둘 다 실행됨
    // => 먼저 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고, 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행.
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
