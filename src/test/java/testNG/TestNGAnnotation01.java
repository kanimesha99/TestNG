package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation01 {
    public static void main(String[] args) {
        System.out.println("This my first TestNG project");
    }

    public void notaTestNGMethod(){
        System.out.println("This is not a TestNG project");
    }

    @Test// with that we don't need a main method to run the method
    public void test(){
        System.out.println("This is a TestNG project");
    }

}
