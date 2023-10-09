package Java基础.考试题;

import java.util.*;

public class prisoner {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        //使用set的不重复特性，加入不重复元素
        while (set.size() < 10) {
            int nextInt = random.nextInt(199)+1;
            set.add(nextInt);
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
         //collection的addall方法把set里面的元素加到list里面
         list.addAll(set);
         Collections.shuffle(list);
        list1.addAll(list);

        System.out.println(list);

        //3。循环删除奇数
        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                if ((i+1)%2 != 0){
                    list.remove(i);
                }
            }

        }
        System.out.println(list1);
        System.out.println(list);
        System.out.println(list1.lastIndexOf(list.get(0)));
    }




}
