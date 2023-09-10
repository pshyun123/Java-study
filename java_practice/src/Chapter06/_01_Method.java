package Chapter06;
// 메소드: 함수와 같음


public class _01_Method {
    // 메소드 정의
    public static void sayHello(){
        System.out.println("안녕!");
    }

    // 메소드 호출
    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
