package week2.assignments;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //select checkbox
		 WebElement cb1=driver.findElementByXPath("//label[@for='java']/following::input");
		 cb1.click();
		 //deselect checkbox
		 WebElement cb2=driver.findElementByXPath("(//label[@for='java']/following::input)[6]");
		 if(cb2.isSelected())
		 {
			 System.out.println("Check box is selected");
		 }
		 else
		 {
			 System.out.println("Check box not selected");
		 }
		 
		 //Deselect only selected
		WebElement cb3=driver.findElementByXPath("(//label[@for='java']/following::input)[7]");
		 if(cb3.isSelected())
		 {
			 cb3.click();
			 System.out.println("Selenium selected deselected a checkbox");
		 }
		 else {
			 System.out.println("Check box not selected ");
		 }
		 WebElement cb4=driver.findElementByXPath("(//label[@for='java']/following::input)[8]");
		 if(cb4.isSelected())
		 {
			 cb4.click();
			 System.out.println("Selenium selected deselected a checkbox");
		 }
		 else {
			 System.out.println("Check box not selected ");
		 }
		 
		 //Select all below checkbox
		 
		 //WebElement cb5=driver.findElementByXPath("(//div[@class='example']//input)[9]");4
	List<WebElement> cb5=driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
	
		for(int i=0;i<cb5.size();i++)
		{
			cb5.get(i).click();
		}
		
		
		 
		
		 
		 

	}

}