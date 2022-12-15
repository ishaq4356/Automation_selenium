package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.amazon.in/");
		driver1.manage().window().maximize();
		
			WebElement SingIn = driver1.findElement(By.id("nav-link-accountList-nav-line-1"));
			
			Actions builder = new Actions(driver1);
			
			builder.moveToElement(SingIn).build().perform();
	}

}
