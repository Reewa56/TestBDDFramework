package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BaseClass;
import pages.HomePage;
import pages.LoginTest;

public class LoginStepFile extends BaseClass {

	private LoginTest loginobj;
	private HomePage homePage;

	@Before
	public void setup(){
		driver = Initializedriver();
	}

	@After
	public void teardown(){
		this.tearDown();
	}

	@Given("I open the Saucedemo url")
	public void i_open_the_saucedemo_url() {
		// Write code here that turns the phrase above into concrete actions
		//driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		loginobj = new LoginTest(driver);
	}

	@Then("I enter username and password")
	public void i_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		//loginobj = new LoginTest(driver);
		loginobj.LoginCred();
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		loginobj.Submit();
	}

	@Then("I validate login is successfully done")
	public void i_validate_login_is_successfully_done() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(loginobj.ValidateLogin(),"Swag Labs" );
		//driver.close();
	}

	@Given("I have entered invalid {string} and {string}")
	public void i_have_entered_invalid_and(String string1, String string2) {
		// Write code here that turns the phrase above into concrete actions
		homePage = new HomePage(driver);
		homePage.AddCred(string1,string2);
	}


}
