package Live.Functions;
import Live.Elements.tncreateaccountElements;
import org.testng.Assert;

public class TNFunctions extends commonFunctions{
    public void createAccount(){
        driver.findElement(tncreateaccountElements.firstName).sendKeys("Rachna");
        driver.findElement(tncreateaccountElements.lastName).sendKeys("Yadav");
        driver.findElement(tncreateaccountElements.email).sendKeys("rachna@gmail.com");
        driver.findElement(tncreateaccountElements.telephone).sendKeys("0123456789");
        System.out.println("Credentials are entered");
        driver.findElement(tncreateaccountElements.password).sendKeys("123456");
        driver.findElement(tncreateaccountElements.confirmPass).sendKeys("123456");
        System.out.println("Password is confirmed");
        driver.findElement(tncreateaccountElements.continueButton).click();
        System.out.println("Continue button is clicked");
        Assert.assertTrue(driver.findElement(tncreateaccountElements.identify).isDisplayed());

    }
}
