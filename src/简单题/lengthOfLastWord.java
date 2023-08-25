package 简单题;

public class lengthOfLastWord {
    public static int method(String s){
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "a b Whoskjdalds     ";

        System.out.println(method(s));
    }
}
