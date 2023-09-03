package Chapter01;
// 형변환, 정수 -> 실수, 실수 -> 정수
public class _04_TypeCasting {
    public static void main(String[] args) {
        //int -> float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score); //93.0
        System.out.println((double) score); //93.0

        //float, double -> int
        float score_f = 93.3F;
        double score_d =98.4;
        System.out.println((int) score_f); //93
        System.out.println((int)score_d);  //98

        //정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score); //191

        score_d = (double) 93 + 98.8; //93.0 + 98.8 / double 안 붙여도 됨
        // int -> long -> float -> double (자동 형변환)
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.3");
        System.out.println(d);


        }

    }
