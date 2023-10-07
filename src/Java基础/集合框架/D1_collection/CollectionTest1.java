package Java基础.集合框架.D1_collection;


import java.util.ArrayList;
import java.util.HashSet;

/**
 * 认识collection体系的特点
 *
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        //collection集合的特点
        ArrayList<String> list = new ArrayList<>(); //有序 可重复 有索引
        list.add("java1");
        list.add("java1");
        list.add("java12");
        list.add("java13");
        list.add("4222");
        System.out.println(list);


        HashSet<String> set = new HashSet<>(); //无序 不重复 无索引
        set.add("java2");
        set.add("java22");
        set.add("java2");
        set.add("java23");
        System.out.println(set);
    }



}
