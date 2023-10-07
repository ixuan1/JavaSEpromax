package Java基础.集合框架.D2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 目标：完成电影信息的展示
 *
 */

public class CollectionTest04 {
    public static void main(String[] args) {
        //1.创建一个集合容器负责存储多部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("提瓦特的奇妙冒险",9.9,"旅行者"));
        movies.add(new Movie("旅行者的后宫日常",9.8,"旅行者、雷电冠军"));
        movies.add(new Movie("提瓦特大陆的厨神",9.9,"雷电将军"));
        System.out.println(movies);

        //使用foreache进行遍历输出
        movies.forEach(movie -> {
            System.out.print("电影名称："+movie.getName()+"---");
            System.out.print("电影评分："+movie.getScore()+"---");
            System.out.print("电影主演："+movie.getActor()+"---");
            System.out.println();
        });
    }
}
