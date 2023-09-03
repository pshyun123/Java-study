package Chapter04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (hour < 14) { //오후 두시 이전이라면

            System.out.println("아아 + 1");
        } else {
            System.out.println("아아 디카페인");
        }
        System.out.println("주문 완료");

        // 오후 두시 이전이거나 모닝커피 마신경우?
        hour = 15;
        boolean coffee = false;
        if (hour >= 14 || coffee == true) {
            System.out.println("아아 디카페인 +1");
        } else {
            System.out.println("아아");
        }
        System.out.println("커피 주문 완료");
    }
}
