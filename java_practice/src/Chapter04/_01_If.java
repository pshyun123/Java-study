package Chapter04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 if
        int hour = 15; // 오전 10시
        if (hour < 14) { // 조건이 참이면 아래 두개의 문장 수행
            System.out.println("Ice Americano + 1");//수행할 명령
            System.out.println("샷추가");// 추가 명령
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이전 모닝커피를 마시지 않은 경우
        hour = 15;
        boolean coffee = false; // 모닝커피
//        if (hour < 14 && coffee == false){ //두시 이전 커피 마시지 않은 경우, 아아 주문
        if (hour < 14 != coffee){ //두시 이전 커피 마시지 않은 경우, 아아 주문
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후이거나 모닝커피를 마신 경우
        hour = 10;
        coffee = true;
        if(hour >= 14 || coffee == true){
            System.out.println("아아 디카페인 +1");
        }
        System.out.println("완료");

    }
}
