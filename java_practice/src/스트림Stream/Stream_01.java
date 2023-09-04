package 스트림Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_01 {
//    public static void main(String[] args) {
//        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
//        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//        list.stream().filter(s ->s % 2== 0).forEach(e -> System.out.print(e + " "));
//
//    }
//}
public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    List<Integer> list = new ArrayList<>(Arrays.asList(arr));

    // 스트림을 생성, 중간연산(가공), 최종 연산
    // list.stream().filter(s ->s.intValue() >= 5)  // int s 만들지 않았는데 알아서 지정
    // list.stream().filter(s ->s % 2 == 0 ).forEach(e -> System.out.println(e + " ")); // 짝수
    // list.stream() : 스트림 생성(1회용, 생성 후 소멸)

    //reduce(): 첫 번째와 두 번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세 번째 요소를 가지고 또다시 연산을 수행
//    int sumVal = list.stream().reduce(0, Integer::sum);//둘다 최종연산이어서 둘 중 아무거나 쓰면 된다.
    int sumVal = list.stream().mapToInt(e -> e).sum();//둘다 최종연산이어서 둘 중 아무거나 쓰면 된다.
    //mapToInt(e, int 스트림으로 변환)
    int count = list.size();//리스트에 들어있는 원소 수

    System.out.println("합계 : " + sumVal);
    System.out.println("횟수 : " + count);
    }
}