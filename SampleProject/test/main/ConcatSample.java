package main;

public class ConcatSample {
    public static void main(String[] args) {
        String str = "Hello";
        //concat different string into one
        str = str.concat(", I am").concat(" Jose").concat(" from LPMC");
        System.out.println(str);
    }
}
