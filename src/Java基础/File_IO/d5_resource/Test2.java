package Java基础.File_IO.d5_resource;

import java.io.*;

/**
 * 目标：使用try -catch 资源释放
 */
public class Test2 {
        public static void main(String[] args) throws Exception {
            InputStream is =null;
            OutputStream os =null;
            try {
                //需求：复制照片
                //1.创建一个字节输入流管道与源文件接通
                 is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\car\\car (6).jpg");

                //2.创建一个字节输出流管道与目标文件接通
                 os = new FileOutputStream("D:\\迅雷下载\\111\\12.jpg");

                //3.创建字节数组，负责转移字节数据
                byte[] buffer = new byte[1024]; // 1KB

                //4.从字节输入流中读取字节数据，写出去到字节输出流，读多少，写多少
                int len; //记录每次读了多少个字节
                while ((len = is.read(buffer)) != -1) {
                    os.write(buffer,0,len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //爆红是因为需要在try外面声明好资源
                if (os != null)os.close();
                if (is != null) is.close();
            }
        }

}
