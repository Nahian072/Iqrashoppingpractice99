package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
   String url="https://qa.iqrashoppingdemo.xyz/";
//   Declaring main method
    public static void main(String[] args) {
//  setting two arguments
        String chromedriverpath ="C:\\MyWorkspace\\Iqrashoppingpractice99\\chromedriver.exe";
System.setProperty("Webdriver.Chrome.driver","C:\\MyWorkspace\\Iqrashoppingpractice99\\chromedriver.exe");

//initializing driver
  WebDriver driver=new ChromeDriver();
//launching target url
        driver.get("https://qa.iqrashoppingdemo.xyz/");
//validating username
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys("practice99");
// validating email
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("practice@gmail.com");
// validate password
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("practice@gmail.com");
// validate register button
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();
    }
}
