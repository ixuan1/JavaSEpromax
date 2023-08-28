package 集合框架.D1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class collectionTest2API {
    public static void main(String[] args) {
        //collection 是接口，所以不能直接new创建
        Collection<String> c = new ArrayList<>(); // 多态写法，collection是ArrayList最终继承的接口

        //1.public boolean add(E e); 添加元素，添加成功返回true
        c.add("java1");
        c.add("java2");
        System.out.println("添加成功后返回"+c.add("java3"));
        System.out.println(c);

        //2.public void clear():清空集合的元素
        //c.clear();
        //System.out.println(c);

        //3.public boolean isEmpty():判断集合是否为空，是空返回true。反之
        System.out.println(c.isEmpty());

        //4.public int size()：获取集合的大小
        c.add("1");
        System.out.println("数组的大小："+c.size());

        //5.public boolean contains(Object obj):判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));

        //6.public boolean remove(E e):删除某个元素，如果有多个重复元素，默认删除前面的第一个！
        System.out.println(c.remove("java1"));
        System.out.println("删除后的数组"+c);

        //7. public Object[] toArray():把集合转换为数组
        Object[] arr = c.toArray(); //因为list中可能不是同一种数据类型，所以用object来接收
        System.out.println(Arrays.toString(arr));

        //如果确认都是同一种数据类型,则可以自己new一个数组进行接收
        String[] array = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------");
        //把一个集合的全部数据倒入到另个集合中去
        Collection<String> c1 = new ArrayList<String>();
        c1.add("java1");
        c1.add("java2");

        Collection<String> c2 = new ArrayList<String>();
        c2.add("java3");
        c2.add("java34");

        c1.addAll(c2);
        System.out.println(c1);
    }
}
