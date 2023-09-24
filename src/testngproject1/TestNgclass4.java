package testngproject1;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgclass4 {
	 @Test
	    public void test4() {
	        System.out.println("I am test 1 and I will pass");
	    }
	    @Test
	    public void test5() {
	        System.out.println("I am test 2 and I will skip");
	        throw new SkipException("I am skipping");
	    }
	    @Test
	    public void test6() {
	        System.out.println("I am test 3 and I will fail");
	        assertEquals(true, false);
	    }
}
