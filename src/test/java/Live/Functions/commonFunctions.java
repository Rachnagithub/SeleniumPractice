package Live.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class commonFunctions {
    public static WebDriver driver;
    public WebDriver initializeDriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chromedriver has started");
        return driver;

    }
    public void openURL(String url){
        driver.get(url);
        System.out.println("Opened the url of tutorialsninja");

    }

    public void clickmyAccount() throws Exception{
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Register")).click();

    }

    public Properties readData(String filename) throws Exception{
        File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\Live\\TestData\\"+filename+".properties");
        FileInputStream fis = new FileInputStream(file);
        Properties p= new Properties();
        p.load(fis);
        return p;
    }

    public void quit(){
        driver.quit();
        System.out.println("Chromedriver has been closed");
    }
}
