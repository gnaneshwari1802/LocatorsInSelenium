package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {

	public static void main(String[] args) throws InterruptedException {
		// launching the chrome driver
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//driver.get("https://testautomationpractice.blogspot.com/");
		//xpaths
		/*there are 2 types of xpaths 
		 * 1>Absolute xpath(full path):from the body it will find out the web element
		 * 2>relative xpath(partial xpath):from anywhere of the application it find outs the web application
		 *examples 
		//absolute xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("rahul");
		//relative xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rahul 850");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8502010101");
		 */
		//1)xpath with single attribute
		//driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("giiii");
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//1) xpath with single attribute:if we want to find an element then we need to mention the id of attribute
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("shirts");
		
		//2) xpath with multiple attributes:If we want to find elements then we can use mulltiple attributes in one bracket
		//driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("rkaulm");
		
		//3) xpath with and operation:With this operation we can perform the the actions if the 2 conditions matches
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("rlm");
		
		//4) xpath with or operation: With this operation we can perform the action when anyone is validnames
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']")).sendKeys("rl2m");
		
		//5) xpath with innerText: this will be available with the texted link
		//driver.findElement(By.xpath("//*[text()='nopCommerce']")).click();
		
		//6) to get the inner text ;with this we get the text of link
		/*
		String value=driver.findElement(By.xpath("//*[text()='nopCommerce']")).getText();
		System.out.println(value);
		
		String st=driver.findElement(By.xpath("//*[text()='View News Archive']")).getText();
		System.out.println(st);
		*/
		//7) finding the status of attribute wheather its exists or not
		/*
		boolean status=driver.findElement(By.xpath("//*[text()='View News Archive']")).isDisplayed();
		System.out.println(status);
		*/
		//8) xpath with contains :this method will use, when the name is lengthy the we can specify some of the words 
		/*
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("huili");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter')]")).sendKeys("hui@li");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("hui@li");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your')]")).sendKeys("hui@li");
		driver.findElement(By.xpath("//input[contains(@placeholder,'here')]")).sendKeys("hui@li");
		driver.findElement(By.xpath("//input[contains(@placeholder,'E')]")).sendKeys("hui@li");
		*/
		
		//9)xpath with Starts-with:this method will use,with the starting name we can find out 
		/*
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Se')]")).sendKeys("hli");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("hli");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("hli");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Searc')]")).sendKeys("hli");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("hli");
		*/
		//chained xpath: if the xpath dont have name ,id or anything then we use this
		//-->this is the combination of absolute xpath and relative xpath
		/*
		driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).click();
		
		Boolean status=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(status);
		*/
		
		Thread.sleep(2000);
		driver.close();
	}

}
