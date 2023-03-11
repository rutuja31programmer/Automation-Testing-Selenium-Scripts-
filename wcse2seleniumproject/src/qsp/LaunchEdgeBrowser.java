package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		  // To avoid (org.openqa.selenium.SessionNotCreatedException) we have to update file -edge browser
								//and driver executable file msedgedriver
		
		new EdgeDriver();// created object for firefox driver 
	}

}
