package scope;
// 지역 변수, 멤버 변수
// 스코프(scope): 변수의 접근 가능한 범위
public class Scope2 {

    public static void main (String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부, for 문 내
            System.out.println("if m = " + m);
            System.out.println("if i = " + i);
        } //i 생존 종료

//        System.out.println("main i = " + i); //오류, i에 접근 불가
        System.out.println("main m = " + m);
    }
}
