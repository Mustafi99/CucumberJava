package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Driverinit;


public class steps extends Driverinit {
	
	@Given("User navigate to the Bookcart application")
	public void user_navigate_to_the_Bookcart_application() {
	
	  
	}

	@Given("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	
	@Given("User enter the username as ortoni")
	public void userEnterTheUsernameAsOrtoni() {
		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("ortoni");
	}
	

	@Given("User enter the password as pass1234")
	public void userEnterThePasswordAsPass() {
		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("pass1234");
	}
	

	@Given("User enter the {string} as username")
	public void user_enter_the_username_as_ortoni(String string) {
		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(string);
	}

	@Given("User enter the {string} as password")
	public void user_enter_the_username_as_pass(String string) {
		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(string);
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	    
	}

	@Then("login should be success")
	public void login_should_be_success() {
		String Actualresult = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]")).getText();
		System.out.println(Actualresult);
		driver.quit();
	}
	
	@When("login should be Failed")
	public void loginShouldBeFailed() {
	    String text = driver.findElement(By.xpath("//mat-error[@id='mat-error-0']")).getText();
	    Assert.assertEquals(text, "Username or Password is incorrect.");
	    System.out.println(text);
	 
	    
	}
	
	
	@Given("user clicks on the register button")
	public void userClicksOnTheRegisterButton() {
		driver.findElement(By.xpath("//span[text()='Register']")).click();
	}

	@Given("User enter the firstName as mustafi")
	public void userEnterTheFirstNameAsMustafi() {
		driver.findElement(By.xpath("//input[@data-placeholder='First name']")).sendKeys("mustafi");
	}

	@Given("User enter the lastName as rahaman")
	public void userEnterTheLastNameAsRahaman() {
		driver.findElement(By.xpath("//input[@formcontrolname='lastname']")).sendKeys("rahaman");  
	}

	@Given("User enter the username as mustafi011994")
	public void userEnterTheUsernameAsMustafi() {
		
		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("mustafi011994");
		
	}
	

	@Given("User enter the password as Uvwx0101")
	public void userEnterThePasswordAsUvwx() {
		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("Uvwx0101");
	}

	@Given("User enter the confirm_password as Uvwx0101")
	public void userEnterTheConfirm_passwordAsUvwx() {
		driver.findElement(By.xpath("//input[@data-placeholder='Confirm Password']")).sendKeys("Uvwx0101");
	   
	}

	@Given("User select the gender radio button")
	public void userSelectTheGenderRadioButton() throws InterruptedException {
		WebElement MaleBtn =driver.findElement(By.xpath("//span[contains(text(),\"Male\")]"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(MaleBtn));
		MaleBtn.click();
		Thread.sleep(3000);
		
	}

	@Then("User click on the register button")
	public void userClickOnTheRegisterButton() {
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
	}


}
