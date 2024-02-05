package array;
// 2차원 배열 - 리펙토링 1-3
// 구조개선 - 2차원 배열 초기화
public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int [][] arr = new int[][]{
                {1,2,3},
                {4,5,6}
        }; // 행2, 열3

//        int [][] arr = {           // 이 코드와 같이 간소화 할 수 있다.
//                {1,2,3},
//                {4,5,6}
//        };

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
