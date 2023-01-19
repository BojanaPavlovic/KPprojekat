package utility;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PageFunctions {


    public WebDriverWait wait;
    public WebDriver driver;


    public PageFunctions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

}







