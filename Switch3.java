package condition;
// break 문이 없는 경우 - 발생하는 문제 예시
public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        // break 문이 없는 경우: case 2에서 중단하지 않고 case 3 코드 실행
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
/*  if문 vs switch 문
    -   switch 문은 조건식을 넣는 부분이 단순한 값만 넣을 수 있다.
    -   조건식이 특정 case 와 같은지만 체크할 수 있다. -> 값이 같은지 확인하는 연산만 가능(문자도 가능)
    -   반면, if 문은 참 거짓 결과가 나오는 조건식을 자유롭게 적을 수 있다.

    => switch 문 없이 if 문만 사용해도 된다. 하지만 특정 값에 따라 코드를 실행할 때 switch 문을 사용하면 if 문 보다 간결한 코드를 작성할 수 있다.
 */