package builder;

/**
 * @author likelong
 * @date 2022/11/21
 */
public class Main {

    public static void main(String[] args) {
        Student student = Builder.builder(Student::new).with(Student::setName, "张三").with(Student::setAge, 18).build();
        System.out.println(student);

    }
}
