package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewAddressPage {
    public NewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Create new address")
    WebElement newAddressBtn;

    @FindBy(css = "article.alert.alert-success")
    WebElement added;

    @FindBy(xpath = "//section[@id='content']/div[2]/article/div[2]/a[2]/span")
    WebElement deleteAddress;

    public void createNewAddress() {
        newAddressBtn.click();
    }

//    public boolean successfullyAdded() {
//        return added.isDisplayed();
//    }

    public void successfullyAdded() {
        Assert.assertTrue(added.isDisplayed());
    }

    public void deleteAddAddress() {
        deleteAddress.click();
    }
}