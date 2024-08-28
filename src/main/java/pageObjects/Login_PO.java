package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PO extends Base_PO{

    private @FindBy(id = "text")
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_Button;

    public Login_PO(){
        super();
    }

    public void navigateToWebDriverUniversity_Login_Page(){
        navigateToUrl("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }

    public void setUsername(String username){
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickOn_Login_Button(){
        waitForWebElementAndClick(login_Button);
    }

    public void validate_SuccessfulLogin_Message(){
        waitForAlert_And_ValidateText("validation succeeded");
    }

    public void validate_UnSuccessfulLogin_Message(){
        waitForAlert_And_ValidateText("validation failed");
    }

}
