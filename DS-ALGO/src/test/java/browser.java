import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class browser {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void  verifybrowser(String browsername) {
		if(browsername.equalsIgnoreCase("firefox"))
		{
		//System.setProperty("webdriver.gecko.driver","/Users/komalamathibal/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();


			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		
	{
	 //System.setProperty("webdriver.chrome.driver","/Users/komalamathibal/Downloads/chromedriver");
	        WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
	}
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().back();
		driver.quit();

		System.out.println(driver.getTitle());
		


}}
