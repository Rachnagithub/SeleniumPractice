package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Samplepractice {
    public static ChromeDriver readpath(String url){
      String filepath= System.getProperty("user.dir");
      File file= new File(filepath+"\\chromedriver.exe");
      System.setProperty("webdriver.chrome.driver",String.valueOf(file));
      ChromeDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(url);
      return driver;

    }
    public static void main(String[] args){
        String url= "https://www.amazon.com/";
        ChromeDriver driver= readpath(url);


    }
}
