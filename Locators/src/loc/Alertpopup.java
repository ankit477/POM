package loc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.name("btnLogin")).click();
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	String text= al.getText();
	if(text.equals(al.getText()))
	{
		System.out.println("Correct message is displayed");
	}
	else {
		System.out.println("Incorrect message is displayed");
	}
	
	al.accept();
	
	}

}
