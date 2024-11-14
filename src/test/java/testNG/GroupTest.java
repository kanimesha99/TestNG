package testNG;

import org.testng.annotations.Test;

public class GroupTest {
    //S=smoke, R=Regression
    @Test(groups = {"S","R"})
    public void test01(){
        System.out.println("This is smoke and regression testing");
    }
    @Test(groups = {"R"})
    public void test02(){
        System.out.println("This is regression testing");
    }
    @Test
    public void test03(){
        System.out.println("This is not regression or smoke testing");
    }
    @Test(groups = {"S"})
    public void test04(){
        System.out.println("This is smoke testing");
    }
    @Test(groups = {"S","R"})
    public void test05(){
        System.out.println("This is smoke and regression testing");
    }
}
