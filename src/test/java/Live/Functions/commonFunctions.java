package Live.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonFunctions {
    public WebDriver driver;
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

    public void quit(){
        driver.quit();
        System.out.println("Chromedriver has been closed");
    }
}
