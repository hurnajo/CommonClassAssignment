package main;

public class EqualsMethodSample {
    public static void main(String[] args)
    {
        String s1 = new String("Hello ITA5");
        String s2 = new String("Hello ITA5");
        System.out.println(s1 == s2); // output is false
        System.out.println(s1.equals(s2)); // output is true
    }
}
