package 스트링;

import java.util.Scanner;

public class CharArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String input = sc.nextLine(); //정수 값을 넣으면 다음줄로 이동
        char [] word; // 지정
        word = input.toCharArray();
        for(int i = 0; i < word.length; i++) {
            if (word[i] < 'a') word[i] = (char) (word[i] + ('a' - 'A'));//i가 'a'보다 작을때 'a-A'해줌
            else word[i] = (char) (word[i] - ('a' - 'A'));
        }
        System.out.println(word);
    }
}
//Again