package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPanelPage {

    public NavigationPanelPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="span.hidden-sm-down")
    WebElement signInBtn;

    @FindBy(css="a.logout.hidden-sm-down")
    WebElement signOutBtn;


    public void goToSignInPage(){
        signInBtn.click();
    }

    public void signOutApp(){
        signOutBtn.click();
    }
}
