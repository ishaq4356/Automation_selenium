package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://demo.guru99.com/test/upload");
		
		WebElement chooseFile=driver1.findElement(By.id("https://demo.guru99.com/test/upload"));
		chooseFile.sendKeys("‪I:\\RESUMES\\resume.pdf");
		Thread.sleep(2000);
		driver1.findElement(By.id("terms")).click();
		
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("#submitbutton")).click();
		Thread.sleep(2000);
	}

}
