package loc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
	WebElement firtname=driver.findElement(By.xpath("//input[@name='firstname']"));
	sendKeys(driver, firtname, 5, "abc");

		WebElement felement= driver.findElement(By.linkText("Forgotten account?"));
		

		click(driver, felement, 9);
		driver.close();

	}
	private static void sendKeys(WebDriver driver, WebElement firtname, int i, String string) {
		// TODO Auto-generated method stub
		
	}
	public static void sendkeys(WebDriver driver, WebElement locator, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
	}
	public static void click(WebDriver driver, WebElement element, int timeout) {
	new WebDriverWait(driver, timeout).
	until(ExpectedConditions.elementToBeClickable(element));
		element.click();

}
}
