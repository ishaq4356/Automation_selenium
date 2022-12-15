package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;;

public class launch_URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String expectedTitle = "Google";
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		// String actualTitle = driver1.getTitle();

		if (expectedTitle.equals(title)) {
			System.out.println("test is passed");
		} else {
			System.out.println("test is failed");
		}
		driver.close();

	}

}
