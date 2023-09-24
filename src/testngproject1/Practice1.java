package testngproject1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class Practice1 {
	public void f() throws InterruptedException {
	
	
	System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	   ChromeDriver driver= new ChromeDriver();
	   driver.get("http://demo.itlearn360.com/");
	   Thread.sleep(3000);
	

}}
