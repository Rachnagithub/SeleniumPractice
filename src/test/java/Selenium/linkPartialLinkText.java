package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkPartialLinkText {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\IdeaProjects\\Java_Class\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
        forgottenPassword.click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Meta AI")).click();

    }
}
