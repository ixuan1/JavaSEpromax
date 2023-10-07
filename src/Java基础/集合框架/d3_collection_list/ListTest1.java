package Java基础.集合框架.d3_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：掌握list集合的常用方法
 * list集合因为支持索引，所以多了很多与索引相关的方法，当然，Collection的功能List也都继承了。
 方法名称                             说明
 void add(int index,E element)   在此集合中的指定位置插入指定的元素
 E remove(int index)              删除指定索引处的元素，返回被删除的元素
 E set(int index,E element)     修改指定索引处的元素，返回被修改的元素
 get(int index)E                返回指定索引处的元素



 */
public class ListTest1 {
    public static void main(String[] args) {
        //一行经典代码
        List<String> list = new ArrayList<>();
        list.add("凝光");
        list.add("优菈");
        list.add("香菱");
        list.add("芙宁娜");
        list.add("千羽");
        System.out.println(list);

        //1.在此集合中的指定位置插入指定的元素  public void add(int index, E element);
        list.add(2,"八重神子");
        System.out.println(list);

        //2. E remove(int index):删除指定索引处的元素，返回被删除的元素
        String s = list.remove(2);
        System.out.println("删除的元素：" + s);

        //3. get(int index)E:返回指定索引处的元素
        System.out.println(list.get(2));

        //4. E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        System.out.println("修改的元素" + list.set(1, "刻晴"));
        System.out.println("修改后的述责" + list);
    }
}
