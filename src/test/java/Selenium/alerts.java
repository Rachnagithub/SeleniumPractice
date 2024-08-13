package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Selenium.Samplepractice;
public class alerts {
    public static void main(String[] args)throws Exception{
        String filepath= System.getProperty("user.dir");
        ChromeDriver driver= Samplepractice.readpath(filepath+"//src//test.html");
        driver.findElement(By.xpath("//button[@name='alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@name='confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@name='prompt']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        System.out.println(driver.switchTo().alert().getText());
    }
}
