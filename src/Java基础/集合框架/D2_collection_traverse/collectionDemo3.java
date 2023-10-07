package Java基础.集合框架.D2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class collectionDemo3 {
    public static void main(String[] args) {
        //new一个collection数组，多态写法
        Collection<String> c1 = new ArrayList();
        c1.add("凝光");
        c1.add("刻晴");
        c1.add("优菈");
        c1.add("甘雨");
        //[凝光，刻晴、优菈，甘雨]
        // it

        //collection继承了Iterable,可以使用期foreach方法

        //1.使用new的匿名内部类进行
        c1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //2.使用lambda表达式
        c1.forEach((String s) -> {
                System.out.println(s);
        });

        //3.只有一个参数时，类型和括号可以省掉  使用lambda表达式
        c1.forEach(s -> {
            System.out.println(s);
        });

        //4. 使用lambda表达式
        c1.forEach(s -> System.out.println(s));

        //5.方法引用，前后对象一样时，可以用方法引用
        c1.forEach(System.out::println);






    }
}
