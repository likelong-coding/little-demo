package functionInterface.methodReference;

public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((s, x, y) -> s.substring(x, y));

        useMyString(String::substring);
    }

    private static void useMyString(MyString myString) {
        String s = myString.mySubString("HelloWorld", 5, 10);
        System.out.println(s);
    }
}
