package Java基础.集合框架.d4_collection_set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 又要去重又要有序，所以应用场景比如最近访问、LRU缓存
 * 目标：掌握treeSet集合的使用
 * 基于红黑树实现不重复、无索引、可排序(默认升序排序，按照元素的大小，由小到大排序)
 */
public class SetTest4 {
    public static void main(String[] args) {
        //Set<Integer> set1 = new TreeSet<>();
        //set1.add(5);
        //set1.add(2);
        //set1.add(2);
        //set1.add(3);
        ////默认去重复
        //System.out.println(set1);

        //直接使用自定义对象，会报错，因为不知道排序规则，所以要自定义排序规则
        //因为年龄有相同所以只显示一个
        //方式二：使用比较器对象指定规则

        //按照身高升序
        Set<Student> girls = new TreeSet<>();
        girls.add(new Student("优菈",18,"女",175.9));
        girls.add(new Student("凝光",19,"女",180.6));
        girls.add(new Student("皇女",16,"女",163.4));
        girls.add(new Student("香菱",18,"女",163.4));

        System.out.println(girls);


    }
}
