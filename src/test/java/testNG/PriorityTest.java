package testNG;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 1)
    public void testLogin(){
        System.out.println("Login");
    }
    @Test(priority = 2)
    public void testCreate(){
        System.out.println("Test Create");
    }
    @Test(priority = 3)
    public void testEdit(){
        System.out.println("Test Edit");
    }
    @Test(priority = 4, enabled = false)//enabled use to skip running the test cases
    public void testDelete(){
        System.out.println("Test Delete");
    }
    @Test(priority = 5)
    public void testLogout(){
        System.out.println("Test Logout");
    }
}
