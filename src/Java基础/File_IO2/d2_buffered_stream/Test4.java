package Java基础.File_IO2.d2_buffered_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 目标:获取文本内容,打乱顺序,写入新文件
 */
public class Test4 {
    public static void main(String[] args) {
        //1.读取文本
        //创建字符缓冲输入流管道与文件接通
        try (
                BufferedReader bfr = new BufferedReader(new FileReader("src/Java基础/File_IO2/csb.txt"));

                BufferedWriter bfw = new BufferedWriter(new FileWriter("src/Java基础/File_IO2/csb-bak.txt"));
                ){
            //使用ArrayList接收每段文本
            List<String> list = new ArrayList<>();

            //读取文本,
            String len;//定义字符串接收文本
            while ((len = bfr.readLine()) != null) {
                list.add(len);
            }
            //使用Collections 打乱顺序
            Collections.shuffle(list);

            //写入文件
            for (String s : list) {
                bfw.write(s);
                bfw.newLine();
            }
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

