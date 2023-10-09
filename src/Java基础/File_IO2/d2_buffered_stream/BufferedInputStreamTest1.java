package Java基础.File_IO2.d2_buffered_stream;

import java.io.*;

/**
 * 目标：掌握字节缓冲流的使用
 */
public class BufferedInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        try (            //1.创建一个字节输入流管道与源文件接通
                         InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\car\\car (6).jpg");
                         //定义一个字节缓冲输入包装原始的字节输入流
                         InputStream bis = new BufferedInputStream(is);
                         //2.创建一个字节输出流管道与目标文件接通
                         OutputStream os = new FileOutputStream("D:\\迅雷下载\\111\\1.jpg.csa");
                         //定义一个字节缓冲输出流包装原始的字节输出流
                         OutputStream bos = new BufferedOutputStream(os);
        ) {
            //3.创建字节数组，负责转移字节数据
            byte[] buffer = new byte[1024]; // 1KB

            //4.从字节输入流中读取字节数据，写出去到字节输出流，读多少，写多少
            int len; //记录每次读了多少个字节
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
