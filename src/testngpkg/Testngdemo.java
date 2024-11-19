package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
@BeforeTest
public void setup()
{
	System.out.println("Beforetest, browser open");
}
@BeforeMethod
public void method()
{
	System.out.println("URL Loading");
}
@Test(priority=2,invocationCount=3,dependsOnMethods= {"test2"})
public void test1()
{
	System.out.println("Test 1");
}
@Test(priority=4)
public void test2()
{
	System.out.println("Test 2");
}
@Test(priority=1,enabled=false)
//@Test(priority=1)
public void test3()
{
	System.out.println("Test 3");
}
@Test(priority=3)
public void test4()
{
	System.out.println("Test 4");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("After method");
}
@AfterTest
public void aftertest()
{
	System.out.println("After test");
}

}
