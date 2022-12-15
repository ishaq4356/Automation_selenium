package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.amazon.in/");
		driver1.manage().window().maximize();
		
//		WebElement searchText = driver1.findElement(By.cssSelector("#twotabsearchtextbox"));
//		searchText.sendKeys("Iphone");
		
		WebElement searchText = driver1.findElement(By.cssSelector("input[id=\"Form_getForm_Contact\"]"));
		searchText.sendKeys("Iphone");
		
		
		driver1.findElement(By.id("nav-search-submit-button")).click();
		//searchText.click();
	}

}
