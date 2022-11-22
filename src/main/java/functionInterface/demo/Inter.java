package functionInterface.demo;

public interface Inter {
    void show();

    static void test() {
        System.out.println("Inter 中的静态方法执行了");
    }

    default void show1() {
        System.out.println("show1开始执行");
        method();
        System.out.println("show1结束执行");
    }

    default void show2() {
        System.out.println("show2开始执行");
        method();
        System.out.println("show2结束执行");
    }

    static void method1() {
        System.out.println("method1开始执行");
        method();
        System.out.println("method1结束执行");
    }

    static void method2() {
        System.out.println("method2开始执行");
        method();
        System.out.println("method2结束执行");
    }

    static void method() {
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }

}
