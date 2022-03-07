package Personal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{
	
	public WebDriver driver;
	public void initializtation() throws FileNotFoundException{
	
		//Chrome
	Properties prop= new Properties();
	FileInputStream Fis= new FileInputStream("C:\\Users\\monu0\\eclipse-workspace\\E2ETesting\\src\\main\\java\\Personal\\Data.properties");
	prop.get(Fis);
	String BrowserName= prop.getProperty("Browser");
	
	if (BrowserName=="Chrome") {
		
		System.setProperty("webdriver.chome.driver","C:\\\\Users\\\\monu0\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver= new ChromeDriver();
		}
	}

}
