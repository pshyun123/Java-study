package Chapter04;
//조건문 else if
public class _03_ElseIf {
    public static void main(String[] args) {
        // 에이드 or 주스 or, 아아

        boolean ade = false; // 에이드 있다면
        boolean juice = false;

        if (ade) {
            System.out.println("에이드 +1");
        } else if (juice) {
            System.out.println("주스");
        } else {
            System.out.println("아아");
        }
        System.out.println("주문완료");



    //===================================
        //else if 여러번 사용가능
        ade = false;
        juice = false;
        boolean tea = true;

        if (ade) {
            System.out.println("에이드 +1");
        } else if (juice) {
            System.out.println("주스");
        } else if (tea){
            System.out.println("티");
        } else {
            System.out.println("아아");
        }
        System.out.println("주문완료");


    }
}
