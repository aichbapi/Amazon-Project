package com.Amazon.com;

import org.testng.annotations.Test;

public class TC01_ABC {
	
	@Test(priority=1)
	public void checktest() throws Exception {
		Base.check();
		Base.checkAgain();
	}

}
