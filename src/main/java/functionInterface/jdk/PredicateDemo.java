package functionInterface.jdk;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> s.length() > 5);
        //false
        System.out.println(b1);

        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        //true
        System.out.println(b2);

        boolean b3 = checkString("hello", s -> s.length() > 4, s -> s.length() > 8);
        // false true
        System.out.println(b3);

        boolean b4 = checkString("helloworld", s -> s.length() > 5, s -> s.length() > 8);
        // true true
        System.out.println(b4);

        System.out.println("----------------");
        String[] strArray = new String[]{"孙悟空，35", "唐僧，36", "沙僧，34", "猪八戒，32", "白骨精，5000"};

        ArrayList<String> ans = myFilter(strArray, s -> s.split("，")[0].length() > 2, s -> Integer.parseInt(s.split("，")[1]) > 33);
        System.out.println(ans);
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> predicate1, Predicate<String> predicate2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : strArray) {
            if (predicate1.and(predicate2).test(s)) {
                arrayList.add(s);
            }
        }
        return arrayList;
    }

    private static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    private static boolean checkString(String s, Predicate<String> predicate, Predicate<String> predicate2) {

//        return predicate.and(predicate2).test(s);
        return predicate.or(predicate2).test(s);
    }
}
