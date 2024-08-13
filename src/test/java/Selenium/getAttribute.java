package Selenium;
import Selenium.Samplepractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args){
        Samplepractice s = new Samplepractice();
        ChromeDriver driver= s.readpath("https://www.facebook.com/");
        WebElement createAccount= driver.findElement(By.xpath("//a[contains(@ajaxify,'spotlight')]"));
        String a= createAccount.getText();
        System.out.println(a);

    }

}
