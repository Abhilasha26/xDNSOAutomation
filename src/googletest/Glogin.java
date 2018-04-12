package googletest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Glogin {
	

	public static void main(String agr[])
	{
		System.setProperty("wedriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Documents\\Abhilasha Office work\\Selenium Automation files\\Selenium lates file\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https:\\www.google.co.in");
	}

}
