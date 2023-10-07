package Java基础.集合框架.d3_collection_list;

import java.util.LinkedList;

/**
 * 掌握LinkedList的方法
 */
public class ListTest3 {
    public static void main(String[] args) {
        //不能使用多态写法
        LinkedList<String> queen = new LinkedList<>();

        //模拟队列，先进先出，后进后出
        //入队
        queen.addLast("一号");
        queen.addLast("二号");
        queen.addLast("三号");
        queen.addLast("4号");
        System.out.println(queen);

        //出队
        System.out.println(queen.removeFirst());
        System.out.println(queen.removeFirst());
        System.out.println(queen.removeFirst());
        System.out.println(queen);

        System.out.println("-----------------------------");
        //设计栈
        //创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();
        //压栈（push）就是实现了addfirst
        stack.addFirst("第1颗子弹");
        stack.push("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        System.out.println(stack);


        //出栈（pop）
        System.out.println("打出了"+stack.removeFirst());
        System.out.println("打出了"+stack.pop());
        System.out.println("打出了"+stack.removeFirst());
        System.out.println("打出了"+stack.removeFirst());

    }
}
