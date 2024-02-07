package array.ex;
// array 1번 문제 풀이
public class ArrayEx1Ref {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        } // 노란줄에 Alt + Enter : 더 나은 방식을 추천
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

//        for (int num : students) {  // 향상된 for 문 예시
//            total += num;
//        }

    }
}
