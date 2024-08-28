package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps extends Base_PO {
    private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I asscess the webdriver university login page")
    public void i_asscess_the_webdriver_university_login_page() {
        login_po.navigateToWebDriverUniversity_Login_Page();
    }

    @When("I enter a correct username {word}")
    public void i_enter_a_correct_username(String userName) {
        login_po.setUsername(userName);
    }

    @And("I enter a correct password {word}")
    public void i_enter_a_correct_password(String password) {
        login_po.setPassword(password);
    }

    @And("I click in the login button")
    public void i_click_in_the_login_button() {
        login_po.clickOn_Login_Button();
    }

    @Then("I should be presented with a validation success message")
    public void i_should_be_presented_with_a_validation_success_message() {
        login_po.validate_SuccessfulLogin_Message();
    }

    @When("I enter a incorrect username {word}")
    public void i_enter_a_incorrect_username(String userName) {
        login_po.setUsername(userName);
    }

    @And("I enter a inorrect password {word}")
    public void i_enter_a_inorrect_password(String password) {
        login_po.setPassword(password);
    }

    @Then("I should be presented with a validation unsuccess message")
    public void i_should_be_presented_with_a_validation_unsuccess_message() {
        login_po.validate_UnSuccessfulLogin_Message();
    }

    @When("I enter a user name {word}")
    public void i_enter_a_user_name(String userName) {
        login_po.setUsername(userName);
    }

    @When("I enter a password {word}")
    public void i_enter_a_password(String password) {
        login_po.setPassword(password);
    }

    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String loginValidationMessage) {
        waitForAlert_And_ValidateText(loginValidationMessage);
    }

}