package main;

public class CloneMethodSample {
    public static void main(String args[]) throws CloneNotSupportedException {
        //Scenario 1: Using assignment operator to copy objects
        A a1 = new A();
        a1.string1 = "Hello";
        a1.string2 = "World";
        //Print a1 object
        System.out.println("Original Value: [" + a1.string1 + ", " + a1.string2 + "]");

        // copies the reference
        A a2 = a1;
        //a2 and a1 are now on the same object
        //if you modify a2 changes will reflect in a1
        a2.string1 = "Get Cloned";
        System.out.println("When you modify a2, a1 will also change");
        System.out.println("a2: [" + a2.string1 + ", " + a2.string2 + "]");
        System.out.println("a1: [" + a1.string1 + ", " + a1.string2 + "]");


        B b1 = new B();
        b1.string1 = "Lazy";
        b1.string2 = "Dog";

        //Print b1 object
        System.out.println("b1: [" + b1.string1 + ", " + b1.string2 + "]");

        //cloning method copies the object
        B b2 = b1.clone();

        //b2 and b1 are now not in the same object
        //modify b2 and changes will not reflect in b1
        b2.string1 = "Jumping";
        System.out.println("b1: [" + b1.string1 + ", " + b1.string2 + "]");
        System.out.println("b2: [" + b2.string1 + ", " + b2.string2 + "]");

    }
}

class A {
    public String string1;
    public String string2;
}

class B implements Cloneable {
    public String string1;
    public String string2;

    public B clone() throws CloneNotSupportedException {
        B b = (B)super.clone();
        return b;
    }
}