package Chapter04;
// 반복문 DoWhile
public class _07_DoWhile {
    public static void main(String[] args) {

        int dis = 25; // 전체거리
        int move = 0; // 현 이동거리
        int heigth = 2; //키 2m
        while (move + heigth < dis){
            System.out.println("발차기 지속");
            System.out.println("현 이동거리: " + move);
            move += 3;
        }
        System.out.println("도착");

        System.out.println("======");
        move = 0; // 현 이동거리
        heigth = 25; //키 25m
        while (move + heigth < dis){ // 조건이 거짓이 됨, 반복문 실행 안됨
            System.out.println("발차기 지속");
            System.out.println("현 이동거리: " + move);
            move += 3;
        }
        System.out.println("도착2");

        //do while
        do{
            System.out.println("발차기 지속");
            System.out.println("현 이동거리: " + move);

        } while (move + heigth < dis);
        System.out.println("도착3");
    }
}
