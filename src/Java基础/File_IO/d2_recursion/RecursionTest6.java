package Java基础.File_IO.d2_recursion;

import java.io.File;

/**
 * 删除非空文件夹
 */
public class RecursionTest6 {
    public static void main(String[] args) {

        //1.找到
        deleteFile(new File("D:/bbb"));
    }

    public static void deleteFile(File dir) {
        //1.如果文件是空的，或者不存在，return不删除
        if (dir==null || !dir.exists()) {
            return;
        }

        //2.如果是文件，则直接删除
        if (dir.isFile()) {
            dir.delete();
            return;
        }
        //3.是一个文件夹,获取其所有一级对象
        File[] listFiles = dir.listFiles();
        //4.判断其是否有权限获得，无权限获得
        if (listFiles == null ){
            return;
        }

        if (listFiles.length == 0){
            dir.delete();
            return;
        }
        //5.有内容的文件夹
        if (listFiles.length > 0){
            //遍历一级对象
            for (File file : listFiles) {
                if (file.isFile()) {
                    file.delete();
                    //如果是文件夹则递归删除
                } else deleteFile(file);
            }
        }
        dir.delete();

    }

}
