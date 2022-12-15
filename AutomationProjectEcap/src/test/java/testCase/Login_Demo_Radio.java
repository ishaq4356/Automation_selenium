package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Demo_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://demo.guru99.com/test/radio.html");
		driver1.manage().window().maximize();

		driver1.findElement(By.id("vfb-7-1")).click();
		WebElement option1 = driver1.findElement(By.id("vfb-6-0"));
		option1.click();
		
		WebElement option2 = driver1.findElement(By.id("vfb-6-1"));
		option2.click();

		if (option2.isSelected()) {
			System.out.println("the checkbox 2 is selected");
		} else {
			System.out.println("checkboxx 2 is not selected");
		}
		
		WebElement option3 = driver1.findElement(By.id("vfb-6-2"));
		//option3.click();
		
		if (option3.isSelected()) {
			System.out.println("its selected");
		} else {
			System.out.println("its not");
		}

	}

}
