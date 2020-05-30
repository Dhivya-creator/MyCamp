import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JuiceShopHomePage {
    WebDriver driver;

    @FindBy(css="button[aria-label='Close Welcome Banner']")
    public WebElement closeWelcomeBanner;

    @FindBy(id="navbarAccount")
    public WebElement accountButton;

    @FindBy(id="navbarLoginButton")
    public WebElement loginButton;

    public JuiceShopHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
