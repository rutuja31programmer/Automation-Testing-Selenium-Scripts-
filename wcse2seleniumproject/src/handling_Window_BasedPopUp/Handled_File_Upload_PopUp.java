package handling_Window_BasedPopUp;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Handled_File_Upload_PopUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-vs3484c/login.do");//path of Acti-time
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Logo & Color Scheme']"));
		//Action Class
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();//To perform mousehover action
		target.click();
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		WebElement target1 = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		//FileUpload PopUp
		act.doubleClick(target1).perform();//To perform doubleclick method
		//Handled FileUpload Popup
		File path = new File("./Autoit/FileUpload.exe");
		String apath = path.getAbsolutePath();
		Runtime.getRuntime().exec(apath);
		Thread.sleep(4000);
		Runtime.getRuntime().exec(apath);

		}

}
