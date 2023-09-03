package Chapter02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과 값) : (거짓일 경우 결과 값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y; // x가 y보다 큰 조건이 max에 들어가기, 거짓이면  y
        System.out.println(max);// 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // 달라요

    }
}
