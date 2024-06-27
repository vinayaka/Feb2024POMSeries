package InterviewPreparation;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindAllAnchortagsLinks {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/search");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement e:links) {
			String url=e.getAttribute("href");
			String htext=e.getText();
			System.out.println("URL is"+url);
			System.out.println("Text"+htext);
		}
		;
	}

}
