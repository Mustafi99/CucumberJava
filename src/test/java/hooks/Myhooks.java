package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Myhooks extends Driverinit {
	
	@Before
	public void beforeScenarioOne(Scenario scenario) {
		
		System.out.println("Hello");
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		//System.out.println("Scenario name - Before Scenario: ");
		//System.out.println(scenario.getName());
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://bookcart.azurewebsites.net/");
	    Options manage = driver.manage();
	    manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    manage.window().maximize();
	    System.out.println(driver.getTitle());
		
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		boolean failed = scenario.isFailed();
		System.out.println("Is Failed ?" +failed);
		if(failed) {
			byte [] screenshots =driver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshots, "image/png");
		}
		
		driver.quit();
	}
	
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		
		
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		
		
	}

}
