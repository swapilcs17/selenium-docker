package com.docker.pages;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightConfirmationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//font[contains(text(),'Flight')]")
    private WebElement flight;

    @FindBy(xpath = "//font[contains(text(),'$5')]")
    private WebElement usd;

    @FindBy(xpath = "//a[text()='SIGN-OFF']")
    private WebElement signOff;

    public FlightConfirmationPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void printConfirmation() {
        this.wait.until(ExpectedConditions.visibilityOf(this.usd));
        System.out.println(this.flight.getText());
        System.out.println(this.usd.getText());
    }

    public void signOff() {
        this.signOff.click();
    }

}
