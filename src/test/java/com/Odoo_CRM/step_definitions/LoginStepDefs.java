package com.Odoo_CRM.step_definitions;

import com.Odoo_CRM.pages.LoginPage;
import com.Odoo_CRM.utilities.BrowserUtils;
import com.Odoo_CRM.utilities.ConfigurationReader;
import com.Odoo_CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        //System.out.println("Opening the login page");
        // Driver.get() --> this gets the webdriver
        // Driver.get()  === driver
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("user should be able to log in")
    public void user_should_be_able_to_log_in() {

            String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(3);
            Assert.assertEquals("Odoo", actualTitle);
        }

    @When("the user enters the posmanager login information")
    public void the_user_enters_the_posmanager_login_information() {
        //System.out.println("Entering posmanager login info");

        String sUsername = ConfigurationReader.get("posusername");
        String sPassword = ConfigurationReader.get("pospassword");

        LoginPage loginPage = new LoginPage();
        loginPage.login(sUsername, sPassword);

    }

    @When("the user enters the eventscrmmanager login information")
    public void the_user_enters_the_eventscrmmanager_login_information() {
        //System.out.println("Entering eventscrmmanager login info");

        String sUsername = ConfigurationReader.get("eventsusername");
        String sPassword = ConfigurationReader.get("eventspassword");

        LoginPage loginPage = new LoginPage();
        loginPage.login(sUsername, sPassword);

    }

    @When("the user enters the crmmanager login information")
    public void the_user_enters_the_crmmanager_login_information() {
        // System.out.println("Entering crmmanager login info");

        String sUsername = ConfigurationReader.get("crmusername");
        String sPassword = ConfigurationReader.get("crmpassword");

        LoginPage loginPage = new LoginPage();
        loginPage.login(sUsername, sPassword);


    }

}