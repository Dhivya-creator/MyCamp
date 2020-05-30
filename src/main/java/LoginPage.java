import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        WebDriver driver;
        @FindBy(id="email")
        public WebElement email;

        @FindBy(id="password")
        public WebElement password;

        @FindBy(id="loginButton")
        public WebElement loginButton;

        @FindBy(linkText = "Not yet a customer?")
        public WebElement notACustomerLink;

    public LoginPage(WebDriver driver) {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
}
