package Chapter02;
// 키가 115cm 이므로 탑승 불가
// 키가 121cm 이므로 탑승 가능
public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 212;

//        String result = (조건) ? (참) : (거짓);
        String result = (height >= 120 && height <= 200) ? ("탑승 가능") : ("탑승 불가");
        System.out.println("키가 " + height + "이므로 " + result);


    }
}
