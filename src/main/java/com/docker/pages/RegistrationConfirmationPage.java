package com.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//a[text()=' sign-in ']")
    private WebElement signIn;

    @FindBy(xpath = "//a[text()='Flights']")
    private WebElement flights;

    public RegistrationConfirmationPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);       
    }

    public void goToFlightDetailsPage() {
        this.wait.until(ExpectedConditions.visibilityOf(this.signIn));
        this.flights.click();
    }


}
