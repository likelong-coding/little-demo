package functionInterface.demo;

public class LambdaDemo {
    public static void main(String[] args) {
        //参数类型可以省略
        useAddable((x, y) -> {
            return x + y;
        });
        System.out.println("------------------------");
        //如果只有一个参数，小括号也可以省略
        useFlyable(s -> {
            System.out.println(s);
        });
        System.out.println("------------------------");
        //如果代码块的语句只有一条，可以省略大括号和分号(有return时要把return也去掉)
        useFlyable(s ->
                System.out.println(s)
        );

        useAddable((x, y) -> x + y);
    }

    private static void useFlyable(Flyable flyable) {
        flyable.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable addable) {
        int sum = addable.add(10, 20);
        System.out.println(sum);
    }
}
