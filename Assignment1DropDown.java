package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //DropDown select by Index
		 WebElement dd1=driver.findElementById("dropdown1");
		 Select d1=new Select(dd1);
		 d1.selectByIndex(1);
		 
		 //DropDown select by Text
		 WebElement dd2=driver.findElementByName("dropdown2");
		 Select d2=new Select(dd2);
		 d2.selectByVisibleText("Appium");
		 
		 //DropDown select by Value
		 WebElement dd3=driver.findElementById("dropdown3");
		 Select d3=new Select(dd3);
		 d3.selectByValue("3");
		 
		 //Get the number of Dropdown options
		 WebElement dd4=driver.findElementByClassName("dropdown");
		 Select d4=new Select(dd4);
		 d4.selectByValue("4");
		 int totald4=d4.getOptions().size();
		 System.out.println(" Total Options available in 4th dropdown "+totald4);
		 
		 //Select dropdown by sendkeys
		 WebElement dd5=driver.findElementByXPath("(//div[@class='example']/select)[5]");
		 dd5.sendKeys("Appium");
		 
		 //Select your program
		 WebElement dd6=driver.findElementByXPath("(//div[@class='example']/select)[6]");
		 Select d6=new Select(dd6);
		 d6.selectByValue("3");
		 
		 
		 
		 
	}

}
