package testngproject2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

 

public class Practice3 {
WebDriver driver;


public class AutomatedTest {

    WebDriver driver;

    @BeforeTest
    public void OpeningBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.itlearn360.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        driver.findElement(By.id("loginlabel")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("log")).sendKeys("Demo12");
        Thread.sleep(5000);
        driver.findElement(By.name("pwd")).sendKeys("Test123456$");
        Thread.sleep(5000);
        driver.findElement(By.name("wp-submit")).click();
    }

    @Test(priority =2)
    public void dashboard() throws InterruptedException {
        driver.findElement(By.name("search_course")).sendKeys("Cyber Security Academy");
        Thread.sleep(5000);
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.className("lg_button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='learn-press-user-profile']/ul/li[3]")).click();
    }
       @Test(priority =3)
       public void Subscribe() throws InterruptedException {
    	   
    	   
    	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div/main/article/div/div[1]/div/div[2]/div/div/div/ul/li[4]/form/div/button")).click();
    	driver.findElement(By.xpath("//*[@id=\'learn-press-payment\']/ul/li/label")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.name("learn_press_checkout_place_order")).click();
    	Thread.sleep(3000);
    	
    	WebElement frm= driver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe"));
 	   driver.switchTo().frame(frm);
 	   
 	   driver.findElement(By.name("cardnumber")).sendKeys("1233 5671 8965 1234");

    	driver.findElement(By.name("exp-date")).sendKeys("12/24");
    	driver.findElement(By.name("cvc")).sendKeys("440");
    	Thread.sleep(3000);
    	driver.findElement(By.className("btn btn-primary")).click();
    	Thread.sleep(3000);
       }
    	
    	//@AfterTest
    	//public void close() throws InterruptedException {
    		
    		//driver.close();
    		
    	
    	
    	
    	
       
       
       
       
}}


