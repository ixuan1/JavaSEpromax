package Java基础.File_IO2.d2_buffered_stream;

import Java基础.File_IO.d5_resource.MyConnection;

import java.io.*;

import static java.lang.System.currentTimeMillis;

/**
 * 目标:观察
 */
public class TimeTest4 {
    private static final String SRC_FILE = "D:\\迅雷下载\\片子\\不死者之王第四季03.mp4";
    private static final String TARGET_FILE = "D:\\迅雷下载\\";
    public static void main(String[] args) {
        //copy1();
        copy2();
        //copy3();
        copy4();


    }


    //一次读取一个字节的形式复制文件
    private static void copy1() {
        long startTime = System.currentTimeMillis();
        try (
                // 1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(TARGET_FILE  + "2.aaa");
        ) {
            int len;//接收读取的字节
            while ((len = is.read()) != -1) {
                os.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("一个字节一个字节复制耗时" + (endTime - startTime) / 1000.0 + "s");
    }

    //按照字节数组的形式复制文件
    private static void copy2() {
        long startTime = System.currentTimeMillis();
        try (
                // 1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(TARGET_FILE + "2.MP4");
        ) {
            //3.创建字节数组，负责转移字节数据
            byte[] buffer = new byte[1024*64]; // 1KB

            //4.从字节输入流中读取字节数据，写出去到字节输出流，读多少，写多少
            int len; //记录每次读了多少个字节
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字节数组复制耗时" + (endTime - startTime) / 1000.0 + "s");
    }

    //使用字节缓冲流一次读取一个字节的形式复制文件
    private static void copy3() {
        long startTime = System.currentTimeMillis();
        try (
                // 1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(TARGET_FILE  + "2.aaa");
        ) {
            int len;//接收读取的字节
            while ((len = is.read()) != -1) {
                os.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字节缓冲流一个字节一个字节复制耗时" + (endTime - startTime) / 1000.0 + "s");
    }

    //使用字节缓冲流按照字节数组的形式复制文件
    private static void copy4() {
        long startTime = System.currentTimeMillis();
        try (
                // 1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);

                BufferedInputStream bis = new BufferedInputStream(is,1024*64);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(TARGET_FILE + "4.MP4");
                BufferedOutputStream bos = new BufferedOutputStream(os,1024*64);
        ) {
            //3.创建字节数组，负责转移字节数据
            byte[] buffer = new byte[1024*64]; // 1KB

            //4.从字节输入流中读取字节数据，写出去到字节输出流，读多少，写多少
            int len; //记录每次读了多少个字节
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用字节缓冲流按照字节数组的形式复制文件耗时" + (endTime - startTime) / 1000.0 + "s");
    }
}
