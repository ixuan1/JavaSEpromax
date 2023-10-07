package Java基础.集合框架.D2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo1 {
    public static void main(String[] args) {
        //new一个collection数组
        Collection<String> c1 = new ArrayList();
        c1.add("凝光");
        c1.add("刻晴");
        c1.add("优菈");
        c1.add("甘雨");
        //[凝光，刻晴、优菈，甘雨]
        // it

        //使用迭代器遍历集合
        //1.从集合中获取迭代器对象
        Iterator<String> it = c1.iterator();
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());//出现数组越界，会出现异常

        //2.使用for循环结合迭代器遍历
        while(it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
            //每次都是问一次娶一次,如果同时娶两次，则会判断一次而跳过了一次直接取
            //System.out.println(it.next());
            //System.out.println(it.next());
        }
    }
}
