package Live.Functions;
import Live.Elements.tncreateaccountElements;
import org.testng.Assert;

import java.util.Properties;

public class TNFunctions extends commonFunctions{
    public void createAccount(String fileName) throws Exception{
        Properties p= readData(fileName);
        driver.findElement(tncreateaccountElements.firstName).sendKeys(p.getProperty("FirstName"));
        driver.findElement(tncreateaccountElements.lastName).sendKeys(p.getProperty("LastName"));
        driver.findElement(tncreateaccountElements.email).sendKeys(p.getProperty("E-Mail"));
        driver.findElement(tncreateaccountElements.telephone).sendKeys(p.getProperty("Telephone"));
        System.out.println("Credentials are entered");
        driver.findElement(tncreateaccountElements.password).sendKeys(p.getProperty("Password"));
        driver.findElement(tncreateaccountElements.confirmPass).sendKeys(p.getProperty("ConfirmPassword"));
        System.out.println("Password is confirmed");
        driver.findElement(tncreateaccountElements.continueButton).click();
        System.out.println("Continue button is clicked");
        Assert.assertTrue(driver.findElement(tncreateaccountElements.identify).isDisplayed());

    }
}
