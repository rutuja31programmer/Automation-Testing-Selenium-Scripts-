package keyword_driven_framework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{
	
	static WebDriver driver;
	public void setUp() throws EncryptedDocumentException, IOException
	{
		//To open bowser
		
		Flib flib = new Flib();
		String browserValue=flib.readPropertyData(PROP_PATH, "browser");
		String url=flib.readPropertyData(PROP_PATH, "url");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			driver.get(url);
		}
		
		else if (browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		
		else
		{
			System.out.println("Invalid browserValue");
		}
	}
		
		public void tearDown()//To close browser
		{
			driver.quit();
		}
		
		
	
}
