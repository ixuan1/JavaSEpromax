package Java基础.File_IO2.d1_char_stream;

import java.io.FileWriter;

/**
 * 目标：搞清楚字符输出流使用时的注意事项
 */
public class FileWriterTest3 {
    public static void main(String[] args) throws Exception {
        //先写到内存的缓冲区，最后通过一种机制，通过系统调用写到文件中去
        FileWriter fw = new FileWriter("src/Java基础/File_IO2/newFile.txt");
        fw.write(97);
        fw.write("\r\n");

        fw.write('d');
        fw.write("\r\n");

        fw.write("我要搞计算机");
        fw.write("\r\n");

        fw.flush();//刷新流需要刷新流才能写入数据
        fw.write("我我拿数据的");
        fw.flush();

        fw.close(); //关闭流，关闭流包含刷新流操作！，关闭流了不能再使用流


    }
}
