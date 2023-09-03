package Chapter04;
//스위치
public class _04_SwitchCase {
    public static void main(String[] args) {
        // 석차에 따른 장학금
        // 1등 : 전액, 2등: 반액, 3등 : 반액//그 외 장학금 대상 아님

        int ranking = 2; // 1등
//        switch (표현) {
//            case 1 : 수행할 명령
//                break;
//            case 2 : 수행할 명령
//                break;
//            case 3 : 수행할 명령
//                break;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");

                // 케이스 2,3 통합
                switch (ranking) {
                    case 1:
                        System.out.println("전액 장학금");
                        break;
                    case 2:
                    case 3:
                        System.out.println("반액 장학금");
                        break;
                    default:
                        System.out.println("장학금 대상 아님");
                }
        }

        //중고 상품 등급에 따른 가격책정 1급 최상 4급 최하
        int grade = 1; // 등급
        int price = 7000; //기본 가격
        switch (grade) {
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;
        }//1등급일 경우 브레이크 걸리기 전까지의 가격을 더해줌
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
    }

}