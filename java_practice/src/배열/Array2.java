package 배열;

public class Array2 {
    public static void main(String[] args) {
        int[] grade2 = {88, 55, 99};
        int[] grade3 = new int[] {99, 88, 55};
        int[] grade4;
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 65;

        int sum = 0;

//        for (int i = 0; i <  grade4.length; i++) {
//            grade4[i] +=10;
//            sum += grade4[i]; //전통적인 for문, 원본데이터 건드림
//        }

            for(int val : grade4) {
                val += 10;
                sum += val; //총점구하기
            }
            System.out.println("총점 : " + sum);
            System.out.printf("평균 : %.2f\n", (double)sum/grade4.length);

            sum = 0;//sum 초기화
            for (int i = 0; i <  grade4.length; i++) {
                sum += grade4[i];

            System.out.println("총점 : " + sum);
            System.out.printf("평균 : %.2f\n", (double)sum/grade4.length);
            //소수점 둘째자리까지 보여주고 줄 바꿈, double은 소수점 16자리까지 표현, 합계 나누기 배열의 길이


    }
}
}
