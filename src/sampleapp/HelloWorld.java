package sampleapp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args)
    {
        //ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver","F:\\download1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
      //  System.out.println("Hello World");
    }


}
