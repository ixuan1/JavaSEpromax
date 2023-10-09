package Java基础.File_IO.d1_file;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    /**
     * 掌握创建文件，删除文件的方法
     */

    public static void main(String[] args) throws Exception {

        //1.创建新文件夹 public boolean createNewFile() ,需要抛异常,若文件已存在则返回false
        File file = new File("D:\\BaiduNetdiskDownload\\瓜娃");
        System.out.println(file.createNewFile());

        //2.创建文件夹  只能创建一级文件夹，public boolean mkdir()
        File f2 = new File("D:\\CODE\\Test");
        System.out.println(f2.mkdir());

        //3.创建文件夹，可以创建多级文件夹
        File f3 = new File("D:\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdirs());

        //4.删除文件，或者空文件，注意：不能删除非空文件夹
        System.out.println(f2.delete());
        System.out.println(f3.delete());
        System.out.println(file.delete());
    }
}
