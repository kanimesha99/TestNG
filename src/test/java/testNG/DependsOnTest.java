package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
    @Test()
    public void Test01(){
        System.out.println("O/L");
//        Assert.fail();
    }
    @Test(dependsOnMethods = "Test01")
    public void Test02(){
        System.out.println("A/L");
    }
    @Test(dependsOnMethods = {"Test01","Test02"},alwaysRun = true)//although dependent fail testcase running
    public void Test03(){
        System.out.println("Graduation");
    }
}
