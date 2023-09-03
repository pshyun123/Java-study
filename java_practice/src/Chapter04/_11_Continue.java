package Chapter04;
//continue
public class _11_Continue {
    public static void main(String[] args) {
        //치킨 주문 손님중 노쇼 있음
        //for
        int max = 20; //최대치킨 판매수량
        int sold = 0; //현재치킨
        int noShow = 17; // 17번 손님이 노쇼

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 치킨나옴");


            //노쇼의 경우
            if (i == noShow) {
                System.out.println(i + "번 손님, 다음으로~!");
                continue;//아래로 가지 않고 위로 다시 돌아감
            }
            sold++; // 판매처리
            if(sold == max){
            System.out.println("재료 소진");
            break;
            }
        System.out.println("영업종료");


            //========
            //while문
            sold = 0; // 초기화
            int index = 1; // 손님 번호
            while (index <= 50) {
                System.out.println(index + "번 손님 치킨나옴");

                //노쇼의 경우
                if (index == noShow) {
                    System.out.println(index + "번 손님, 다음으로~!");
                    index++; // for 문과 달리 증감 값을 넣어줘야 함
                    continue;//아래로 가지 않고 위로 다시 돌아감
                }
                sold++;
                if(sold == max) {
                    System.out.println("재료 소진ㅜㅜ");
                    break;
                }
                index++;
            }
            System.out.println("bye~");
        }
    }//이걸 어떻게 다르게 할 수 있다고?? 휴
}
