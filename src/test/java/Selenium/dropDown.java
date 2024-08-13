package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDown {
    public static void main(String[] args)throws Exception{
        ChromeDriver driver = Samplepractice.readpath("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[contains(@ajaxify,'spotlight')]")).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select day= new Select(driver.findElement(By.xpath("//select[(@aria-label='Day')]")));
        Select month= new Select(driver.findElement(By.xpath("//select[(@aria-label='Month')]")));
        Select year= new Select(driver.findElement(By.xpath("//select[(@aria-label='Year')]")));
        day.selectByValue("15");
        month.selectByIndex(7);
        year.selectByVisibleText("1987");
        List<WebElement> months= month.getOptions();
        for (WebElement w:months)
         System.out.println(w.getText());


    }
}
