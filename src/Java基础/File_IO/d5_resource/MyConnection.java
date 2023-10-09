package Java基础.File_IO.d5_resource;

public class MyConnection implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("该资源连接已经执行释放");
    }
}
