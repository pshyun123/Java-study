package Chapter03;
//특수문자, 이스케이프 문자
public class _04_EscapeSequence {
    public static void main(String[] args) {

        // \n : 줄바꿈
        System.out.println("자바가\n어려워요");

        // \t : 탭
        System.out.println("Juice\t 9000won");
        System.out.println("Coffee\t8000won");

        // \\: 역슬래시. 파일 경로
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰 따옴표
        System.out.println("단비가 \"냐아\"하고 울었어요");

        // \' : 작은 따옴표
        char c = 'A';
        c = '\'';
        System.out.println(c); // '
    }
}
