package Java基础.File_IO.d4_byte_steam;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 目标：使用文件字节输入流一次读取完文件的全部字节
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        //1.一次性读取完文件的全部字节到一个字节数组中去
        //创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src\\ixuan.txt");

        //2.准备一个字节数组，大小与文件的大小整好一样大
        //File file = new File("src\\ixuan.txt");
        //long size = file.length();
        ////文件大小一般不会超过int，所以直接强转
        //byte[] buffer = new byte[(int) size];
        //int len = is.read(buffer);
        //
        //String rs = new String(buffer);
        //System.out.println(rs);
        //
        //System.out.println(size);
        //System.out.println(len);

        //方式二：使用readAllBytes()
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));


    }
}
