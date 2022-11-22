package functionInterface.jdk;

import builder.Student;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "xuanxuan");
        System.out.println(s);

//        Integer i = getInteger(() -> 666);
//        System.out.println(i);

        int[] arr = new int[]{17, 28, 49, 21, 32, 66};
        int maxNumber = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println("数组中的最大值是：" + maxNumber);


        Student student = getInstance(Student::new);
        System.out.println(student);
    }

    public static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

    public static Integer getInteger(Supplier<Integer> supplier) {
        return supplier.get();
    }

    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static <T> T getInstance(Supplier<T> supplier) {
        return supplier.get();
    }
}
