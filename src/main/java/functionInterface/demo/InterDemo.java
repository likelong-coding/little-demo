package functionInterface.demo;

import java.util.concurrent.TimeUnit;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class InterDemo {
    public static void main(String[] args) {

        useInter(() ->
                System.out.println("Lambda表达式")
        );

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        Runnable r = () -> System.out.println("Lambda表达式");
        new Thread(r).start();

        new Thread(() ->
                System.out.println("Lambda表达式")
        ).start();


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("**************");
        Inter inter = new InterImpl();
        inter.show();
        Inter.method();

        //静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        Inter.test();
    }

    private static void useInter(Inter inter) {
        inter.show();
    }

}
