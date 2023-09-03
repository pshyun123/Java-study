package Chapter04;

public class _10_Break {
    public static void main(String[] args) {
        //break : 반복문에서 탈출 치킨 20마리 판매 (1인 1닭만)
        //손님 50명 대기

        //For
        int max = 20;
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "번 손님, 치킨나옴");
            if (i == max){
                System.out.println("금일 재료 소진");
                break; // 없으면 50까지 반복문 계속 돌림. 반복문 탈출
            }
        }
        System.out.println("영업종료");

        //=====
        // while
        int index = 1; // 손님 대기번호
        while (index <= 60) {
        System.out.println(index + "번 손님, 치킨나옴");
        if (index == max) {
            System.out.println("재료소진2");
            break;
        }
        index++;

    }
        System.out.println("영업종료2");
}}
