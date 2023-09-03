package Chapter03;
//문자열 비교
public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); //문자열 내용 같으면 true/ false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분X

        //심화
        s1 = "1234"; // 메모지의 화장실 비밀번호
        s2 = "1234"; //s1, s2는 똑같은 주소 참조!!!
        System.out.println(s1.equals(s2)); //true (내용비교)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234"); //새로운 주소
        s2 = new String("1234"); //새로운 주소
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); // false (참조한 주소가 다름)
        //즉, 문자열 비교할때는 equals 써야한다!!


    }
}
