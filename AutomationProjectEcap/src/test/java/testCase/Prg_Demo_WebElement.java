package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prg_Demo_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.orangehrm.com/contact-sales/");
		driver1.manage().window().maximize();
		
		WebElement Phone = driver1.findElement(By.id("Form_getForm_Contact"));
		Phone.sendKeys("7760654936");
		Phone.clear();
	}

}
