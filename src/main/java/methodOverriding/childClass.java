package methodOverriding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childClass extends parentClass {
	
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    Options manage = driver.manage();
	    manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    manage.window().maximize();
	    System.out.println(driver.getTitle());
	    driver.quit();
	  
	}

}
