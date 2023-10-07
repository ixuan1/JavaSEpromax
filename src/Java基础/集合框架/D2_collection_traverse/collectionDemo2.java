package Java基础.集合框架.D2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo2 {
    public static void main(String[] args) {
        //new一个collection数组，多态写法
        Collection<String> c1 = new ArrayList();
        c1.add("凝光");
        c1.add("刻晴");
        c1.add("优菈");
        c1.add("甘雨");
        //[凝光，刻晴、优菈，甘雨]
        // it
        //使用迭代器

        Iterator<String> iterator = c1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().contains("光"));
        }

        //使用增强for遍历集合或者数组
        for (String s : c1) {
            System.out.println(s);
        }

        String[] names = {"九条裟罗","雷电将军","菲谢尔"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
