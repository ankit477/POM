package loc;

import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> handler= driver.getWindowHandles();
		//System.out.println(handler);
		Iterator<String> it1=handler.iterator();
		String parentWindowId=it1.next();
		System.out.println(parentWindowId);
		
		String childWindowId=it1.next();
		System.out.println(childWindowId);
		Thread.sleep(2000);
		driver.switchTo().window(childWindowId);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		

	}

}
