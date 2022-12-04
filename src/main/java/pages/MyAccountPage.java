package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "addresses-link")
    WebElement address;

    public void pressAddress(){
        address.click();
    }

}
