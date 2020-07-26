package M2_Prjcts.Mvnn;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports_demo {
	
	
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation reports");
		reporter.config().setDocumentTitle("Test Results");
		
		
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "suresh");
		
		
		
		
	}
	
	
	
	@Test
	public void ExtentDemo() {
		ExtentTest test = extent.createTest("initial demo");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		System.out.println("Page Title : "+driver.getTitle());
		driver.close();
		extent.flush();
		
		
	}

}
