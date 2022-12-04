package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {
    public NewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Create new address")
    WebElement newAddressBtn;

    @FindBy(css = "article.alert.alert-success")
    WebElement added;


    public void createNewAddress() {
        newAddressBtn.click();
    }

    public boolean successfullyAdded() {
        return added.isDisplayed();
    }
}