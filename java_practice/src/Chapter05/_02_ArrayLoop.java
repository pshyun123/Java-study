package Chapter05;
//배열 순회
public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메", "라떼", "모카", "초코"};

        //for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.print("주세요.");

        // 배열 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        } System.out.println("주세요");
        // 향상된 for문 : foreach 단축키!!!!!
        for(String coffee : coffees) {
            System.out.println(coffee + "를");
        }
        System.out.println("주세요");

    }
}
