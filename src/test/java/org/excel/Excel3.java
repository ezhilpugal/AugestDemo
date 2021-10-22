package org.excel;


import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class Excel3 {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
    public void test1() {
		Assert.assertTrue(driver.getCurrentUrl().contains("https://en-gb.facebook.com/"));
		Wait<WebDriver>wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);	
	
		driver.findElement(By.id("email")).sendKeys("ezhil");
	
	System.out.println(driver.getTitle());
	}
	@Test
	public void test2() {
		Assert.assertTrue(driver.getTitle().contains("facebook"));
	driver.findElement(By.id("pass")).sendKeys("12345");
	}

	@Test
	public void test3() {
		driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up", "Facebook – log in or sign up");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
        
		
	}
}





