package functionInterface.demo;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class FlyableDemo {
    public static void main(String[] args) {

        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });

        System.out.println("--------------------");
        useFlyable(s -> {
            System.out.println(s);
            System.out.println("飞机可以起飞");
        });
    }

    private static void useFlyable(Flyable flyable) {
        flyable.fly("风和日丽，晴空万里");
    }
}
