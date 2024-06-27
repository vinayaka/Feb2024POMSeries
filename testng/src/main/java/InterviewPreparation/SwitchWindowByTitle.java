package InterviewPreparation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowByTitle {

	public static void main(String[] args) {
		// Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open multiple windows for demonstration purposes
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/search");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://www.facebook.com/");

        // Get the current window handle
        String originalWindow = driver.getWindowHandle();
        System.out.println("Original window"+originalWindow);

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Iterate through each window handle
        for (String windowHandle : allWindows) {
            // Switch to the current window handle

            // Get the title of the current window
            String windowTitle = driver.getTitle();

            // Check if the title matches "google.com"
            if (windowTitle.equals("google.com")) {

                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Perform actions on the window with the title "google.com"
        // For example, print the title to confirm
        System.out.println("Switched to window with title: " + driver.getTitle());

        // Close the driver
        driver.quit();

	}

}
