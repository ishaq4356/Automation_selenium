package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://demo.guru99.com/test/login.html");

		driver1.manage().window().maximize();

		WebElement Mail = driver1.findElement(By.id("email"));
		Mail.sendKeys("mail@gmail.com");

		WebElement Pass = driver1.findElement(By.id("passwd"));

		Pass.sendKeys("ishaq");

		WebElement Sign = driver1.findElement(By.id("SubmitLogin"));

		Sign.click();
	}

}
