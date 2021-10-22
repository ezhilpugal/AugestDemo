package org.excel;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Excel4 {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
    @Test
    public void test4() {
    	Assert.assertTrue(driver.getCurrentUrl().contains("https://en-gb.facebook.com/"));
     driver.findElement(By.id("src")).sendKeys("mayiladuthurai");
    }
    @Test
    public void test5() {
    	 WebElement dest = driver.findElement(By.id("dest"));
    	 dest.sendKeys("chennai");
    	 Assert.assertEquals(dest.getAttribute("value"), "chennai");
    	 driver.findElement(By.id("onward_cal")).click();
    	 driver.findElement(By.xpath("//*[text()='19']")).click();
}
    @Ignore
    @Test
    public void test6() {
    	
     driver.findElement(By.id("search_btn")).click();
}
    
    
    
    
}

