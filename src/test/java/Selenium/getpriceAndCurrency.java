package Selenium;
import Selenium.Samplepractice.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpriceAndCurrency {
    public static void main (String[] args) throws Exception{
        Samplepractice s= new Samplepractice();
        ChromeDriver driver= s.readpath("https://www.amazon.in/");
        WebElement searchTab= driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
        searchTab.sendKeys("iphone");
        Thread.sleep(3000);
        WebElement submit= driver.findElement(By.xpath("//input[contains(@value,'Go')]"));
        submit.click();
        WebElement getPrice= driver.findElement(By.xpath("//span[contains(@class,'price-whole')]"));
        Thread.sleep(3000);
        String a= getPrice.getText();
        System.out.println("Price is:" +a);
        WebElement getCurrency= driver.findElement(By.xpath("//span[contains(@class,'a-price-symbol')]"));
        Thread.sleep(3000);
        String b= getCurrency.getText();
        System.out.println("Currency is:" +b);

    }
}
