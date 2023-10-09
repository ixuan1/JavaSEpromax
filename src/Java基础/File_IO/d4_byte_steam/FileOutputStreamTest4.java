package Java基础.File_IO.d4_byte_steam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 目标：掌握文件字节输出流FileOutputStream的使用
 */
public class FileOutputStreamTest4 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输出流管道与目标文件接通，，，，会自动创建
        //默认覆盖管道，
        OutputStream os = new FileOutputStream("src\\Java基础\\iii.txt");

        //追加数据的管道.true
        //OutputStream os = new FileOutputStream("src\\Java基础\\iii.txt",true);
        //2.开始写字节数据

        os.write(97);  //97是一个字节，代表a
        os.write('s'); //'s'也是一个字节
        //os.write('赖'); //汉字三个字节， 默认只能写出去一个字节 [ooo]

        //写字符串方法
        byte[] bytes = "我爱倪,梁小姐12355".getBytes();
        os.write(bytes);

        os.write(bytes,0,21);
        //通用换行符  \r\n
        os.write("\r\n".getBytes());
        os.close();
    }
}
