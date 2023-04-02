package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

//priority
//Flag is annotation ->perform test cases
//if the priority is zero(priority is not declare by default it will get ->zero) it will get alphabetical order
//same(1,1) priorities test case will get executed alphabetically
//less priority will get execute  first
//negative priority will get execute first
//no priority (means zero priority)

public class Flag3_3 {

	@Test(priority = 4)
	public void z() {
		Reporter.log("z", true);
	}

	@Test(priority = 1)
	public void a() {
		Reporter.log("a", true);
	}

	@Test(priority = 2)
	public void m() {
		Reporter.log("m", true);
	}

	@Test(priority = 3)
	public void h() {
		Reporter.log("h", true);
	}

	@Test(priority = 7)
	public void l() {
		Reporter.log("l", true);
	}

	@Test
	public void b() {
		Reporter.log("b", true);
	}	
	@Test(priority = -1)
	public void t() {
		Reporter.log("t", true);
	}	
	@Test
	public void j() {
		Reporter.log("j", true);
	}	
	@Test
	public void d() {
		Reporter.log("d", true);
	}	
	@Test(priority=0)
	public void r() {
		Reporter.log("r", true);
	}	
}
