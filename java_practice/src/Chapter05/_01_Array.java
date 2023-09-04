package Chapter05;
//Array : 같은 자료형의 값 여러개를 저장하는 연속된 공간
public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값
        // 방법1
//        String [] coffee = new String[4]; //크기 네개의 스트링 배열

        // 방법2
        String coffee[] = new String[4];
        coffee[0] = "Americano";
        coffee[1] = "Latte";
        coffee[2] = "Moca";
        coffee[3] = "choco";

        // 방법3
        String [] c = new String[] {"아메", "라떼", "모카", "초코"};

        // 방법4
        String[] cff = {"아메", "라떼", "모카", "초코"};

        // 커피 주문
        System.out.println(coffee[0] + "하나");
        System.out.println(coffee[1] + "하나");
        coffee[2] = "에스프레소";
        System.out.println(coffee[2] + "하나");
        System.out.println(coffee[3] + "하나");

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
