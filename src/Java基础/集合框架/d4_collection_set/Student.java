package Java基础.集合框架.d4_collection_set;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String sex;
    private double height;

    public Student(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //自定义排序规则
    //方式一,实现comparable接口


    @Override //只要两个对象内容一样，返回true
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    //只要两个对象内容一样，返回的哈希值就一样
    @Override
    public int hashCode() {
        //根据姓名、年龄、性别计算哈希值
        return Objects.hash(name, age, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //this o
    @Override
    public int compareTo(Student o) {
        // 如果认为左边对象大于右边对象返回正整数
        // 如果认为左边对象小于右边对象返回负整
        // 如果认为左边对象等于右边对象返回0
        // 需求: 按照年龄升序排序
        if (this.age - o.age == 0){
            return Double.compare(this.height,o.height);
        }
        return this.age - o.age;
    }
}
