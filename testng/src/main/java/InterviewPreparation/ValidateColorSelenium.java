package InterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateColorSelenium {
/*
 * Locate the Element: Find the web element whose color you want to validate.
Retrieve the Color Property: Use the getCssValue method to retrieve the CSS property that defines the color.
Validate the Color: Compare the retrieved color value with the expected value.
 */
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");

	        // Locate the element
	        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'हिन्दी')]"));

	        // Retrieve the color property
	        String colorValue = element.getCssValue("color"); // or "background-color", "border-color"
	        
	        // Print the color value
	        System.out.println("Color value: " + colorValue);

	        // Expected color value (as rgba or hex)
	        String expectedColor = "rgba(0, 0, 0, 1)"; // Example for black color

	        // Validate the color
	        if (colorValue.equals(expectedColor)) {
	            System.out.println("Color validation passed!");
	        } else {
	            System.out.println("Color validation failed!");
	        }

	        // Close the browser
	        driver.quit();
	    }

	}


