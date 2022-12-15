package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prg_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.orangehrm.com/contact-sales/");
		driver1.manage().window().maximize();
		// driver1.findElement(By.linkText("Sample Forms")).click();
		List<WebElement> LinkList = driver1.findElements(By.tagName("a"));
		System.out.println(LinkList.size());

		for (int i = 0; i < LinkList.size(); i++) {
			System.out.println(LinkList.get(i).getText());
		}

	}

}
