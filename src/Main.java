import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tanaka", 30, "A"));
        studentList.add(new Student("Yamada", 35, "O"));

        System.out.println("-----------");
        for(Student student : studentList) {
            System.out.println(student.getName() + "さん");
            System.out.println("年齢: " + student.getAge());
            System.out.println("血液型: " + student.getBloodType());
            System.out.println("-----------");
        }
    }
}
