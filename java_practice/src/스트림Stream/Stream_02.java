package 스트림Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_02 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("유리", 89),
            new Student("희두", 90)
        );
        Stream<Student> stream = list.stream(); //
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println((name + "-" + score));
        });
    }
}
class Student{
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


}
