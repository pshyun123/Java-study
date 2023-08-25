package 스트링;

import java.util.Scanner;

public class Buger {
    public static void main(String[] args) {
        int [] menu = new int[5] ; //햄버거 3, 음료2
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요 : ");
        for (int i = 0; i< menu.length; i++) menu[i] = sc.nextInt();

        int minBurger = menu[0];
        int minDrink = menu[3];
        for(int i = 0; i < menu.length; i++) {//메뉴의 길이만큼 돌리면서 증가
            if ((i < 3) && (minBurger > menu[i])) minBurger = menu[i];//
            if ((i > 2) && (minDrink > menu[i])) minDrink = menu[i];

            System.out.println(minBurger + minDrink - 50);
        }
    }
}
