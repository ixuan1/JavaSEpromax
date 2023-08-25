package 链表;

public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode nodeSta = new ListNode(0); //创建首节点
        ListNode nextNode; //声明一个变量来在移动过程中指向
        nextNode = nodeSta;

        //创建链表
        for (int i = 0; i < 10; i++) {
            ListNode node = new ListNode(i);
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        nextNode = nodeSta;
        print(nextNode);
        //插入节点
//        while( nextNode != null){
//            if (nextNode.val ==5 ){
//                ListNode newnode = new ListNode(99);
//
//            }
//        }

    }

    static  void print(ListNode listNode){
        //创建链表节点
        while( listNode != null){
            System.out.println("节点:"+listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }










    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while(list1 != null && list2 != null){
            if (list1.val <= list2.val){
                prev.next = list1;
            } else {
                prev.next = list2;
            }
            prev = prev.next;
        }
        prev.next = list1 == null ? list2 : list1;
        return prehead.next;
    }


}
