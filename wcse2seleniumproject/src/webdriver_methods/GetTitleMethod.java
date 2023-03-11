package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/"); //To launch instagram web page
		String InstaLoginPage = driver.getTitle();//using getTitle method get title of current webpage(instagram)
		System.out.println(InstaLoginPage); //Print Insta login page
		
	}

}
