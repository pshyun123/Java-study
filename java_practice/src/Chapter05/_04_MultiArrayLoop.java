package Chapter05;
// 다차원 배열 순회
public class _04_MultiArrayLoop {
    public static void main(String[] args) {


        String[][] seats2 = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        for (int i = 0; i < seats2.length; i++) { // 세로 길이만큼만
            for (int j = 0; j < seats2[i].length; j++) { // 가로 0인덱스:3 1인덱스:4 2인덱스:5
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=========");
        // 세로 10 * 가로 15 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
            // 표 구매
            seats3[7][8] = "__";
            seats3[7][9] = "___";

        }
        for (int i = 0; i < seats3.length; i++) { // 세로 길이만큼만
            for (int j = 0; j < seats3[i].length; j++) { // 가로 0인덱스:3 1인덱스:4 2인덱스:5
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}