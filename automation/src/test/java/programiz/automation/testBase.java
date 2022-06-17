package programiz.automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class testBase {
	
	
	public static WebDriver driver;
	 
	 
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma.hamdi\\Desktop\\chromedriver102.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.programiz.com/java-programming/online-compiler");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
