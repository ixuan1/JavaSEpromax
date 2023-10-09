package Java基础.File_IO.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
    /**
     * 判断文件类型，获取文件信息
     *
     */

    public static void main(String[] args) {

        //1.public boolean exists() 判断当前文件对象，对应的文件路径是否存在，存在返回true

        File f1 = new File("src/File_IO/d1_file/ixuan.txt");
        System.out.println(f1.exists());

        //2.public boolean isFile() 判断当前文件对象指代的是否是文件，是文件返回true，反之
        System.out.println(f1.isFile());

        //3.public boolean isDirectory() 判断当前文件对象指代的是否是文件夹，是文件夹返回true，反:
        File f2 = new File("D:\\CODE\\interview-and---let-code-master\\src\\File_IO\\d1_file\\ixuan.txt");
        System.out.println(f2.isDirectory());

        //4.public String getName()获取文件的名称 (包含后缀)
        System.out.println(f2.getName());

        //5.public String getAbsolutePath() 获取绝对路径
        System.out.println(f2.getAbsolutePath());


        //6.public long length() 获取文件的大小，返回字节个数
        System.out.println(f2.length());

        //7.public long lastModified() 获取文件的最后修改时间。
        long l = f2.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(sdf.format(l));

        //8.public String getPath() 获取创建文件对象时，使用的路径
        System.out.println(f2.getPath());
        System.out.println(f1.getPath());


    }
}
