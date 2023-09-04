package 스트림Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

// forEach()
public class Stream_03 {
    public static void main(String[] args) {
        // asList() : 일반 배열을 ArrayList 로 변경
        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백나나"));

        // 순차처리
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
//        stream.forEach(System.out::println);//위와 동일
        System.out.println();


        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(System.out::println);
        System.out.println();
    }
    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
        System.out.println();
    }
}
