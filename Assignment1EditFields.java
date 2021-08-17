package week2.assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElementById("email").sendKeys("bouvanesswary@gmail.com");
		 WebElement append=driver.findElementByXPath("(//label[@for='email']/following-sibling::input)[2]");
		 append.sendKeys("TEXT");
		 append.sendKeys(Keys.TAB);
		 append.sendKeys(Keys.ENTER);
		 driver.findElementByName("username").sendKeys(" TestLeaf");
		 WebElement username=driver.findElementByXPath("//label[@for='uname']/following-sibling::input");
		 String un=username.getAttribute(title);
		 System.out.println(un);
		 
		 WebElement clear=driver.findElementByXPath("(//label[@for='uname']/following-sibling::input)[2]");
		 clear.clear();
		 
		 try {
		WebElement disablefield = driver.findElementByXPath("//label[@for='disabled']/following-sibling::input");
		disablefield.sendKeys("Disable");
		System.out.println("Field enabled");
		 }
		 catch(ElementNotInteractableException e)
		 {
			 System.out.println("Disabled");
		 }
		 
		 }
		 

	}

