package 배열;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6, 2, 1};
        int tmp = 0; //임시의 값을 대피, 정렬하려고
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int i : arr) System.out.print(i+" ");
    }

}
//i 가 j 보다 클때 비교해서 i 가 더 값이 크면 둘의 자리를 바꿔줌