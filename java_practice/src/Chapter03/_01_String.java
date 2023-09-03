package Chapter03;
// 문자열
public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함관계
        System.out.println(s.contains("Java")); // 포함 : true
        System.out.println(s.contains("c#")); // 미포함 : false
        System.out.println(s.indexOf("and")); // 위치 정보 : 12(시작위치)
        System.out.println(s.lastIndexOf("and")); // 위치 정보 : 23(마지막 위치)
        System.out.println(s.indexOf("f")); // 미포함  -1
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 : true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 : false




    }
}
