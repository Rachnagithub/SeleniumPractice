package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\IdeaProjects\\Java_Class\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.instagram.com");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        String title=driver.getTitle();
        System.out.println(title);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();




    }

}
