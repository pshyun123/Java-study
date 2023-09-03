package Chapter01;
//변수
public class _02_Variables {
    public static void main(String[] args) {
        String name;
        name = "시안";//변수는 언제든 값을 바꿀 수 있음
        int hour = 15;

//        String name = "시안";
            System.out.println(name + "님, 배송이 시작되었습니다. "+ hour + "시에 방문 예정입니다.");
            System.out.println(name + "님, 배송이 완료되었습니다.");

        //=========
        double score = 90.5; //소수점 실수 표현
        char grade = 'A'; //한 문자는 작은따옴표로
        name = "별이";     //변수는 언제든 값을 바꿀 수 있음
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번시험에 합격했을까요?" + pass);

        //=========

        double d = 3.141232546546; //보다 정밀한
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);

        //=========

        int l = 2100000000; //21억 이하
        long r = 21000000000L; //21억 초과시
        r = 210_000_000_000L; //21억 초과시
        System.out.println(r);
        System.out.println(l);
        }
    }
