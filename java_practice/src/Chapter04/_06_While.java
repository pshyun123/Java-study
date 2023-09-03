package Chapter04;
//반복문 while
public class _06_While {
    public static void main(String[] args) {
        //수영장에서 수영
        int dis = 25; // 전체거리
        int move = 0; // 현재 이동거리
        while (move < dis) { // 현 이동거리 < 전체거리 참인동안 반복, 획수 정하지지 않음
            System.out.println("발차기 지속");
            System.out.println("현 이동거리: " + move);
            move += 3; //3미터 이동
        }
        System.out.println("도착");

        //무한 루프
        move = 0; // 초기화
        while (move < dis) { // 현 이동거리 < 전체거리 참인동안 반복, 획수 정하지지 않음
            System.out.println("발차기 지속");
            System.out.println("현 이동거리: " + move);
        }
        System.out.println("도착");


    }
}
