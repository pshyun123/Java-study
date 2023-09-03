package Chapter04;
//구구단
public class _09_Multiple {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}
