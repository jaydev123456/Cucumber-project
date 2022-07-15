package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	private static final CharSequence Employeename = null;
	WebDriver driver;
	@Given("^user navigate orangehrm url$")
	public void user_navigate_orangehrm_url() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
	    Thread.sleep(3000);
	}

	@When("^user logs in using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_logs_in_using_Username_as_and_Password_as(String username, String password) throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys(username);
	    driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	}

	@When("^user click admin button$")
	public void user_click_admin_button() throws Throwable {
        driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

	}

	@When("^user click add button$")
	public void user_click_add_button() throws Throwable {

        driver.findElement(By.name("btnAdd")).click();
	}

	@When("^user Enter Employee name$")
	public void user_Enter_Employee_name() throws Throwable {
	    driver.findElement(By.name("//input[@id='systemUser_employeeName_empName']")).sendKeys(Employeename);
	}

	@When("^user Enter username$")
	public void user_Enter_username() throws Throwable {
	    CharSequence username = null;
		driver.findElement(By.name(//input[@id='systemUser_userName'])).sendKeys(username);
	}

	@When("^user Enter password button$")
	public void user_Enter_password_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user Enter confirm password$")
	public void user_Enter_confirm_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user validate url$")
	public void user_validate_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	   driver.close();
	}


}
