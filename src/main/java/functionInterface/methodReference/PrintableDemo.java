package functionInterface.methodReference;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(s->
            System.out.println(s)
        );

        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable p){
        p.printString("hello world");
    }

}
