package operater;
// 대입 연산자(Assignment Operator): =
// 축약(복합) 연산자: +=, -=, *=, /=, %= -> 산술 연산자와 대입 연산자를 한번에 축약해서 처리
//  i = i + 3 -> i += 3
//  i = i * 4 -> i *= 4
public class Assign1 {

    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8 (5 + 3): a = a + 3
        a -= 2; // 6 (8 - 2): a = a - 2
        a *= 4; // 24 (6 * 4): a = a * 4
        a /= 3; // 8 (24 / 3): a = a / 3
        a %= 5; // 3 (8 % 5): a = a % 5
        System.out.println(a);
    }
}
