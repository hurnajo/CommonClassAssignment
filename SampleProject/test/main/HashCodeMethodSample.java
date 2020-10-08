package main;


import java.util.Objects;

public class HashCodeMethodSample {
    String employee = "kwangja";

    @Override
    public int hashCode() {
        return Objects.hash(employee);
    } // return hash object

    public static void main(String[] args) {
        HashCodeMethodSample hashCode = new HashCodeMethodSample();
        //return generated hash
        System.out.println(hashCode.hashCode());
    }
}
