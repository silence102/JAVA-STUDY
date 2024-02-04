package array;
// 배열 선언과 생성
// 배열은 같은 타입의 변수를 사용하기 편하게 하나로 묶은 것.
// 참조형 -> 기본형과 달리 크기를 동적으로 할당할 수 있다. [동적 메모리 할당]
public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성( * 배열의 참조값이 생성 )
        // 배열 내부의 값은 자동으로 초기화: 숫자는 0, boolean은 false, String은 null로 초기화.
        // 배열 변수 students 생성 후에는 배열의 참조 값이 변수에 보관된다.

        System.out.println(students); //[I@b4c966a: @앞의 I는 int 형 배열을 뜻한다. @뒤에 16진수는 참조값을 뜻한다.

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
/* [ 배열 생성과 참조값에 대한 이해 ]
    int[] students = new int[5]; // 1. 배열 생성
    int[] students = x001; // 2. new int[5]의 결과로 x001 참조값 반환
    students = x001 // 3. 최종 결과
 */
/*
    [ 배열에 값 대입 ]
    students[0] = 90; // 1. 배열에 값을 대입
    x001[0] = 90; // 2. 변수에 있는 참조값을 통해 실제 배열에 접근. 인덱스를 사용해서 해당 위치의 요소에 접근, 값 대입
    => 배열을 사용하면 이렇게 참조값을 통해서 실제 배열에 접근하고 인덱스를 통해서 원하는 요소를 찾는다.
 */