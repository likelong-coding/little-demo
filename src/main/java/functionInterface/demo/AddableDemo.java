package functionInterface.demo;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class AddableDemo {

    public static void main(String[] args) {

        useAddable(new Addable() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });

        System.out.println("-------------------");

        useAddable((num1, num2) -> {
            System.out.println("num1 " + num1);
            System.out.println("num2 " + num2);
            return num1 + num2;
        });


    }

    private static void useAddable(Addable addable) {
        int sum = addable.add(10, 20);
        System.out.println("sum " + sum);
    }
}
