package loc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Difflocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/config/login");
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		//1.id:
		//driver.findElement(By.id("login-username")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("login-signin")).click();
		//WebElement login1 =driver.findElement(By.id("login-username"));
		//login1.sendKeys("test@gmail.com");
		
		//WebElement nextbtn= driver.findElement(By.id("login-signin"));
		//Thread.sleep("2000");
		//nextbtn.click();
		//2. name
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		//driver.findElement(By.name("signin")).click();
		//driver.quit();
		//3. xpath
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test@gmail.com");
	      //4. cssselector
		driver.findElement(By.cssSelector("#login-username")).sendKeys("testme");
		driver.findElement(By.cssSelector("#login-signin")).click();
		//5.linktest
		//driver.findElement(By.linkText("Trouble signing in?")).click();
		//6.partial link test
		driver.findElement(By.partialLinkText("Trouble")).click();
		//7.class name
		driver.findElement(By.className("phone-no ")).sendKeys("test");
 	}
	

}
