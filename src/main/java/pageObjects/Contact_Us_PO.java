package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Contact_Us_PO extends Base_PO{

    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement firstName_TextField;

    private @FindBy(how = How.XPATH, using = "//input[@name='last_name']")
    WebElement lastName_TextField;

    private @FindBy(how = How.XPATH, using = "//input[@name='email']")
    WebElement emailAddress_TextField;

    private @FindBy(how = How.XPATH, using = "//textarea[@name='message']")
    WebElement comment_TextField;

    public Contact_Us_PO(){
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page(){
        navigateToUrl("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName(){
        sendKeys(firstName_TextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUnique_LastName(){
        sendKeys(lastName_TextField, "AutoLN" + generateRandomNumber(5));
    }

    public void setUnique_EmailAddress(){
        sendKeys(emailAddress_TextField, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }

    public void setUnique_Comment(){
        sendKeys(comment_TextField, "Hello world" + generateRandomString(20));
    }
}
