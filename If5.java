package condition;
// if 문에 여러 조건이 있다고 항상 if-else 로 묶어서 사용할 수 있는 것은 아니다.
// 조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우에는 else if 문을 사용하면 안되고, 대신에 여러 if 문을 분리해서 사용해야 한다.
public class If5 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 = " + discount + "원");
    }
}
