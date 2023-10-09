package Java基础.考试题.q2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        String[] strings = userStrs.split("#");
        System.out.println(Arrays.toString(strings));

        Stream<String> stream = Arrays.stream(strings);

        ArrayList<User> users = new ArrayList<>();

        for (String s :
             strings) {
            String[] split = s.split(":");
            User user = new User();
            user.setId(Long.valueOf(split[0]));
            user.setName(split[1]);
            user.setGender(split[2]);
            //字符串转未localdate
            LocalDate parse = LocalDate.parse(split[3]);
            user.setBirthday(parse);
            users.add(user);
        }

        System.out.println(users.toString());
        System.out.println(users.size());


        Map<String, Long> collect = users.stream().collect(Collectors.groupingBy(user -> user.getName(), Collectors.counting()));
        for (Map.Entry<String, Long> map:
             collect.entrySet()) {
            System.out.println(map.getKey() + ":" + map.getValue() + "次");
        }
    }
}
