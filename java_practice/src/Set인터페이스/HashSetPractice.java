package Set인터페이스;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채채");
        Member member3 = new Member(1003, "시안");
        Member member4 = new Member(1004, "코코");
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        System.out.println(s1);
        System.out.println(s2);
    }
}
// 아이디로 중복제거를 위해
class Member{
    int id;
    String name;
    @Override
    public int hashCode(){ return id;}

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Member){
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }
    public Member(int id, String name) { //생성자로 멤버 아이디 이름 만듦
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name); // 아이디와 이름 불러올 수 있게
    }
}

