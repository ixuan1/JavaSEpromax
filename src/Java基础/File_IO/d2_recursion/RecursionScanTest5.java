package Java基础.File_IO.d2_recursion;

import java.io.File;

/**
 * 掌握文件搜索的实现
 */
public class RecursionScanTest5 {
    public static void main(String[] args) {

        //1.找到
        searchFile(new File("D:/aaa/"),"1234.txt");
    }

    public static void searchFile(File dir, String name) {

        //1.如果dir路径不存在 或者为null 或者文件夹为空，或者为文件 return
        if (!dir.exists() || dir == null || dir.isFile()){
            //无法搜索
            return;
        }
        //2.找出该目录下所有一级文件对象
        File[] files = dir.listFiles();
        //判断获取的文件夹是否为空
        if ( files !=null && files.length >0) {
            //3.遍历所有一级对象
            for (File file : files) {
                //判断是否文件，是文件则判断名字，否则是文件夹则递归处理
                if (file.isFile()) {
                    if (file.getName().contains(name)) {
                        System.out.println("已找到"+file.getAbsolutePath() + "文件：" + name);
                    }
                } else searchFile(file, name);
            }
        }


    }


}
