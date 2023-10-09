package Java基础.File_IO.d1_file;

import java.io.File;

/**
 * 目标：掌握File创建对象，代表具体文件的方案
 */
public class FileTest1 {
    public static void main(String[] args) {
        //1.创建一个File类，指代某个具体的文件
        //方式一
        //File file = new File("D:\\CODE\\abc.txt");
        //方式二
        //File file = new File("D:/CODE/abc.txt");
        //方式三
        File file = new File("D:"+ File.separator+ "CODE"+File.separator+"abc.txt");
        System.out.println(file.length());//文件大小

        //File对象定位文件夹
        File f2 = new File("D:\\CODE"); //我们程序只会取文件的大小，操作系统会取文件里所有的数据的大小
        System.out.println(f2.length());

        //注意：FIle对象可以指代一个不存在的文件路径
        File f3 = new File("D:\\CODE\\adsadas.txt");
        System.out.println(f3.length());
        System.out.println(f3.exists());

        //我现在要定位的文件是在模块中，应该怎么定位呢
        //绝对路径：带盘符的
        //File f4 = new File("D:\\CODE\\interview-and---let-code-master\\src\\File_IO\\d1_file\\ixuan.txt");
        //想对路径（重点）， 不带盘符：默认直接去工程中寻找文件的
        File f5 = new File("src\\File_IO\\d1_file\\ixuan.txt");

        //System.out.println(f4.length());
        System.out.println(f5.length());
        System.out.println(f5.getAbsoluteFile());

    }
}
