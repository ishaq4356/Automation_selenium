package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation_prg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://onlinelearning.excelr.com/dashboard");
		
		driver1.navigate().to("https://www.google.com/");
		
		
		driver1.navigate().back();
		
		Thread.sleep(4000);
		driver1.navigate().forward();
		
		driver1.quit();
	}

}
