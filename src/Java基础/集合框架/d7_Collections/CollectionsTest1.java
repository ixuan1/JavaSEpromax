package Java基础.集合框架.d7_Collections;

import Java基础.集合框架.d4_collection_set.Student;

import java.util.*;

/**
 * 掌握collections集合工具类的使用
 */
public class CollectionsTest1 {
    public static void main(String[] args) {

        //1、public static <T>boolean addAll(Collection<? super T>Cr...element) 为集合批量添加数据
        Set<String> set = new HashSet<>();
        List<String> names = new ArrayList<>();
        Collections.addAll(set,"纳西妲","可莉","甘雨","早柚");
        Collections.addAll(names,"纳西妲","可莉","甘雨","早柚");
        System.out.println("set是"+set);

        // 2、public static void shuffle(List<?> List): 打乱List集合中的元素顺序。
        Collections.shuffle(names);
        System.out.println(names);

        //3、public static<> void sort(List<T> list):List集合中的元素进行升序排序.
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(list,10,56,32,44,9,11,2);
        Collections.addAll(set1,10,56,32,44,9,11,2);

        Collections.sort(list);
        System.out.println(list);

            //对自定义对象进行排序，需要实现comparable接口重写compareTo方法
        List<Student> girls = new ArrayList<>();
        girls.add(new Student("优菈",18,"女",175.9));
        girls.add(new Student("凝光",19,"女",180.6));
        girls.add(new Student("皇女",16,"女",163.4));
        girls.add(new Student("香菱",18,"女",163.4));
        //Collections.sort(girls);
        System.out.println(girls);

        //4.public static <T> void sort (List<T> list, Comparator<? super> c) :对List集合中元素，按照比较器对象指定的规则达
        Collections.sort(girls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(girls);

    }
}
