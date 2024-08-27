package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;

public class Login_Steps {

    private WebDriver driver = getDriver();

    @Given("I asscess the webdriver university login page")
    public void i_asscess_the_webdriver_university_login_page() {
        driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }

    @When("I enter a correct username {word}")
    public void i_enter_a_correct_username(String userName) {
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys(userName);
    }

    @And("I enter a correct password {word}")
    public void i_enter_a_correct_password(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @And("I click in the login button")
    public void i_click_in_the_login_button() {
        driver.findElement(By.xpath("//button[@id='login-button']")).click();
    }

    @Then("I should be presented with a validation success message")
    public void i_should_be_presented_with_a_validation_success_message() {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage, "validation succeeded");
    }

    @When("I enter a incorrect username {word}")
    public void i_enter_a_incorrect_username(String userName) {
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys(userName);
    }

    @And("I enter a inorrect password {word}")
    public void i_enter_a_inorrect_password(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @Then("I should be presented with a validation unsuccess message")
    public void i_should_be_presented_with_a_validation_unsuccess_message() {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage, "validation failed");
    }

    @When("I enter a user name {word}")
    public void i_enter_a_user_name(String userName) {
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys(userName);
    }

    @When("I enter a password {word}")
    public void i_enter_a_password(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String loginValidationMessage) {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage, loginValidationMessage);
    }

}