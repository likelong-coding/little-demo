package lombok.test;

import lombok.entity.Dog;
import lombok.entity.Son;
import lombok.entity.Student;

/**
 * @author likelong
 * @date 2022/11/21
 */
public class Main {
    public static void main(String[] args) {
        Student student = Student.builder().age(18).name("李可龙").sex(1).build();
        System.out.println(student);

        Dog dog = Dog.builder().name("布莱克").color("black").build();
        System.out.println(dog);

        //具有继承关系的子父类属性
        Son son = Son.builder().age(25).name("小明").build();
        System.out.println(son);
        System.out.println(son.getAge());
        System.out.println(son.getName());
    }
}
