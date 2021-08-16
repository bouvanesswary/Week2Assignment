package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //select yes radio button
		WebElement radio1= driver.findElementByXPath("//label[@for='yes']/input");
		 radio1.click();
		 		 
		 //Check the selected radio button
		WebElement radio2=driver.findElementByXPath("//label[@for='Checked']/input");
		if(radio2.isSelected())
		{
		System.out.println("checked");	
		}
		else
		{
			System.out.println("unchecked");
		}
		
		// already selected radio button
		WebElement radio3=driver.findElementByXPath("(//div[@class='large-6 small-12 columns']//input)[6]");
		if(radio3.isSelected())
		{
			System.out.println("21-40: Dont do any changes");
		}
			
		else
		{
			WebElement radio3sel=driver.findElementByXPath("(//div[@class='large-6 small-12 columns']//input)[5]");
			radio3sel.click();
			System.out.println("1-20 selected ");
		
		
		 
		 
	}
}
}

