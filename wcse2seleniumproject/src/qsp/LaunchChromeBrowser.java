package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//Launching chrome browser

public class LaunchChromeBrowser { 
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// two arguments in string 
														//absolue path ./ relative path for driver executable file
														// /drivers/chromedriver.exe
														//To avoid(java.lang.IllegalStateException:)
		new ChromeDriver();// created object for chrome driver 
	}

}
