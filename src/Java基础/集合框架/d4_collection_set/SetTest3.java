package Java基础.集合框架.d4_collection_set;


import java.util.HashSet;
import java.util.Set;

/**
 * 目标：白定义的类型的对象，比如两个内容一样的学生对象，如果让HashSet集合能够去重复!
 */
public class SetTest3 {
    public static void main(String[] args) {

        //创建学生对象
        Student S1 = new Student("优菈", 19, "女", 169.3);
        Student S2 = new Student("凝光", 18, "女", 169.3);
        Student S3 = new Student("凝光", 18, "女", 169.3);
        Student S4 = new Student("夜兰", 20, "女", 169.3);

        //创建Hashset集合
       Set<Student> girls = new HashSet<>();
       girls.add(S1);
       girls.add(S2);
       girls.add(S3);
       girls.add(S4);
        System.out.println(S2.hashCode());
        System.out.println(S3.hashCode());
        System.out.println(girls);
    }
}
