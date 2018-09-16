package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @When("^I am in sign up form$")
    public void iAmInSignUpForm() throws Throwable {
        //selectMyAccountMenu();
        //selectSignUpButton();
    }

    @And("^I have created new account$")
    public void iHaveCreatedNewAccount() throws Throwable {
        //enterFirstName();
        //enterLastName();
        //enterMobileNumber();
        //enterEmailAddress();
        //enterPassword();
        //confirmPassword();
        //SelectSIGNUPButton();
    }


    @And("^I select My account button$")
    public void iSelectMyAccountButton() throws Throwable {
        //selectMyAccountButton();
    }

    @And("^I select Log out button$")
    public void iSelectLogOutButton() throws Throwable {
        //selectLogOutButton();
    }


    @And("^I enter valid email address$")
    public void iEnterValidEmail() throws Throwable {
        //enterValidEmailAddress();
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() throws Throwable {
        //enterValidPassword();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        //selectLoginButton();
    }

    @Then("^User Account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("Account page is opened");
    }

}
