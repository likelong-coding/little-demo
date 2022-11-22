package functionInterface.jdk;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("abc", s -> System.out.println(s));
        operatorString("abc", System.out::println);
        operatorString("abc", s -> System.out.println(new StringBuilder(s).reverse()));
        System.out.println("----------------------------------");
        operatorString("abc", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse()));

        System.out.println("**************");
        String[] arr = new String[]{"abc,30", "cbd,35", "dna,33"};
        printInfo(arr, s -> System.out.print("姓名：" + s.split(",")[0] + ","), s -> System.out.println("年龄：" + Integer.parseInt(s.split(",")[1])));
    }

    private static void printInfo(String[] arr, Consumer<String> consumer1, Consumer<String> consumer2) {
        for (String s : arr) {
            consumer1.andThen(consumer2).accept(s);
        }
    }

    private static void operatorString(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    private static void operatorString(String name, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(name);
//        consumer2.accept(name);
        consumer1.andThen(consumer2).accept(name);
    }
}
