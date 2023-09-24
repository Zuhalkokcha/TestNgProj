package inadevproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Inadev1 {




	@Test()
	
	public void opendriver() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			 //webdriver.chrome.driver-->value of path
			  driver.get("http://localhost:3000");
			  //clicking the add task button
			  
			  
			 
			  
			 
				  
			  
			  driver.findElement(By.cssSelector("button.button_button--primary__09xDJ")).click();	
			  //Add task in the title box
			  driver.findElement(By.id("title")).sendKeys("Testing");
			  // select value from dropdown box
			  WebElement ddown = driver.findElement(By.id("type"));
			  Select select = new Select(ddown);
			  select.selectByValue("complete");
			  select.selectByVisibleText("Completed");
			  select.selectByIndex(1);
			  

			  //click the add task button
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/div/form/div/button[1]")).click();
			  //click on the pencil to update the task
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div[2]/div[2]")).click();
			
			

		 	 
			//for updating the title first clear the title box
			 driver.findElement(By.id("title")).clear();
			 //add updated task to the box
			 driver.findElement(By.id("title")).sendKeys("deploying");
			
			// for updating the dropdown
			 WebElement ddown1 = driver.findElement(By.id("type"));
			 Select select1 = new Select(ddown1);
			 select1.selectByValue("incomplete");
			 //select1.selectByVisibleText("incomplete");
			 //select1.selectByIndex(0);
			
			//for update task
	driver.findElement(By.cssSelector("#root > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div > form > div > button:nth-child(1)")).click();
		//for deleting the task
	driver.findElement(By.cssSelector("#root > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(1) > svg > path:nth-child(2)")).click();
	
	}}
	



		

 
			
	


