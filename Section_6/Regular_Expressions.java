package Section_6;

public class Regular_Expressions {
    
    public static void main(String[] args) {
        
        String str1 = "a";
        System.out.println(str1.matches("."));
        System.out.println(str1.matches("[a]"));

        String str2 = "a";
        System.out.println(str2.matches("[abc]"));
        System.out.println(str2.matches("[^abc]"));
    }
}
