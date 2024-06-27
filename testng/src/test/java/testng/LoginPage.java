package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	 	private WebDriver driver;
	    private WebElement usernameField;
	    private WebElement passwordField;
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        initializeElements();
	    }

	    private void initializeElements() {
	        usernameField = driver.findElement(By.id("username"));
	        passwordField = driver.findElement(By.id("password"));
	        loginButton = driver.findElement(By.id("loginButton"));
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }

}
