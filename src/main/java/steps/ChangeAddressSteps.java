package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.*;

public class ChangeAddressSteps {

    public static WebDriver driver;
    public String url = "https://mystore-testlab.coderslab.pl.";


    @Given("Użytkownik znajduje sie na stronie glownej")
    public void setApp(){
        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("Użytkownik wybiera opcje zaloguj sie")
    public void goToLoginPage(){
        NavigationPanelPage navigationPanelPage = new NavigationPanelPage(driver);
        navigationPanelPage.goToSignInPage();  
    }

    @And("Użytkownik wpisuje poprawne dane email i hasło, potwierdza wciskujac przycisk logowania")
    public void fillUpSignIn(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.logIn("tester.aido22@gmail.com","Teste.01");
    }

    @And("Użytkownik klika w pole Address na stronie MyAccountPage")
    public void addressLinkPres(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.pressAddress();
    }

    @And("Użytkownik klika w pole New address na stronie NewAddressPage")
    public void newAddressBtn(){
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.createNewAddress();
    }

    @And("^Użytkownik wypełnia formularz danymi \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",country,\"(.*)\"$")
    public void personalDataFill(String aliasSet,String addressSet,String citySet,String zipPostSet,String phoneSet){
        AddressPage addressPage = new AddressPage(driver);
        addressPage.newAddresSet(aliasSet,addressSet,citySet,zipPostSet,phoneSet);
    }

    @Then("Użytkownik zostaje przeniesiony na strone z nowym adresem i sprawdza poprawność danych")
     public void veryfiAddAddress(){
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.successfullyAdded();
    }

    @And("Zamykanie przeglądarki")
    public void tearDown(){
        driver.quit();
    }
}
