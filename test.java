import java.io.*;
public class test{
    public static void main(String []args){
        test a = new test();
        System.out.println("Hello Welcome to the World of Java");
        System.out.println(a.toString());
    }

    @Override
    public String toString() {
        return "test []";
    }
}