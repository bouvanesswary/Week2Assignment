package week2Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		// click on Phone// Enter phone number // Click find leads button
		driver.findElementByXPath("(//em[@class='x-tab-left']//span)[4]").click();
		driver.findElementByName("phoneNumber").sendKeys("9675893354");
		// driver.findElementByClassName("x-btn-text").click();
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		// Capture lead ID of First Resulting lead
		WebElement result = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		String R = result.getText();
		System.out.println(R);
		// System.out.println(
		// driver.findElementByXPath("//div[@class='x-grid3-cell-inner
		// x-grid3-col-partyId']/a").getText());

		// Click First Resulting lead
		result.click();
		// Click Delete
		driver.findElementByClassName("subMenuButtonDangerous").click();
		// Click Find leads
		driver.findElementByXPath("//div[@class='frameSectionBody']//li").click();
		// Enter captured lead ID
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("vaishnu");

		// Click find leads button
		driver.findElementByXPath("(//td[@class='x-btn-center']/em)[7]").click();
		// Verify message "No records to display" in the Lead List. This message
		WebElement noresult = driver.findElementByXPath("//td[@class='x-btn-right']/following::div");
		String result1 = noresult.getText();
		System.out.println(result1);
			
		
		// confirms the successful deletion
		
		driver.findElementByXPath("(//div[@class='frameSectionBody']//li)[3]").click();
		driver.findElementByXPath("(//em[@class='x-tab-left']//span)[4]").click();
		driver.findElementByName("phoneNumber").sendKeys("9675893354");
		// driver.findElementByClassName("x-btn-text").click();
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(5000);
		
		if(result1.contains(R))
		{
			System.out.println("No result found");
		}

		// Close the browser (Do not log out)
		driver.close();
	}

}
