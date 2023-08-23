package 반복문복습;

import java.util.Scanner;

//알람 설정하기(45분전으로)
public class Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("시간 : ");
//        int hour = sc.nextInt();
//        System.out.print("분 : ");
//        int min = sc.nextInt();
//
//        //45분 빼야하므로 시간을 분으로 환산한 뒤 거기서 45 빼줌
//        //45분 전으로 시간이 바뀌는 경우
//        if(min-45 < 0) {
//            min = 60 + (min - 45);
//            if (hour == 0) hour = 23;
//            else hour--;
//        }else{
//            min -= 45;
//        }
//        System.out.println(hour + "H " + min + "m");
        System.out.println("시간 분 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int totalMin = hour * 60 + min;
        if (totalMin < 45) {
            totalMin = 24 * 60 + min;
        }
        totalMin -= 45;
        System.out.println((totalMin / 60) + "시" + (totalMin % 60) + "분");
        }

    }

