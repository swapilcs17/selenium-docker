package com.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindFlightPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "reserveFlights")
    private WebElement firstSubmit;

    @FindBy(name = "buyFlights")
    private WebElement secondSubmit;


    public FindFlightPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void submitFlight() {
        this.wait.until(ExpectedConditions.visibilityOf(this.firstSubmit));
        this.firstSubmit.click();
    }

    public void goToFlightConfirmationPage() {
        this.wait.until(ExpectedConditions.visibilityOf(this.secondSubmit));
        secondSubmit.click();
    }


}
