package array;
// 2차원 배열 - 리펙토링 1-4
// 구조개선 - length를 활용한 반복
public class ArrayDi4 {

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
