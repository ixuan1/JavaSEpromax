package Java基础.File_IO.d4_byte_steam;


import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 目标：掌握文件字节输入流，每次读取多个字节
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        //1.创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream("src\\Java基础\\File_IO\\测试多个字节.txt");

        ////2.开始读取文件中的字节数据，每次读取多个字节
        ////使用byte数组接收字节，象征桶一样
        //byte[] buffer = new byte[3];
        ////每次读取多个字节到字节数组中去，返回读取的字节数量，读取完毕会返回-1
        //int len = is.read(buffer);
        ////注意要读多少，倒出多少
        //String rs = new String(buffer);
        //System.out.println(rs);
        //System.out.println(len);

        //3.使用循环改造读取文件
        byte[] buffer = new byte[3];
        int len; // 记住每次读取了多少个字节.
        while ((len = is.read(buffer)) != -1) {
            String rs = new String(buffer,0,len);
            System.out.print(rs);
        }
        is.close();
    }
}
