package com.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name="firstName")
    private WebElement firstNameTextBox;

    @FindBy(name="lastName")
    private WebElement lastNameNameTextBox;

    @FindBy(name="email")
    private WebElement userName;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(name="confirmPassword")
    private WebElement confirmPassword;

    @FindBy(name="register")
    private WebElement submit;


    public RegistrationPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
        this.driver=driver;
        this.wait = new WebDriverWait(driver,30);
    }

    public void goTo() {
    
        this.driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
        this.wait.until(ExpectedConditions.visibilityOf(this.firstNameTextBox));       
    }

    public void enterUserDetails(String firstName, String lastName) {
        this.firstNameTextBox.sendKeys(firstName);
        this.lastNameNameTextBox.sendKeys(lastName);
    }

    public void enterUserCredentials(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
    }

    public void submit() {
        this.submit.click();
    }

}
