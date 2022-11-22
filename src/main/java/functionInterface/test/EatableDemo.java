package functionInterface.test;

import functionInterface.demo.Eatable;
import functionInterface.demo.EatableImpl;

public class EatableDemo {
    public static void main(String[] args) {
        // 传统接口实现类 多态
        useEatable(new EatableImpl());

        useEatable(() -> System.out.println("你吃粑粑"));
    }

    private static void useEatable(Eatable eatable) {
        eatable.eat();
    }
}
