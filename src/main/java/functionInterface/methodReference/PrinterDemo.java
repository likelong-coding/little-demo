package functionInterface.methodReference;

/**
 * @author likelong
 * @date 2022/11/22
 */
public class PrinterDemo {
    public static void main(String[] args) {

        usePrinter(s -> System.out.println(s.toUpperCase()));

        PrintString printString = new PrintString();
        usePrinter(printString::printUpper);
    }

    private static void usePrinter(Printer printer) {
        printer.printUpperCase("HelloWorld");
    }
}
