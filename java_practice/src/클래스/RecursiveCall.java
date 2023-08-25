package 클래스;

public class RecursiveCall {
    public static void main(String[] args) {
        int rec = recursive_func(10);
        System.out.println(rec);
    }
    public static int recursive_func(int n){
        if(n == 1) return 1;
        return n + recursive_func(n-1);
    }
}
//자기 자신을 호출
