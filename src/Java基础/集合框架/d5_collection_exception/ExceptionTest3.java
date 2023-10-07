package Java基础.集合框架.d5_collection_exception;

import Java基础.集合框架.d4_collection_set.Student;

import java.util.*;

/**
 * 使用迭代器遍历集合时，又同时在删除集合中的数据，程序就会出现并发修改异常的错误。
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        List<Student> girl2 = new ArrayList<>();
        girl2.add(new Student("优菈",19,"女",175.9));
        girl2.add(new Student("凝光",20,"女",180.6));
        girl2.add(new Student("皇女",23,"女",163.4));
        girl2.add(new Student("香菱",18,"女",163.4));

        //需求：找出年龄大于20的，并删除
        System.out.println(girl2);

        //Iterator<Student> iterator = girl2.iterator();
        ////1.使用迭代器遍历集合，但是用迭代器自己的删除方法
        //while (iterator.hasNext()) {
        //    Student next = iterator.next();
        //    if (next.getAge() >= 20){
        //        iterator.remove();
        //        System.out.println("删除了" + next.getName());
        //    }
        //}
        //System.out.println(girl2);


        //2.使用for循环，记得i--或者倒着遍历
        for (int i = 0; i < girl2.size(); i++) {
            Student s = girl2.get(i);
            if (s.getAge() >= 20){
                girl2.remove(s);
                i--;
            }
        }
        System.out.println(girl2);
    }
}
