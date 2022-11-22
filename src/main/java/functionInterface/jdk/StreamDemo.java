package functionInterface.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张飞");
        list.add("张三丰");
        list.add("张三");
        list.add("李四");
        list.add("孙悟空");
        list.add("张一飞");

//        ArrayList<String> zhangList = new ArrayList<String>();
//        for (String s : list) {
//            if (s.startsWith("张")) {
//                zhangList.add(s);
//            }
//        }
//        ArrayList<String> treeList = new ArrayList<String>();
//        for (String s : zhangList) {
//            if (s.length() == 3) {
//                treeList.add(s);
//            }
//        }
//        for (String s : treeList) {
//            System.out.println(s);
//        }

        System.out.println("-------------------------------");
        //Stream流改进
        List<String> res = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(res);
    }
}
