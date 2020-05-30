import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void loginTest() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("http://localhost:3000/#/");
        JuiceShopHomePage juiceShopHomePage=new JuiceShopHomePage(driver);
        juiceShopHomePage.closeWelcomeBanner.click();
        Thread.sleep(2000);
        juiceShopHomePage.accountButton.click();
        juiceShopHomePage.loginButton.click();
       LoginPage loginPage=new LoginPage(driver);
       loginPage.email.sendKeys("Test@gmail.com");
       loginPage.password.sendKeys("Newuser");
       loginPage.loginButton.click();
       driver.quit();

    }
}
