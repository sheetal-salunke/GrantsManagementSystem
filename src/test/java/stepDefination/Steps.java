package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("^Open the chrome and launch the application$")
    public void open_the_chrome_and_launch_the_application() throws Throwable
    {
        System.out.println("This Step open the chrome and launch the application.");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        System.out.println("This step enter the Username and Password on the login page.");
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Login button.");
    }

    @Given("^I enter the URL$")
    public void i_enter_the_URL() throws Throwable {

    }

    @Given("^I enter the user name$")
    public void i_enter_the_user_name() throws Throwable {

    }

    @Given("^I enter the password$")
    public void i_enter_the_password() throws Throwable {

    }

    @When("^I click on Log in button$")
    public void i_click_on_Log_in_button() throws Throwable {

    }

    @Then("^I logged into the System$")
    public void i_logged_into_the_System() throws Throwable {

    }

}

