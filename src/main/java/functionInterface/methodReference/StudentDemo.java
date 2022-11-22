package functionInterface.methodReference;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder((name, age) -> new Student(name,age));

        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder studentBuilder){
        Student student = studentBuilder.build("xuanxuan", 22);
        System.out.println(student.getName()+","+student.getAge());
    }
}
