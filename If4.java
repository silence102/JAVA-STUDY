package condition;
// else if: 전체 if 문을 하나로 묶는 것. 특정 조건이 만족하면 해당 코드를 실행하고 if 문 전체를 빠져나온다.
//          순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면 딱 1개만 실행이 된다.
public class If4 {

    public static void main(String[] args) {
        int age = 26;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
