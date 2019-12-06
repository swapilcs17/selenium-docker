package com.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private WebDriver driver;   
    
    public SearchPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
        this.driver=driver;      
    }

    public void goTo() {
        this.driver.get("https://www.gmail.com");    
        System.out.println("Test Passed successdully");
    }  

   

}
