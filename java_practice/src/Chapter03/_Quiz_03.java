package Chapter03;
//주민번호에서 생년월일 및 성별 출력
//901231-1234567 인 경우 뒷자리 첫번째까지
//030708-4567890
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0,8));
        id = "030708-4567890";
        System.out.println(id.substring(0,id.indexOf("-") + 2)); // 0~ 하이픈 위치 +2 직전까지




    }
}
