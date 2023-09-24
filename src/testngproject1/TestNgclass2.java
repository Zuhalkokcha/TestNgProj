package testngproject1;

import org.testng.annotations.Test;

public class TestNgclass2 {

	
		// TODO Auto-generated method stub
		 @Test(groups = "login")
		  public void openWebsite() {
		      System.out.println("openWebsite");
		  }
		  @Test(groups = "login")
		  public void enterData() {
		      System.out.println("enterData");
		  }
		  @Test(groups = "login")
		  public void pressLogin() {
		      System.out.println("pressLogin");
		  }
		  @Test(groups = "explore")
		  public void explorePage() {
		      System.out.println("explorePage");
	}

}
