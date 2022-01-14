package Base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class Baseclass {
	
	LoginPage sp;
	@BeforeMethod
	public void TC1() {
		
		LoginPage sp = new LoginPage();   // call method teja object create 
		
		
	}
	
	@Test
	public void TC2() {
		sp.suraj();
	}
	
	/*
	 * @BeforeClass public void TC3() { System.out.println("hello2"); }
	 */
	
	/*
	 * @BeforeTest public void TC4() { System.out.println("hello3"); }
	 */
	

	
	/*
	 * @BeforeSuite public void TC6() { System.out.println("Beforsuite"); }
	 */
	
	
}
