package Chapter01;
//상수는 수를 바꿀 수 없음

public class _03_Constants {
    public static void main(String[] args) {
        //국가번호
        final String KR_Country_Code = "+82"; //final 상수로 바꿔줌
//        KR_Country_Code = "+8282";
        System.out.println(KR_Country_Code);

        //원주율
        final double PI = 3.141592;

        //생년월일
        final String Date_Of_Birth = "2001.07.01";
    }
}
