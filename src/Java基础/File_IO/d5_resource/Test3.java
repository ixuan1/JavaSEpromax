package Java基础.File_IO.d5_resource;

import java.io.*;

/**
 * 目标：使用jdk7后有的 try with resource方法
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        try (
                //这里只能放资源对象，（流）
                //什么是资源，资源都是会实现AutoCloseable接口。资源都会有close方法
                //用完之后会被自动调用其close方法完成资源的释放
                // 1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\car\\car (6).jpg");
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("D:\\迅雷下载\\111\\12.jpg");

                MyConnection conn = new MyConnection()
        ) {
            //3.创建字节数组，负责转移字节数据
            byte[] buffer = new byte[1024]; // 1KB

            //4.从字节输入流中读取字节数据，写出去到字节输出流，读多少，写多少
            int len; //记录每次读了多少个字节
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println(conn);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
