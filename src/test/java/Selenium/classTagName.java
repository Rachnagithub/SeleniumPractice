package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class classTagName {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\IdeaProjects\\Java_Class\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
        WebElement availabilityBtn= driver.findElement(By.className("chkavailabilityBtn"));
        availabilityBtn.click();

    }
}
