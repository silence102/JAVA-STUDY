package operater;
// 증감 연산자: 증가 및 감소 연산자를 줄인 말. (++, --)
// 변수의 값을 1만큼 증가시키거나 감소시킨다.
public class OperaterAdd1 {

    public static void main(String[] args) {
        int a = 0;
        
        a = a + 1;
        System.out.println("a = " + a); // 1

        a = a + 1;
        System.out.println("a = " + a); // 2

        // 증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " + a); // 3
        ++a; // a = a + 1
        System.out.println("a = " + a); // 4
    }
}

