package Comparable_학생성적정렬;
import...
import java.util.TreeSet;

//5명학생 이름 성적순으로
public class StudentSortEx {
    public static void main(String[] args) {
        Treeset<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("ddd", 80));
        info.add(new StudentInfo("fff", 66));
        info.add(new StudentInfo("www", 70));
        info.add(new StudentInfo("kkk", 99));
        for(StudentInfo e : info) {
            System.out.println(e.name + ", " + e.score);
        }

}
}
class StudentInfo implements Comparable <StudentInfo>{
    String name;
    int score;
    public StudentInfo(String name, int score){
        this.name = name;
        this.score = score;

    }
    @Override
    public int compareTo (Comparable_학생성적정렬.StudentInfo o){
        if(this.score < o.score) return 1;
        else{
            return this.name.compareTo(o.name);
        }
    }
}