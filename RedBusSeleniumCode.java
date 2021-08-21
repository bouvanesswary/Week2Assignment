package week2.assignment3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusSeleniumCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("the title of the page is " + driver.getTitle());

		WebElement from = driver.findElementById("src");
		from.sendKeys("Chennai");
		Thread.sleep(2000);
		from.sendKeys(Keys.TAB);

		// WebElement fromdd=driver.findElementByXPath("//ul[@class='autoFill']/li");

		WebElement destination = driver.findElementById("dest");
		destination.clear();
		destination.sendKeys("Pondicherry");
		Thread.sleep(2000);
		destination.sendKeys(Keys.TAB);

		// WebElement date=driver.findElementByClassName("db text-trans-uc");
		// driver.findElementByLinkText("Aug 2021").click();
		driver.findElementByXPath("//td[@class='current day']").click();

		WebElement search = driver.findElementById("search_btn");
		// WebElement
		// search=driver.findElementByXPath("//div[@class='date-error']/following::button");
		search.click();
Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='close-primo']/i").click();
		Thread.sleep(5000);
		
		WebElement result=driver.findElementByXPath("//span[@class='f-bold busFound']");
		String r=result.getText();
		System.out.println(r);
		
		driver.findElementByXPath("//label[@for='bt_SLEEPER']").click();
		
		Thread.sleep(5000);
		
		WebElement result1=driver.findElementByXPath("//span[@class='f-bold busFound']");
		String r1=result.getText();
		System.out.println("Sleeper -"+r1);
		Thread.sleep(5000);
		
		driver.findElementByXPath("//label[@for='bt_SLEEPER']").click();
		Thread.sleep(2000);
		//AC
		driver.findElementByXPath("//label[@for='bt_AC']").click();
		WebElement result3=driver.findElementByXPath("//span[@class='f-bold busFound']");
		String r3=result.getText();
		System.out.println("AC coach -"+r3);
		Thread.sleep(2000);
		//NON AC
		driver.findElementByXPath("//label[@for='bt_NONAC']").click();
		WebElement result4=driver.findElementByXPath("//span[@class='f-bold busFound']");
		String r4=result.getText();
		System.out.println("Both AC and NON AC -"+r4);
		Thread.sleep(2000);
		
	/* * RedBus: 1.Go to https://www.redbus.in/ in chrome 2.Type Chennai in From
		 * textBox and ENTER 3.Type Bengaluru in Destination textBox and ENTER 4.Choose
		 * any date in JULY 5.Click Search Buses 6.Close the popup using the X button at
		 * the right corner class=icon icon-close c-fs 7.Print the number of search
		 * results 8.Choose only Sleeper Bus 9.Print the number of search results
		 * 10.Deselect the sleeper Bus and select the AC bus alone 11.Print the number
		 * of search results 12.Choose also Non AC buses 13.Print the number of search
		 * results
		 */

	}

}
