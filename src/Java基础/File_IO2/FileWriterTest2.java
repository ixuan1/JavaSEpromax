package Java基础.File_IO2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {
    public static void main(String[] args) {
        try (
                //0.创建一个文件字符输出流管道与目标文件接通
                //覆盖管道
                //FileWriter fw = new FileWriter("src/Java基础/File_IO2/newFile.txt");
                //追加数据的管道
                FileWriter fw = new FileWriter("src/Java基础/File_IO2/newFile.txt",true);
                ){
            //1.void write(int c) 写一个字符
            fw.write('9');
            fw.write("\r\n");

            //void write(String str) 写一个字符串
            fw.write("sasdsa");
            //void write(String str, int off, int len) 写一个字符串的一部分

            fw.write("asdsadsad",3,6);
            //void write(charl] cbuf) 写入一个字符数组
            char[] chars = {'6','我','啊','啊','你'};
            fw.write(chars);
            //void write(charl] cbuf int off int len) 写入字符数组的一部分
            fw.write(chars,1,2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
