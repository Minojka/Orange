import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(name = "username")
    WebElement userName;

    @FindBy (name = "password")
    WebElement password;

    @FindBy (css = ".orangehrm-login-button")
    WebElement loginButton;

    @FindBy(css =".oxd-alert-content-text")
    WebElement errorMessage;

    public LoginPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    //akcije
    public void Login(String name,String pass) {
        userName.sendKeys(name);
        password.sendKeys(pass);
        loginButton.submit();
    }
        public String error(){
            return errorMessage.getText();
        }


    }






