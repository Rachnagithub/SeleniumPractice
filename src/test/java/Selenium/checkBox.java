package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Selenium.Samplepractice;
import org.testng.Assert;
public class checkBox {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver= Samplepractice.readpath("https://tickets.paytm.com/bus");
        WebElement checkbox= driver.findElement(By.xpath("//div[contains(@aria-label,' check box not selected')]"));
        Assert.assertTrue(checkbox.getAttribute("aria-label").contains("not selected"));
        checkbox.click();
        Assert.assertTrue(checkbox.getAttribute("aria-label").contains("check box selected"));
        System.out.println("Success");
    }
}
