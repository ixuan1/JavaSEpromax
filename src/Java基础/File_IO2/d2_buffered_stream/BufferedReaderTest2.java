package Java基础.File_IO2.d2_buffered_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 目标:掌握字符缓冲输入流的使用
 */
public class BufferedReaderTest2 {
    public static void main(String[] args) {
        try (
                //1.创建文件字符输入流管道与源文件接通
                FileReader fr = new FileReader("src\\Java基础\\File_IO2\\d1_char_stream\\newFile.txt");
                //2.定义一个字符缓冲输入流包装原有的文件字符输入流管道
                //BufferedReader 有一个新增的方法,可以读取整行数据
                BufferedReader br = new BufferedReader(fr);
                ){

            ////创建字符数组接收每次读取的字符数据
            //char[] buffer = new char[3];
            //int len;//记住每次读取的字符数量
            //
            //while ((len = br.read(buffer)) != -1){
            //    System.out.print(new String(buffer,0,len));
            //}
            String len;//定义字符串接收每次读取的字符数据
            while ((len = br.readLine()) != null){
                System.out.println(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
