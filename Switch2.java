package condition;
// * if 문은 비교 연산자를 사용할 수 있지만, switch 문은 단순히 값이 같은지만 비교할 수 있다.
// if, else-if, else 구조와 동일
public class Switch2 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
