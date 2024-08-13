package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readTestData {

    public Properties readData() throws Exception{
        File file= new File(System.getProperty("user.dir")+"//src//test//java//Selenium//testData.properties");
        FileInputStream fis= new FileInputStream(file);
        Properties p = new Properties();
        p.load(fis);
        return p;
    }


    @Test
    public void execute() throws Exception{
        readTestData a = new readTestData();
        Properties q= a.readData();
        String name= q.getProperty("name");
        String password= q.getProperty("password");
        ChromeDriver driver= Samplepractice.readpath("www.facebook.com");
        driver.findElement(By.name("email")).sendKeys(name);
        driver.findElement(By.name("password")).sendKeys("password");

    }

}
