package condition;
// switch 문: 아래와 같이 작성한 if 문을 조금 더 편리하게 사용할 수 있는 기능
public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
/* 조건문 (conditional statements)
    1. if 문
    2. if / else 문
    3. if / else if / else 문
    4. switch 문
 */