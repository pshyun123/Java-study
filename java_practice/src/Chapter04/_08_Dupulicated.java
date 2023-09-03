package Chapter04;
//이중 반복문
//별 사각형
/*
*****
*****
*****
*****
*****
*/
public class _08_Dupulicated {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        //=========
// 별 왼쪽 삼각형
//        *
//        **
//        ***
//        ****
//        *****
        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1 ; j++) { // 이거나
            for (int j = 0; j <= i ; j++) { // 이거나 동일
                System.out.print("*");

            }
            System.out.println();


        }
// 별 오른쪽 삼각형- 공백 왼쪽에 조금 어렵다
//        ssss*
//        sss**
//        ss***
//        s****
//        *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) { //j는 공백의 값, J는 처음에 i보다 하나 작으므로
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { //별 출력
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
