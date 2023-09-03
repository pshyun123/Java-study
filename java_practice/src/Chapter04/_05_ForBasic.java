package Chapter04;
//For 반복문
public class _05_ForBasic {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 시안입니다." + i); //10보다 작을 동안 반복
        }
        //짝수만 출력 : 2,4,6,8,10
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        //홀수만 출력 : 1,3,5,7,9
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        //역순 출력 : 5,4,3,2,1
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            }

        //1~10 수의 합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println("총합은 " + sum + "입니다.");
        }
    }

