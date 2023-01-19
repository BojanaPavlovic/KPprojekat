package pages;


import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 

{
	
	public WebDriver driver;	
	public WebDriverWait wait;
	
	public LoginPage(WebDriver driver1)
		
	{
		driver=driver1;
		PageFactory.initElements(driver1,this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	@FindBy(xpath="//div[contains(@class, 'ErrorFormField_error__hm4lk')]")
	@CacheLookup
	WebElement errorMsg;

	@FindBy(xpath= "(//input[@id='email'])[1]")
	@CacheLookup 
	WebElement email;
	
	
	@FindBy(xpath="(//input[@id='password'])[1]")
	@CacheLookup 
	WebElement passwd;
	
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	@CacheLookup 
	WebElement Login_button;
	
	@FindBy(xpath= "(//button[@class='Button_base__Pz8U1 ButtonPrimaryBlue_primaryBlue__Uz5k1 MyKpMenu_loginButton___m443'])[1]")
	@CacheLookup 
	WebElement navigate_button;
	
	@FindBy(xpath="(//a[@class='Link_link__J4Qd8 Link_primary__Sf8AI") 	
	@CacheLookup
	WebElement Cars;

	@FindBy(xpath="(//input[@id='keywords'])[1]") 	
	@CacheLookup
	WebElement SearchBox;

	@FindBy(xpath="(//a[normalize-space()='Poslovi (111)'])[1]") 	
	@CacheLookup
	WebElement category;
    
	

	
	public WebElement waitIsClickable(WebElement locator) 
	
	{
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
	
	public void clickElement(WebElement locator)
	
	{
		waitIsClickable(locator).click();		
	}
	

	public void navigate()
	
	{		
		clickElement(navigate_button);
	}	

	
	public void set_Login(String un)
	
	{		
		waitIsClickable(email);		
		email.clear();
		email.sendKeys(un);		
	}

	
	public void set_Password(String pwd)
	
	{	
		waitIsClickable(passwd);		
		passwd.clear();
		passwd.sendKeys(pwd);	
	}
	
	
	public void clickLoginButton()
	
	{		
		clickElement(Login_button);			
	}
   public String Text_Lozinka_Zaboravljena() 

   {
	   return driver.findElement(By.xpath("(//a[normalize-space()='Lozinka zaboravljena?'])[1]")).getText();	   
   }
   
   public void Tear_Down() {
	   driver.quit();
   }
   
}