package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class TestNG_Priotity {
	WebDriver driver1;

	@Test(priority = 1)
	public void Name() {
		WebElement Name = driver1.findElement(By.id("Form_getForm_FullName"));
		Name.sendKeys("ishaq");

	}

	@Test(priority = 2)
	public void Email() {
		WebElement Email = driver1.findElement(By.id("Form_getForm_Email"));
		Email.sendKeys("ishaq@gmail.com");
	}

	@Test(priority = 3)
	public void country() {
		WebElement Country = driver1.findElement(By.id("Form_getForm_Country"));
		Select countryDropDwn = new Select(Country);
		countryDropDwn.selectByIndex(96);

	}

	@Test(priority = 4)
	public void employees() {
		WebElement noOfEmp = driver1.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select empDropDown = new Select(noOfEmp);
		empDropDown.selectByValue("21 - 25");
	}

	@Test(priority = 5)
	public void phone() {

		WebElement Phone = driver1.findElement(By.id("Form_getForm_Contact"));
		Phone.sendKeys("7760654936");
	}

	@Test
	public void jobTitle() {
		WebElement jobTitle = driver1.findElement(By.id("Form_getForm_JobTitle"));
		jobTitle.sendKeys("Software Testing");
	}

	@BeforeClass
	public void openLink() {
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.get("https://www.orangehrm.com/contact-sales/");
		driver1.manage().window().maximize();
	}

	@AfterClass
	public void closePage() {
		// driver1.close();
	}

}
