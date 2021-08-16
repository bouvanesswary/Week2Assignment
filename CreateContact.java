package week2Assignment2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pseudo Code
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		// 2. Enter UserName and Password Using Id Locator
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElementByClassName("decorativeSubmit").click();
		// 4. Click on CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();
		// 5. Click on contacts Button
		driver.findElementByLinkText("Contacts").click();
		// 6. Click on Create Contact
		driver.findElementByLinkText("Create Contact").click();
		
		// 7. Enter FirstName Field Using id Locator
		driver.findElementById("firstNameField").sendKeys("Bouvana");
		// 8. Enter LastName Field Using id Locator
		driver.findElementById("lastNameField").sendKeys("Alibert");
		// 9. Enter FirstName(Local) Field Using id Locator
		driver.findElementByName("firstNameLocal").sendKeys("Bouvanesswary");
		// 10. Enter LastName(Local) Field Using id Locator
		driver.findElementByName("lastNameLocal").sendKeys("S");
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElementByName("departmentName").sendKeys("CSE");
		// 12. Enter Description Field Using any Locator of your choice
		driver.findElementByName("description").sendKeys("Hi hello");
		// 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElementById("createContactForm_primaryEmail").sendKeys("bouvanesswary@gmail.com");
		
		// 14. Select State/Province as NewYork Using Visible Text
		WebElement state=driver.findElementByName("generalStateProvinceGeoId");
		Select ss=new Select(state);
		ss.selectByVisibleText("84057");
		// 15. Click on Create Contact
		driver.findElementByName("submitButton").click();
		// 16. Click on edit button
		driver.findElementByLinkText("Edit").click();
		// 17. Clear the Description Field using .clear
		driver.findElementById("updateContactForm_description").sendKeys("updated desc");
		// 18. Fill ImportantNote Field with Any text
		driver.findElementById("updateContactForm_importantNote").sendKeys("important contact updated");
		// 19. Click on update button using Xpath locator
		driver.findElementByXPath("(//td[@class='label']/following::input)[9]").click();
		// 20. Get the Title of Resulting Page.
	//WebElement title1=driver.findElementById("sectionHeaderTitle_contacts");
	String title1 = driver.getTitle();
	System.out.println("Title of the page: "+title1);

	}

}
