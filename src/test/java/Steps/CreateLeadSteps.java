package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public ChromeDriver driver;
	
	@Given("Open chrome browser")
	public void openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();    
	}

	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Set the timeout")
	public void setTheTimeout() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Given("Enter the url")
	public void enterTheUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the username as (.*)")
	public void enterTheUsernameAsDemoCSR(String username) {
		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {
	    driver.findElementById("password").sendKeys(password);
	}

	@Given("Click on Login button")
	public void clickOnLoginButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click on crmsfa")
	public void clickOnCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();	    
	}

	@Given("Click Lead")
	public void clickLead() {
		driver.findElementByLinkText("Leads").click();
	}

	@Given("Click Create Lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	    
	}

	@Given("Enter Company Name as (.*)")
	public void enterCompanyName(String compname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
	}

	@Given("Enter First Name as (.*)")
	public void enterFirstName(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@Given("Enter Last Name as (.*)")
	public void enterLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("Click Create Lead button")
	public void clickCreateLeadButton() {
	    driver.findElementByName("submitButton").click();
	}

	@Then("Verify Create Lead is done")
	public void verifyCreateLeadIsDone() {
		
		try {
		WebElement ele = driver.findElementByXPath("//div[contains(text(),'View Lead')]");
		
				
				if(ele.isDisplayed()) {
				System.out.println(" The Lead is created ");
				
			}
			}
				catch (NoSuchElementException e) {
				System.out.println("The Lead is not created");
				
			}
			}
		
		
}




