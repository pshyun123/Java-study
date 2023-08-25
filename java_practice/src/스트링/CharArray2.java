package 스트링;

import java.util.Scanner;

public class CharArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));//괄호 잘 챙겨보자
        }

    }
}
//Again
