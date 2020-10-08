package main;

public class EqualsAndEqualsIgnore {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "WORLD";
        String str3= "HELLO";
        //ignore case
        System.out.println("str1 is equals to str2:"+str1.equalsIgnoreCase(str2));
        //should be identical
        System.out.println("str1 is equals to str3:"+str1.equals(str3));
    }
}
