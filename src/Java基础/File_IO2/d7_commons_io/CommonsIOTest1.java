package Java基础.File_IO2.d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIOTest1 {
    public static void main(String[] args) throws Exception {
        FileUtils.deleteDirectory(new File("D:\\迅雷下载\\111"));
    }

}
