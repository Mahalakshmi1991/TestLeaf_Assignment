package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MouseAndKeyboardActions {

	public static void main(String[] args)throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		//load the URL
		driver.get("https://www.amazon.in/");
		
		//Maximize the window and wait for the page to be loading using implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		
		if(button.isDisplayed())
		{
			button.click();
		}
		//Step 1: Create Actions class object
		Actions action = new Actions(driver);
		
		//Step2 : Find the Web element
		WebElement anchorLink = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		//Step3 : call the appropriate action methods
		action.scrollToElement(anchorLink).perform();
		
		//print the link text
		System.out.println("The text is: "+anchorLink.getText());
		
		//Take the screenshot
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		
		//copy to screenshot to destination 
		Files.copy(sourceFile, new File("C:\\screenShots\\AmazonPage.png"));
		
		driver.quit();
	}

}
