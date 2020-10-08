package main;

public class CompareToSample {
    public static void main(String[] args) {
        String str1 = "Hello ITA5";
        String str2 = "Hello";

        //compares str1 to str2
        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

    }
}
