package org.excel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Excel6 {
	
	static WebDriver driver;
/*@BeforeSuite
	
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}*/
	
	@Test
  	public void test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
			
			driver.navigate().to("https://en-gb.facebook.com/");
  	}

  	@Test
  	public void test2() {
  		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
  		 driver = new ChromeDriver();
  			
  			driver.navigate().to("https://github.com/");

  	}}
/*@BeforeClass
	
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Parameters({"username","password"})
    @Test
    public void test8(String username,String password) {
  	driver.findElement(By.id("email")).sendKeys(username);
  	driver.findElement(By.id("pass")).sendKeys(password);

    }
}*/
  	/*@Test
  	public void test8() {
  		driver.findElement(By.id("pass")).sendKeys("12345");
  	}

  	@Test
  	public void test9() {
  	driver.findElement(By.xpath("//*[@type='submit']")).click();
          
  		*/
	
	
  

	
	/*@Test(groups="run")
	public void test1() {
	System.out.println("lokesh");
	}
	@Test
	public void test2() {
	System.out.println("kavin");
	}
	@Test(groups="run")
	public void test3() {
	System.out.println("ravi");
	}
	@Test
	public void test4() {
	System.out.println("praveen");
	}
	@Test(groups="run")
	public void test5() {
	System.out.println("arun");
	}
	@Test
	public void test6() {
	System.out.println("baratbaru");
	}
	@Test(groups="run")
	public void test7() {
	System.out.println("aravind");
	}
   
	
	
	
	*/
	
	/*static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ezhil\\eclipse-workspace\\MayBatch\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	@Parameters({"username","password"})
    @Test
    public void test8(String username,String password) {
  	driver.findElement(By.id("email")).sendKeys(username);
  	driver.findElement(By.id("pass")).sendKeys(password);

    }
  	@Test
  	public void test8() {
  		driver.findElement(By.id("pass")).sendKeys("12345");
  	}

  	@Test
  	public void test9() {
  	driver.findElement(By.xpath("//*[@type='submit']")).click();
          
  		
	
	
  	}	
}
*/