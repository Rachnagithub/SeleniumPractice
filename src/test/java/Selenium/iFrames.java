package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class iFrames {
    public static void main(String[] args){
         String filePath= System.getProperty("user.dir");
         System.out.println(filePath);
         ChromeDriver driver= Samplepractice.readpath(filePath+"//src//test//java//text.html");



    }
}
