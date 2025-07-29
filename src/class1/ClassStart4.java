package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 20;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 21;

        Student[] students = {student1, student2};

        for (Student student : students) {
            System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
        }
    }
}
