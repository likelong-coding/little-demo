package functionInterface.demo;

public class EatableDemo {
    public static void main(String[] args) {
        //传统接口实现类 多态
        useEatable(new EatableImpl());

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃吃吃~");
            }
        });

        //lambda表达式
        useEatable(() -> System.out.println("你吃粑粑"));
    }

    private static void useEatable(Eatable eatable) {
        eatable.eat();
    }
}
