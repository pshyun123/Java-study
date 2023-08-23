package 배열;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int newlen = 10;//개수를 늘리고 싶음
        int[] arr2 = new int[newlen];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        for(int e : arr2) System.out.print(e + " ");
    }
}
//System.arraycopy(Object src, int srcPos(시작위치), Object dest(목적지), int destPos, int length);