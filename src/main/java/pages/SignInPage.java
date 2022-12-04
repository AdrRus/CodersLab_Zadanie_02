package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(className = "form-control")
    WebElement emailInput;

    @FindBy(css = "input.form-control.js-child-focus.js-visible-password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement signInAc;

    public void logIn(String email, String password) {
        emailInput.clear();
        emailInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        signInAc.click();
    }
}