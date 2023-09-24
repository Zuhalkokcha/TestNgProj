package testngproject2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2 {
  @Test
	    public void openingCNNSite() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\program files\\chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
//	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//	        driver = new FirefoxDriver();
	        System.out.println("Open /close  cnn.com in chrome browser");
	        driver.get("http://www.cnn.com/");
	        Thread.sleep(2000);
	        driver.close();
	    }
	    @BeforeTest
	    public void openingYahooSite() throws InterruptedException {
	        
	        System.setProperty("webdriver.chrome.driver", "C:\\program files\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
//	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//	        driver = new FirefoxDriver();
	        System.out.println("Open /close  yahoo.com in chrome browser");
	        driver.get("http://www.yahoo.com/");
	        Thread.sleep(2000);
	        driver.close();
	    }
  }

