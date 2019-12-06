package com.docker.test;

import com.docker.pages.FindFlightPage;
import com.docker.pages.FlightConfirmationPage;
import com.docker.pages.FlightDetailsPage;
import com.docker.pages.RegistrationConfirmationPage;
import com.docker.pages.RegistrationPage;

import test.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlightTest extends BaseTest {   

    @Test
    public void registrationTest() {
        RegistrationPage registartionPage = new RegistrationPage(driver);
        registartionPage.goTo();
        registartionPage.enterUserDetails("Selenium","Docker");
        registartionPage.enterUserCredentials("Selenium","Docker");
        registartionPage.submit();
    }

    @Test(dependsOnMethods = "registrationTest")
    public void registrationConfirmation() {
        RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage(driver);
        registrationConfirmationPage.goToFlightDetailsPage();
    }

    @Test(dependsOnMethods = "registrationConfirmation")
    public void flightDetailsPage() {
        FlightDetailsPage flightDetails = new FlightDetailsPage(driver);
        flightDetails.selectOneWay();
        flightDetails.goToFindFlightsPage();
    }

    @Test(dependsOnMethods = "flightDetailsPage")
    public void findFlightPage() {
        FindFlightPage findFlight = new FindFlightPage(driver);
        findFlight.submitFlight();
        findFlight.goToFlightConfirmationPage();
    }

    @Test(dependsOnMethods = "findFlightPage")
    public void flightConformationPage() {
        FlightConfirmationPage confirm = new FlightConfirmationPage(driver);
        confirm.printConfirmation();
        confirm.signOff();
    }
    
}
