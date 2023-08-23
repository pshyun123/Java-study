package 배열;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int [7][3];//2*3 matrix
        int k = 10;
        for (int i = 0; i < arr.length; i++) {//2번
            for(int j = 0; j < arr[i].length; j++) {

                arr[i][j] = k;
                k += 10;
            }
        }
        for(int[] ints : arr) {
            for(int e : ints) {
            System.out.print(e + " ");
        }
        System.out.println();
        }
    }
}
