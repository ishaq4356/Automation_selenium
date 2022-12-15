package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.orangehrm.com/contact-sales/");

		driver1.manage().window().maximize();

		driver1.findElement(By.id("Form_getForm_FullName")).sendKeys("Mohammed ishaq");
		driver1.findElement(By.id("Form_getForm_Email")).sendKeys("Mohammedishaq@gmail.com");
		driver1.findElement(By.id("Form_getForm_NoOfEmployees")).sendKeys("5");
		driver1.findElement(By.id("Form_getForm_Contact")).sendKeys("7760654936");

		driver1.findElement(By.id("Form_getForm_Country")).sendKeys("india");

		driver1.findElement(By.id("Form_getForm_JobTitle")).sendKeys("QA");
		driver1.findElement(By.id("Form_getForm_Comment")).sendKeys("hello how are you ");
	}

}
