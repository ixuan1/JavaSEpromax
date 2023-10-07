package Java基础.集合框架.d4_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 目标：整体了解一下set系列集合的特点
 */
public class SetTest1 {
    public static void main(String[] args) {
        //1.创建一个Set的对象
        //Set<Integer> set = new HashSet<>(); //创建了一个HashSet的集合对象， 一行经典代码 HashSet：无需不重复无索引
        Set<Integer> set = new LinkedHashSet<>(); // 多态写法  有序 不重复 无索引
        //Set<Integer> set = new TreeSet<>(); //可排序（默认升序） 不重复 无索引
        set.add(8882);
        set.add(888);
        set.add(6);
        set.add(99);
        System.out.println(set);
    }
}
