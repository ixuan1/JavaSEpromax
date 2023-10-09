package Java基础.File_IO.d4_byte_steam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 目标：掌握文件字符输入流，每次读取一个字节。
 */
public class FileInputStreamTest1 {

    public static void main(String[] args) throws Exception {
        //1.创建文件字节输入流管道，与源文件接通
        //爆红因为防止文件名字错误，不存在，需要抛异常
        //使用多态的写法，左边父类，右边实现类    ，父类引用指向子类对象
        //InputStream is = new FileInputStream(new File("src/Java基础/File_IO/ababa.txt"));
        //简易写法，推荐使用
        InputStream is = new FileInputStream("src/Java基础/File_IO/ababa.txt");



        //2.开始读取文件的字节数据
        //public int read() ：每次读取一个字节，没有数据就返回-1
        //int b1 = is.read();
        //System.out.println(b1);
        //
        //int b2 = is.read();
        //System.out.println(b2);

        //3.使用循环读取字节数据
        int b; //用于记住读取的字节
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        //读取数据的性能很差
    //    读取汉字输出乱码。无法避免因为是，中文是三个字节，UTF-8.
        //流使用完毕后，必须关闭，释放系统资源
        is.close();
    }

}
