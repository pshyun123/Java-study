package 배열;

public class CommandLine {
    public static void main(String[] args) {

        if(args.length !=2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main Sting Argument num1, num2");
            System.exit(0); //프로그램 강제종료될때

        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);


    }
}
