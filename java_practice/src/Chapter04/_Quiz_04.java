package Chapter04;
//주차요금
//시간당 4000원, 일최대 30000원
//경차,장애인 차량 50프로 할인
//일반 5시간 주차, 경차 5시간 주차, 장애인차량 10시간
public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 주차시간
        boolean isSmallCar = false; // 경차 여부
        boolean disabledP = true; // 장애인 차량 여부

        int fee = hour * 4000;
        //3만원 초과시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        //경차, 장애인 차 할인
        if (isSmallCar || disabledP) {
            fee /= 2; // 반값 할인
     }

        System.out.println(fee + "입니다");
    }
}
