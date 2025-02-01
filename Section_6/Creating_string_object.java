package Section_6;

public class Creating_string_object {
    
    public static void main(String[] args) {
        
        String str1 = "Java Program";

        String str2 = new String("Java");

        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);

        byte b[] = {65,66,67,68};
        String str4 = new String(b);

        System.out.println(str4);
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }
}
