package InterviewPreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiffrentWaySendKeys {
	/*
	 * Basic Usage: Directly send text to an element.
Special Keys: Use the Keys class for special keystrokes.
Clear and Send: Clear existing text before sending new text.
Multiple Keystrokes: Send sequences or combinations of keys.
WebDriverWait: Wait for elements to be in a proper state before sending keys.
JavaScript: For hidden or disabled elements, set values using JavaScript.
Actions Class: For more complex scenarios and advanced typing actions.
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://example.com");
//Ist method
		WebElement inputField = driver.findElement(By.id("inputField"));
		inputField.sendKeys("Hello, World!");

		// 2nd method

		WebElement secondmethod = driver.findElement(By.id("inputField"));
		secondmethod.sendKeys("Hello, World!");
		secondmethod.sendKeys(Keys.ENTER); // Press Enter key
		// 3rd Method by using webdriver wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement thirdmethod = wait.until(ExpectedConditions.elementToBeClickable(By.id("inputField")));
		thirdmethod.sendKeys("Text after wait!");
//4th method by using Javascript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('inputField').value='Text via JavaScript'");

		// 5 th closs by using action classs
		WebElement fifthmethod = driver.findElement(By.id("inputField"));
		Actions actions = new Actions(driver);
		actions.moveToElement(fifthmethod).click().sendKeys("Text via Actions").perform();

	}

}
