package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdName {
    public static void main(String[] args){
        System.getProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\IdeaProjects\\Java_Class\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement emailElement=driver.findElement(By.id("email"));
        emailElement.sendKeys("rachna_sweety123@yahoo.com");
        WebElement passwordElement= driver.findElement(By.id("pass"));
        passwordElement.sendKeys("123456");
        WebElement loginElement=driver.findElement(By.name("login"));
        loginElement.click();

    }

}
