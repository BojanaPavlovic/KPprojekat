//package pages;
//
//import java.time.Duration;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//
//public class HomePage {
//	
//		public WebDriver driver;	
//		public WebDriverWait wait;
//		public LoginPage lp;
//		public HomePage(WebDriver driver1)
//		
//
//		{
//			driver=driver1;
//			PageFactory.initElements(driver1,this);
//			this.wait = new WebDriverWait(driver1, Duration.ofSeconds(15));
//		}
//
//		
//		@FindBy(xpath= "(//p[normalize-space()='Automobili'])[1]")
//		@CacheLookup
//		WebElement Automobili_category;
//
//		@FindBy(xpath= "//div[contains(@class,'AdItem_')] ")
//		@CacheLookup  
//		WebElement some_car_ads;
//		
//		
//		@FindBy(xpath= "//span[@class='Button_children__3mYJw'] ")
//		@CacheLookup
//		WebElement address_book;
//		
//		@FindBy(xpath="(//textarea[@id='note'])[1]")
//		@CacheLookup
//		WebElement note_input_field;
//		
//		@FindBy(xpath="(//button[@class='Button_base__Pz8U1 ButtonPrimaryBlue_primaryBlue__Uz5k1'])[1]")
//		@CacheLookup
//		WebElement save_button;	
//		
//		
//		
//		public WebElement waitIsClickable(WebElement locator) 
//		
//		
//		{
//	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
//	    }
//	    
//		
//		
//		public WebElement clickElement(WebElement locator)
//		
//		{
//			return waitIsClickable(locator);									
//		}
//		
//		
//		
//		public void click_on_the_automobilli_category() 
//		
//		{
//			clickElement(Automobili_category);
//		}
//
//		
//		
//		public void scroll_to_Car_ads_element()
//		
//		{
//			waitIsClickable(some_car_ads);
//			Actions action = new Actions(driver);
//			action.moveToElement(some_car_ads);		
//		}		
//
//
//		
//		public void enter_text_in_input_note_field(String text) 		
//		
//		{
//			clickElement(note_input_field).sendKeys(text);;			
//		
//		} 		
//		
//		
//		
//		public void add_to_address_book() 
//		
//		{
//			clickElement(save_button);
//	
//		}
//
//		
//		
//}
//
//
//
//
//
//
//
//
//
//
//
