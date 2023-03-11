package actions_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//WebElement src  = driver.findElement(By.xpath("//li[contains(text(),'BANK')]"));
		//WebElement target = driver.findElement(By.xpath("//div[@id='shoppingCart1']"));
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target = driver.findElement(By.xpath("(//div[@id='shoppingCart4']/descendant::li)[1]"));
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target1 = driver.findElement(By.xpath("(//div[@id='shoppingCart4']/descendant::li)[2]"));
		
		Actions act = new Actions(driver);
		//To perform dreagAndDrop action
		act.dragAndDrop(src , target).perform();
		
		act.dragAndDrop(src1, target1).perform();
		
		
	}

}
