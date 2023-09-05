package Comparable_학생성적정렬;

import java.util.TreeSet;

//5명학생 이름 성적순으로
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("김철수", 85));
        info.add(new StudentInfo("이영희", 95));
        info.add(new StudentInfo("박민지", 88));
        info.add(new StudentInfo("홍길동", 90));
        for(StudentInfo e : info) {
            System.out.println(e.name + ", " + e.score);
        }

}
}
class StudentInfo implements Comparable<StudentInfo>{
    String name;
    int score;
    public StudentInfo(String name, int score){
        this.name = name;
        this.score = score;

    }
    @Override
    public int compareTo (Comparable_학생성적정렬.StudentInfo o){
        if(this.score < o.score) return 1; //내림차순 정렬하는데
        else{
            return this.name.compareTo(o.name); // 값이 같을 경우 사전순으로 정렬해
        }
    }
}