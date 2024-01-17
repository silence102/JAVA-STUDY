package condition;
// 삼항 연산자(조건 연산자): (조건) ? 참_표현식 : 거짓_표현식
// 자바에서 유일하게 항이 3개인 연산자 -> 삼항 연산자
public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
// 조건에 만족하면 참_표현식 실행, 만족하지 않으면 거짓_표현식 실행
// 삼항 연산자 없이 if 문만 사용해도 된다.

// => 단순히 참과 거짓에 따라서 특정 값을 구하는 삼항 연산자를 사용하면 if 문 보다 간결한 코드를 작성할 수 있다.