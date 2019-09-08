package loc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[contains(@name,'uid')]")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[starts-with(@name,'uid')]")).sendKeys("abc1");
		//driver.findElement(By.xpath("//input[ends-with(@name,'id')]")).sendKeys("abc");
		
		//buttons
		//driver.findElement(By.xpath("//input[@type='submit'@name='btnLogin')]")).click();
          ////button//[contains(test),'Login']
		
		//for link test
		//link having <a> as anchor tag
		//driver.findElement(By.xpath("//a[contains(text(),'New Tours')]")).click();
		//driver.findElement(By.xpath("//a[text()='New Tours')]")).click();

		//total noo of links in page
		//List <WebElement> yy = driver.findElements(By.tagName("a"));
		//System.out.print(yy.size());
		//for(int i=0; i<yy.size(); i++)
		{
		//	String abc= yy.get(i).getText();
		//	System.out.println(abc);


		}
		
		
		}
	}


