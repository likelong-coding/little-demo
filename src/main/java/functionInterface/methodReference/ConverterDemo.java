package functionInterface.methodReference;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class ConverterDemo {

    public static void main(String[] args) {
        useConverter(s -> Integer.parseInt(s));

        useConverter(Integer::parseInt);
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}
