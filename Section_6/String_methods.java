package Section_6;

public class String_methods {
    
    public static void main(String[] args) {
        
        // Here we are gonna learn about the different methods in Java String Class One by one 

        String str1 = "JAVA"; String str2 = "java"; String str3 = "Python"; String str4 = "python";

        method1(); method2(); method3(); method4(); method5(); method6(); method7(); method8(); method9(str1, str2, str3, str4); method10(str1, str2, str3, str4); method11(str1, str2, str3, str4); method12();
    }

    public static void method1() {

        // int length() method

        String str1 = "Java";
        int l = str1.length();
        System.out.println(l);
    }

    public static void method2() {

        // String toLowerCase() method
        // String toUpperCase() method

        String str1 = "Java";
        String str2 = str1.toLowerCase();
        System.out.println("Lower case : " + str2);

        String str3 = "Java";
        String str4 = str3.toUpperCase();
        System.out.println("Lower case : " + str4);
    }

    public static void method3() {

        // String trim() method 
        // It will remove the extra spaces in an array of the string
    
        String str1 = "  hello";
        System.out.println(str1);

        String str2 = str1.trim();
        System.out.println(str2);
    }

    public static void method4() {

        // String subString() methods 
        // Make a new string by taking only the strings whoose index is given 

        String str1 = "Welcome dear Sourav Kumar";

        String str2 = str1.substring(8);
        System.out.println(str2);

        System.out.println(str1.substring(8, 20));

    }

    public static void method5() {

        // String replace() method 
        // This method will simply replace all the words/letters/characters to another one of our choice 

        String str1 = "Welcome dear Sourav Kumar";
        String str2 = str1.replace('a', 'M');

        System.out.println(str2);
    }

    public static void method6() {

        // boolean startsWith(String s) method and boolean endsWith(String s) method
        // This method checks if the String starts or ends with that word or not 

        String str1 = "Mr. Shahrukh Khan ";

        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah"));

        // it means that if it start with Shah from the 4th index ??
        System.out.println(str1.startsWith("Shah", 4));

        // Here if we do not give space after Khan then it will be False and so we need to mention the entire same words here also 
        System.out.println(str1.endsWith("Khan "));
    }

    public static void method7() {

        // char charAt(int Index) 
        // Simply provide us the character present in that index of the String array 

        String str1 = "Let's achive this great milestone ! ";

        // we are gonna print the entire String by the help of while loop
        int i = 0;
        while (i < str1.length()) {
            System.out.print(str1.charAt(i));
            i++;
        }
        System.out.println();
    } 

    public static void method8() {

        // int indexOf(String s) and the int lastIndexOf(String s)
        // indexOf will provide us the index of the character from left to right and the lastIndexOf will give us the index of the character from right side 

        String str1 = "www.udemy.co.in";

        System.out.println(str1.indexOf('.'));
        System.out.println(str1.indexOf('.', 4));
        System.out.println(str1.lastIndexOf(".", 3));
    }

    public static void method9(String str1, String str2, String str3, String str4) {

        // boolean equals(String s) method and boolean equalsIgnoreCase(String s) method
        // Compares two strings if both are equal or not and also if by ignoring the case are equal or not 

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    public static void method10(String str1, String str2, String str3, String str4) {

        // int compareTo() method 
        // if the result is -ve then it means that the first one comes first in dictionary order and if it's +ve then it means that first one comes after the second one in dictionary order 

        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str1));
        System.out.println(str1.compareTo(str1));
        System.out.println(str1.compareTo(str2));
    }

    public static void method11(String str1, String str2, String str3, String str4) {

        // boolean contains(String s) method 
        // It will check if the String contains the specified word or character or not ?/

        String str = "The great wall of china";
        System.out.println(str.contains("wall"));
    }

    public static void method12() {

        // concat method is used to combine the two string to a single one 

        String str1 = "Hello there guys ";
        String str2 = "I am happy to meet you here! ";

        System.out.println(str1.concat(str2));
    }
}
