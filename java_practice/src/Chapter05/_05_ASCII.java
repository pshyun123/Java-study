package Chapter05;
//아스키 코드
public class _05_ASCII {
    public static void main(String[] args) {


        char c = 'A'; // 알파펫 A
        System.out.println(c);
        System.out.println((int) c);


        // 세로 10 * 가로 15 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1); // 문자열로 바꾸기
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로 길이만큼만
            for (int j = 0; j < seats3[i].length; j++) { // 가로 0인덱스:3 1인덱스:4 2인덱스:5
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}