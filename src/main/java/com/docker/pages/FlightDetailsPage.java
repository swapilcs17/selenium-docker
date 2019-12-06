package com.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "tripType")
    private WebElement oneWay;

    @FindBy(name = "findFlights")
    private WebElement submitBtn;

    public FlightDetailsPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);        
    }

    public void selectOneWay() {
        this.oneWay.click();
    }

    public void goToFindFlightsPage() {
        this.submitBtn.click();
    }




}
