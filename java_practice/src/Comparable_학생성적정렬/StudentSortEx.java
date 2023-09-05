package Comparable_학생성적정렬;
//5명의 학생에 대해 이름과 성적 입력. 성적 높은사람 수능로 정렬, 성적이 같으면 이름이 정렬
//미리 입력 받아두고 시작한다.
//컴페어러블을 이름,성적이 포함된 클래스만들어서
import java.util.TreeSet;

//5명학생 이름 성적순으로
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("장원영", 77));
        info.add(new StudentInfo("이서", 88));
        info.add(new StudentInfo("레이", 77));
        info.add(new StudentInfo("가을", 77));
        for(StudentInfo e : info) {
            System.out.println(e.name + " ");
        }
    }
}
class StudentInfo implements Comparable<StudentInfo>{
    //컴페어러블 이용해서 객체로 푸는게 낫다. 클래스에다가 인터페이스 상속 받으려면 컴페어러블이 낫다(컴페어레이터는 아님)
    //빨간줄 뜨면 오버라이딩 바로 걸 수 있음
    String name;
    int score;
    public StudentInfo(String name, int score){
        this.name = name;
        this.score = score;
        //알고리즘 문제니까 게터 세터는 하지 않음

    }
    @Override
    public int compareTo (Comparable_학생성적정렬.StudentInfo o){
        if(this.score < o.score) return 1; // 성적 내림차순 정렬. 뒤에 값이 크면 앞으로
        else{
            return this.name.compareTo(o.name); // 값이 같을 경우 이름 사전순으로 정렬. 문자열비교 앞의 값이 크면 뒤로(return1)
        }
    }
}