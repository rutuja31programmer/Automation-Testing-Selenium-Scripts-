package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser { 
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");// (org.openqa.selenium.SessionNotCreatedException)
		new FirefoxDriver();//object of firefox driver 
	}

}
