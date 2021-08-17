package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 Actions actions = new Actions(driver);
		driver.get("http://leafground.com/pages/Image.html");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //Click on Home Page to go to home page
		 driver.findElementByXPath("(//label[@for='home']/following-sibling::img)").click();
		WebElement imagebutton=driver.findElementByXPath("(//h5[@class='wp-categories-title']/following-sibling::img)[4]");
		imagebutton.click();
		
		 //Am i broken?
		 WebElement broken=driver.findElementByXPath("(//label[@for='position']/following-sibling::img)");
		 boolean imgbrok=broken.isEnabled();
		 System.out.println("Image status "+imgbrok);
		 
				
		//click me using keyboard or mouse
		
		WebElement keyclick= driver.findElementByXPath("(//label[@for='position']/following-sibling::img)[2]");
	    actions.doubleClick(keyclick).perform();
	    //actions.contextclick(keyclick).perform();//Right Click
	    System.out.println("Left Click the image");
	    driver.findElementByXPath("(//h5[@class='wp-categories-title']/following-sibling::img)[4]").click();
		System.out.println("HomePage");
	    
		
		
		
		
		 
		 
		 
		 
		 /*
		  * try {
			invalidImageCount = 0;
			List<WebElement> imagesList = driver.findElements(By.tagName("img"));
			System.out.println("Total no. of images are " + imagesList.size());
			for (WebElement imgElement : imagesList) {
				if (imgElement != null) {
					verifyimageActive(imgElement);
				}
			}
			System.out.println("Total no. of invalid images are "	+ invalidImageCount);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
*/
		  
		 
	}
	}



