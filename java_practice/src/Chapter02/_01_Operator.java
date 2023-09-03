package Chapter02;
// 산술연산자
public class _01_Operator {
    public static void main(String[] args) {
        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); //2.5가 아니라 정수라 결과 값 2
        System.out.println(4 % 2); //나머지 연산자. 0
        System.out.println(5 % 2); //나머지 1

        // 우선 순위 연산
        System.out.println((2 + 2)* 2) ;

        // 변수 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);  // 30

        c = a - b;
        System.out.println(c);  // 10

        c = a % b;
        System.out.println(c);  // 0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 , 먼저 실행 됨
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val);  // 11 , 나중에 실행 됨

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val);  // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        //은행 대기표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기인원 0
        System.out.println("대기 인원 : " + waiting++); // 대기인원 1
        System.out.println("대기 인원 : " + waiting++); // 대기인원 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기인원 3
     }
}
