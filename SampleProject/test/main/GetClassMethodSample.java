package main;

public class GetClassMethodSample {
    public static void main(String[] args) {
        Object obj1 = new String("Leo Bee");
        Class sampleClass = obj1.getClass();
        //return the class type
        System.out.println("Class of Object obj is : " + sampleClass);
    }
}
