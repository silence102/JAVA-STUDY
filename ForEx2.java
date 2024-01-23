package loop.ex;
// 2부터 짝수 10번 출력: for 문
public class ForEx2 {

    public static void main(String[] args) {
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
/*
    강사님 추천 예시
    int num = 2;
    for (int count = 1; count <= 10; count++) {
        System.out.println(num);
        num += 2;
    }
 */