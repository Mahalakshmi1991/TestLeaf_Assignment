package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class HooksImplementation extends BaseClass {
	
	@Before
	public void preConditions()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver=new ChromeDriver(opt);
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
	@After
	public void postConditions()
	{
		driver.close();
	}

}
