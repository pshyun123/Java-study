package Map_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("아영", 100);
        map.put("지영", 99);
        map.put("선영", 80);
        map.put("호영", 77);
        map.put("민영", 77);
        System.out.println("총 Entry 수 : " + map.size());
        //객체 찾기 방법1. get(key)
        System.out.println(map.get("아영"));

        //방법2. 향상된 for문 사용
        for(String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));

        }
        //방법3. iterator (반복자) 사용, 옛날방식, 어렵다. 이해가 안돼 ㅠㅠ
        Set<String> keySet = map.keySet();//key 값 뽑아내서 set 자료구조 만들기
        Iterator<String> iterator = keySet.iterator(); //
        while (iterator.hasNext()){ //반복할게 있니?
            String key = iterator.next();
            Integer value = map.get(key); //키값을 넣어줌
            System.out.println(key + "\t" + value);
        }

        //객체 삭제 :
        map.remove("지영");
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }



    }
}
