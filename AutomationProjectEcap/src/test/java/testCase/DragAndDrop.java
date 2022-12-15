package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();

		driver2.get("https://demoqa.com/droppable");

		Actions builder = new Actions(driver2);

		WebElement start = driver2.findElement(By.id("draggable"));
		WebElement end = driver2.findElement(By.id("droppable"));

		builder.dragAndDrop(start, end).build().perform();

		String textMessage = end.getText();

		if (textMessage.equals(textMessage)) {
			System.out.println("is passed");
		} else {
			System.out.println("failed");
		}
	}

}
