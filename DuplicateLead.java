package week2Assignment2;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		// Enter the username
		// Enter the password
		// Click Login
		// Click crm/sfa link
		// Click Leads link
		// Click Find leads
		WebElement webUser = driver.findElementByXPath("//input[@class='inputLogin']");
		webUser.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//li)[3]").click();
		driver.findElementByXPath("(//em[@class='x-tab-left']//span)[6]").click();
		driver.findElementByName("emailAddress").sendKeys("shaikchintu989@gmail.com");//click on email and enter email
	//	driver.findElementByLinkText("Find Leads").click();//click find leads button
		//driver.findElementByLinkText("Find Leads").click();
		//Capture name of First Resulting lead and Click First Resulting lead
		
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		
		WebElement findlead=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		String name=findlead.getText();
		System.out.println(name);
		findlead.click();
		
		// Duplicate lead
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a").click();
		
	
		//Click Duplicate Lead //Verify the title as 'Duplicate Lead'
		WebElement dl=driver.findElementByClassName("frameSectionExtra");
		dl.click();
		String dup=driver.getTitle();
		System.out.println("Current Title "+dup);
				
		
		//Click Create Lead
		driver.findElementByClassName("smallSubmit").click();
		//	Confirm the duplicated lead name is same as captured name
	WebElement dupresult=driver.findElementById("viewLead_firstName_sp");
	String dup1=dupresult.getText();
	if(dup1.contains(name))
	{
		System.out.println("Result Matches");
	}
	else
	{
		System.out.println("No Match found");
	}
				
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
