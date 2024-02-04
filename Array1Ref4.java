package array;
/* [ 배열 리펙토링 ]
    리펙토링(Refactoring)은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를 용이하게 하는 과정을 뜻한다.
    이는 중복을 제거하고, 복잡성을 줄이며, 이해하기 쉬운 코드로 만들기 위해 수행된다.
    리펙토링은 버그를 줄이고, 프로그램 성능을 향상시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이 된다.
    쉽게 이햐기해서 작동하는 기능은 똑같은데, 코드를 개선하는 것을 리펙토링이라 한다.
 */
public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화 * 1차원 배열의 형태.
        int[] minimize = {1, 2, 3, 4, 5}; // 간소화 한 코드 형태(지금과 같이 생략 가능)
        System.out.println(minimize[2]);

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
