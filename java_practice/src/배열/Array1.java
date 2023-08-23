package 배열;

public class Array1 {
    public static void main(String[] args) {
        int[] grade1 = new int[3];
        grade1[0] = 45;
        grade1[1] = 55;
        grade1[2] = 90;
//        grade1[3] = 88;
//        grade1[4] = 99;
//
//        for(int i = 0; i < grade1.length; i++) {
//            System.out.println(grade1[i] + " ");
//        }

        //향상된 for문
        for(int e : grade1){
            System.out.println(e + " ");
        }
    }
}
