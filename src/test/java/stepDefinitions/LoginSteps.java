package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginSteps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	
	@Given("user open the browser")
	public void open_browser() 

	
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bojana Pavlovic\\Desktop\\JAVA PROJECTS\\KProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);		
                
	}
	
	

	
	@And("navigate to the {string}")
	public void navigate_URL(String URL) 
	
	{	
		driver.get(URL);
		driver.manage().window().maximize();

	}


	@And("user click button which navigate them to the login form")
	public void click_category() throws InterruptedException 

	{		
		lp.navigate();
	}
	
	
	@When("user enters un as {string} and pwd as {string}")
	public void user_enters_pwd_and_un_credentiales(String email, String password) 
	
	{
		lp.set_Login(email);
		lp.set_Password(password); 
	}

	
	
	@And("user click on the login button")
	public void click_loging() 

	{		
		lp.clickLoginButton();
		Thread.sleep(2000);		
	}
	
	
	@Then("page text should contains {string}")		

	public void compare_error_msgs(String expected_text) throws InterruptedException 
	
	{	
	//	String actual_text = driver.findElement(By.xpath("(//a[normalize-space()='Lozinka zaboravljena?'])[1]")).getText();
		String actual_text = driver.findElement(By.className("ErrorFormField_error__hm4lk")).getText();
		Assert.assertEquals(expected_text, actual_text);	
	}
										
	
	
	@And("browser close")
	public void close_the_browser()

	{		
		driver.quit();;	
	}
	
}
