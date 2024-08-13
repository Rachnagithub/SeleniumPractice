package Selenium;
import Selenium.Samplepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver= Samplepractice.readpath("https://www.paytm.com/");
        WebElement Button= driver.findElement(By.xpath("//label[contains(@id,'rt')]"));
        String before= Button.getAttribute("class");
        System.out.println(before);
        System.out.println(Button.isSelected());
        Button.click();
        Thread.sleep(3000);
        String after= Button.getAttribute("class");
        System.out.println(after);
        System.out.println(Button.isSelected());
        if (before.equalsIgnoreCase(after)) System.out.println("Button not clicked");
         else System.out.println("Button clicked");
    }
}
