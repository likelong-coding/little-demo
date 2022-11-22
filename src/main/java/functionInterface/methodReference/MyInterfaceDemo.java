package functionInterface.methodReference;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("show~");
        myInterface.show();
    }
}
