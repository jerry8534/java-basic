package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStident(student1, "student1", 15, 90);

        Student student2 = new Student();
        initStident(student2, "student2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStident(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("name : " + student.name + " age : " + student.age + " grade : " + student.grade);
    }
}
