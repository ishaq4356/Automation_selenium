package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.orangehrm.com/contact-sales/");
		driver1.manage().window().maximize();

		WebElement searchText = driver1.findElement(By.cssSelector("input.text"));
		searchText.sendKeys("Mohammed Ishaq");

		WebElement searchText1 = driver1.findElement(By.cssSelector("input[id=\"Form_getForm_Contact\"]"));
		searchText1.sendKeys("7788996633");

		WebElement searchText2 = driver1.findElement(By.cssSelector("#Form_getForm_Email"));
		searchText2.sendKeys("Ishaq@gmail.com");

		WebElement searchText3 = driver1.findElement(By.cssSelector("#Form_getForm_Country"));
		Select countryDropDwn = new Select(searchText3);
		//countryDropDwn.selectByIndex(96);
		//countryDropDwn.selectByValue("India");
		countryDropDwn.selectByVisibleText("India");
		
		
		WebElement dropDown = driver1.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select dropDownEmp = new Select(dropDown);
		//dropDownEmp.selectByValue("11 - 15");
		//dropDownEmp.selectByIndex(3);
		dropDownEmp.selectByVisibleText("401 - 450");

	}

}
