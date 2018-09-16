package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {
    @Given("^I have opened landing page$")
    public void iHaveOpenedLandingPage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @When("^I select My Account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        //selectMyAccountMenu();
    }

    @And("^I select Sign up button")
    public void iSelectSignUpMenu() throws Throwable {
        //selectSignUpButton();
    }

    @And("^I enter first name in signup form$")
    public void iEnterValidFirstNameInSignupForm() throws Throwable {
        //enterFirstName();
    }

    @And("^I enter last name in signup form$")
    public void iEnterValidLastNameInSignupForm() throws Throwable {
        //enterLastName();
    }

    @And("^I enter mobile number in signup form$")
    public void iEnterValidMobileNumberInSignupForm() throws Throwable {
        //enterMobileNumber();
    }

    @And("^I enter email address in signup form$")
    public void iEnterValidEmailAddressInSignupForm() throws Throwable {
        //enterEmailAddress();
    }

    @And("^I enter password in signup form$")
    public void iEnterPasswordInSignupForm() throws Throwable {
        //enterPassword();
    }

    @And("^I confirm password in signup form$")
    public void iReEnterPasswordInSignupForm() throws Throwable {
        //confirmPassword();
    }

    @And("^I select SIGN UP button$")
    public void iSelectSIGNUPButton() throws Throwable {
        //SelectSIGNUPButton();
    }

    @Then("^dashboard is opened$")
    public void dashboardIsOpened() throws Throwable {
        System.out.println("Account created");
    }
}
