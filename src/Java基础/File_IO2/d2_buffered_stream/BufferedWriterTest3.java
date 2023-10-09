package Java基础.File_IO2.d2_buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest3 {
    public static void main(String[] args) {
        try (
                FileWriter fw = new FileWriter("src/Java基础/File_IO2/newFile.txt",true);
                //创建字符缓冲输出流管道包装原始的输出流管道
                BufferedWriter bfw = new BufferedWriter(fw);

                ){
            bfw.write('0');
            //新增换行
            bfw.newLine();

            bfw.write("刘德华");

            bfw.write("刘德华为什么不演反派",3,6);
            char[] chars = {'6','我','啊','啊','你'};

            bfw.write(chars);
            bfw.write(chars,1,2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
