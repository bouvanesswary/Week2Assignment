package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		 System.out.println(title);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("home").click();
		 WebElement home= driver.findElementByXPath("(//h5[@class='wp-categories-title']/following-sibling::img)[2]");
		home.click();
		
		WebElement xy= driver.findElementById("position");
		 Point buttonloc=xy.getLocation();
		 
		 int x=buttonloc.getX();
		 System.out.println("X Coordinate " + x);
		 int y=buttonloc.getY();
		 System.out.println("Y Coordinate " + y);
		 		 
		WebElement buttoncolor=driver.findElementByXPath("(//label[@for='position']/following-sibling::button)[2]");
		String Buttoncolor=buttoncolor.getCssValue("background-color");
		System.out.println("Button color is "+Buttoncolor);
		
		
		//WebElement buttonsize=driver.findElementByXPath("(//label[@for='position']/following-sibling::button)[3]");
		WebElement buttonsize=driver.findElementById("size");
		Dimension size=buttonsize.getSize();
		System.out.println("Size of a button " +size);
		
		

		 

	}

}
