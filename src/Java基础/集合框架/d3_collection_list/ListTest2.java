package Java基础.集合框架.d3_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {
    /**
     * 目标：；list的遍历方式
     */
    public static void main(String[] args) {
        //一行经典代码
        List<String> list = new ArrayList<>();
        list.add("凝光");
        list.add("优菈");
        list.add("香菱");
        list.add("芙宁娜");
        list.add("千羽");

        //1.for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("---------");

        //2.迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------");

        //3.增强for循环
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------");

        //4.JDK1.8开始之后的lambda表达式
        list.forEach( s -> {
            System.out.println(s);
        });
    }
}
