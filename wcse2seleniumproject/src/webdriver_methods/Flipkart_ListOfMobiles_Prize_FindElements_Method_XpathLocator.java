package webdriver_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_ListOfMobiles_Prize_FindElements_Method_XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		List<WebElement> MobileName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> PriceOfMobiles=driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0;i<MobileName.size();i++)
		{
			String op = MobileName.get(i).getText();
			
			for(int j=i;j<=i;j++)
			 {
				String opt = PriceOfMobiles.get(j).getText();
				System.out.print(op+" : "+opt);
				Thread.sleep(2000);
			 }
		     System.out.println();
		}

	}
}
