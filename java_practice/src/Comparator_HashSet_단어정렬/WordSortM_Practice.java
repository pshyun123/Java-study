package Comparator_HashSet_단어정렬;
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래의 조건에 따라 정렬 하기
// - 길이가 짧은 것
// - 길이가 값으면 사전 순
// - 중복 제거
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class WordSortM_Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // 단어의 수 입력
//        String[] word = new String[n]; // 단어 저장할 배열 생성
//        sc.nextLine();
//        for(int i = 0; i < word.length; i++){
//            word[i] = sc.nextLine();
//        }
//        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
//        word = hashSet.toArray(new String[0]);
//        Arrays.sort(word, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() == o2.length()){
//                    return o1.compareTo(o2);
//            } else {
//                return o1.length() - o2.length();
//                }
//            }
//        });
//        System.out.println(Arrays.toString(word));
//    }
//}
//

//방법 2

//import java.util.Arrays;
//        import java.util.Comparator;
//        import java.util.HashSet;
//        import java.util.Scanner;
//
//public class WordSortM_Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 단어의 수 입력
//        int n = sc.nextInt();
//
//        // 단어를 저장할 배열 생성
//        String[] words = new String[n];
//
//        // 정수를 읽은 후 남은 개행 문자 처리
//        sc.nextLine();
//
//        // 단어를 배열에 입력
//        for (int i = 0; i < n; i++) {
//            words[i] = sc.nextLine();
//        }
//
//        // 중복을 제거하기 위해 HashSet 생성
//        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
//
//        // HashSet을 배열로 변환
//        words = uniqueWords.toArray(new String[0]);
//
//        // 지정된 기준에 따라 배열 정렬
//        Arrays.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()) {
//                    return o1.compareTo(o2); // 길이가 같으면 사전식 정렬
//                } else {
//                    return o1.length() - o2.length(); // 길이순으로 정렬
//                }
//            }
//        });
//
//        // 정렬된 단어 배열 출력
//        for (String word : words) {
//            System.out.println(word);
//        }
//    }
//}


//방법 3. 람다식
import java.util.*;
public class WordSortM_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 단어의 개수를 입력 받음
        int n = sc.nextInt();

        // 중복된 단어를 자동으로 제거하기 위해 Set을 사용
        Set<String> words = new HashSet<>();

        // 단어 입력 받기
        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }

        // 정렬된 결과를 저장하기 위해 List를 사용
        List<String> uniqueWords = new ArrayList<>(words);

        // 단어를 길이와 사전식 순서에 따라 정렬 (람다 표현식 사용)
        Collections.sort(uniqueWords, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 길이가 같으면 사전식 정렬
            }
            return a.length() - b.length(); // 길이에 따라 정렬
        });

        // 정렬된 단어를 출력
        uniqueWords.forEach(System.out::println);
    }
}