package methodOverriding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parentClass {
	WebDriver driver;
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    Options manage = driver.manage();
	    manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    manage.window().maximize();
	    System.out.println(driver.getTitle());
	    driver.quit();
	  
	}
}
