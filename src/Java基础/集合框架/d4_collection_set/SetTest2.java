package Java基础.集合框架.d4_collection_set;

/**
 * Java中的所有对象，都可以调用Object类听的hashcode方法
 *  public int hashCode(): 返回对象的哈希值。
 *  同一个对象多次调用hashcode(0方法返回的哈希值是相同的。
 *  不同的对象，它们的哈希值一般不相同，但也有可能会相同(哈希碰撞）
 *
 */
public class SetTest2 {
    public static void main(String[] args) {




        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
