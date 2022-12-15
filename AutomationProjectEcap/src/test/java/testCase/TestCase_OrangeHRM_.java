package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_OrangeHRM_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.orangehrm.com/contact-sales/");
		
		driver1.findElement(By.xpath("//input[@name='FullName']")).sendKeys("ishaq");
		
		driver1.findElement(By.xpath("//input[@id=\"Form_getForm_Contact\"]")).sendKeys("7760654936");
		//driver1.findElement(By.xpath("//input[@name='Contact']")).sendKeys("7760654936");
	}

}
