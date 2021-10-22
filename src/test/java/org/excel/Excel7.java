package org.excel;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Excel7 {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void start() {
	     Date d = new Date();
	     System.out.println(d);
	}
	@Test(priority=-3)
    public void test1() {
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	}
	@Test(priority=-2)
    public void test2() {
    WebElement w1 = driver.findElement(By.xpath("//*[@class='_37M3Pb']"));
			String text = w1.getText();
			System.out.println(text);
		}
	@Parameters({"tv"})
	@Test(priority=-1)
	public void test3(String tv) throws Throwable{
		driver.findElement(By.name("q")).sendKeys(tv);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(5000);
	 String text2=driver.findElement(By.xpath("//*[@class='_4rR01T']")).getText();
	System.out.println(text2);
	}
    @Test@Parameters({"mobiles"})
	public void test4(String mobiles) throws InterruptedException {
    	driver.findElement(By.name("q")).sendKeys(mobiles);
    	driver.findElement(By.xpath("//*[@type='submit']")).click();
    	Thread.sleep(5000);
    	 String  text3 = driver.findElement(By.xpath("//*[@class='_4rR01T']")).getText();
    	 System.out.println(text3);
        }
	@AfterMethod
	public void end() {
	     Date d = new Date();
	     System.out.println(d);
	}
   @AfterClass
	public static void quit() {
		driver.quit();
	}
}
