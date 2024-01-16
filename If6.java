package condition;
// if 문을 여러개 사용해야 하는 문제 상황 예시.
// 첫 번재로 충족되는 조건인 1000원 할인만 적용되고, if 문을 빠져나온다. 따라서 사용자는 나머지 할인을 놓치게 된다.
// if, else if, else 를 묶어서 사용하는 경우 -> 중복 할인이 불가능한 상황. (조건이 하나만 만족되어도 if 문을 빠져나오기 때문)
public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 = " + discount + "원");

        // * if문 {} 중괄호 생략
        if (true) System.out.println("한줄 if 문 예시"); // 한줄 if 문의 경우 코드 블록 없이 출력이 가능함.
        // but 두 줄 부터는 실행이 안되고, 권장하는 방식은 아님.
    }
}
// if 문의 명령이 한개만 있는 경우에도 중괄호를 사용하는 것이 좋은 이유

// 1. 가독성: 중괄호를 사용하면 코드를 더 읽기 쉽게 만들어 준다.
//         조건문의 범위가 명확하게 표시되므로 코드의 흐름을 더 쉽게 이해할 수 있다.
// 2. 유지보수성: 중괄호를 사용하면 나중에 코드를 수정할 때 오류를 덜 발생시킬 수 있다.
//         예를 들어, if 문에 또 다른 코드를 추가하려고 할 때, 중괄호가 없으면 이 코드가 if 문의 일부라는 것이 명확하기 않을 수 있다.