package functionInterface.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("ccc");
        arrayList.add("aa");
        arrayList.add("dddd");
        arrayList.add("b");
        System.out.println("排序前" + arrayList);
        Collections.sort(arrayList);
        System.out.println("排序后" + arrayList);
        Collections.sort(arrayList, getComparator());
        System.out.println("使用定义比较器排序方法后：" + arrayList);
    }

    private static Comparator<String> getComparator() {
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
        return (s1,s2) -> s1.length() - s2.length();
    }
}
