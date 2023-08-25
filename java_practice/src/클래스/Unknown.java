package 클래스;


public class Unknown {
    public static void main(String[] args) {
        int result = sum(100, 200, 300, 400);
        System.out.println(result);
    }

    static int sum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
