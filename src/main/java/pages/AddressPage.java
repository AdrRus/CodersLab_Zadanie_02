package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {


        public AddressPage(WebDriver driver){
            PageFactory.initElements(driver,this);
        }


        @FindBy(xpath = "//input[@id='field-alias']")
        WebElement alias;

        @FindBy(xpath = "//input[@id='field-address1']")
        WebElement adres;

        @FindBy(xpath = "//input[@id='field-postcode']")
        WebElement zipPostal;

        @FindBy(xpath = "//input[@id='field-city']")
        WebElement city;

        @FindBy(xpath = "//select[@id='field-id_country']")
        WebElement country;

        @FindBy(id = "field-phone")
        WebElement phone;

        @FindBy(css = "button.btn.btn-primary.form-control-submit.float-xs-right")
        WebElement saveNewAddress;

        public void newAddresSet(String aliasSet,String addressSet,String citySet,String zipPostSet,String phoneSet){
            alias.sendKeys(aliasSet);
            adres.sendKeys(addressSet);
            city.sendKeys(citySet);
            zipPostal.sendKeys(zipPostSet);
            Select country = new Select(this.country);
            country.selectByValue("17");
            phone.sendKeys(phoneSet);
            saveNewAddress.click();

        }

    }
