package Java基础.File_IO.d1_file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 掌握文件的遍历方式
 */
public class FileTest4 {
    public static void main(String[] args) {
        //1.public String[] list()  获取当前目录下的“一级文件名称”到一个字符串数组中
        File f1 = new File("D:\\BaiduNetdiskDownload\\瓜娃");
        String[] files = f1.list((dir, name) -> {
            if (name.contains("day")){
                return true;
            }else  return false;

        });
        //for (String file : files) {
        //    System.out.println(file);
        //}

        //2.public String[] listFiles()  获取当前目录下的“一级文件名称”到一个File数组中
        //目标：拿到包含day的文件，并进行改名day数从10开始

        //1.拿到包含day的文件
        File[] listFiles = f1.listFiles(((dir, name) -> name.contains("day") ? name.contains("day") : false));
        for (File file : listFiles) {
            //2.拿到文件名字
            String fileName = file.getName();
            String frontName = fileName.substring(0, fileName.indexOf("y")+1);
            String midName = fileName.substring(fileName.indexOf("y")+1, fileName.indexOf("、"));
            String lastName = fileName.substring(fileName.indexOf("、"));
            String newName = frontName + (Integer.valueOf(midName)+9) + lastName;
            //3.更改名字
            file.renameTo(new File(f1,newName));

            System.out.println(file.getName());
        }

    }

}
