package Selenium;
import Selenium.Samplepractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class image {
    public static void main(String[] args){
        ChromeDriver driver= Samplepractice.readpath("https://paytm.com/careers/");
        String title1= driver.getTitle();
        String url1= driver.getCurrentUrl();
        driver.findElement(By.xpath("//a[@href='/']")).click();
        String title2= driver.getTitle();
        String url2= driver.getCurrentUrl();
        Assert.assertNotEquals(title1,title2);
        Assert.assertFalse(url1.equals(url2));
        System.out.println("Success");


    }
}
