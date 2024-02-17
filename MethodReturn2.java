package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // return 문을 이용해서 메서드를 바로 종료.
        }
        System.out.println(age + "살, 입장하세요.");
    }
}
/*
    [참고] 반환 값 무시: 반환 타입이 있는 메서드를 호출했는데 만약 반환 값이 필요 없다면 사용하지 않아도 된다.
    예시 1. int sum = add(1,2) // 반환된 값을 받아서 sum 에 저장.
        -> add(1,2) // 반환된 값을 사용하지 않고 버린다. 단순히 메서드만 호출할 수 있음.
 */