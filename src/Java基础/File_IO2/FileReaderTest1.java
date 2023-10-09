package Java基础.File_IO2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * 目标：掌握文件字符输入流，每次读取一个字符
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        //多态写法
        try (
                //1.创建一个文件字符输入流管道，与源文件接通
                Reader fr = new FileReader("src/Java基础/File_IO2/file.txt");
        ) {
            //2.读取文本文件的内容
            //int c;//记住每次读取的字符编号
            //while ((c = fr.read()) != -1) {
            //    System.out.print((char) c);
            //}
            //每次读取一个字符，性能肯定是比较差的

            //3.每次读取多个字符
            char[] buffer = new char[3];//定义字符数组接收read的字符
            int len; //记住每次读取了多少个字符

            while ((len = fr.read(buffer)) != -1) {
                //读取多少、倒出多少
                System.out.print(new String(buffer, 0, len));
            }
            //性能是比较不错

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
