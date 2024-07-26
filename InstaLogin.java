package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		//instagram signup form 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		/*driver.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9912269969");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("rakesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rakeshchari222");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("72485rakesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@class='_aah-']//div//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		Thread.sleep(3000);*/
		//instagram login form 
		//driver.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rakeshchari222");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("72485rakesh");
		Thread.sleep(3000);//
		driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		//driver.close();
		
		
		
		
	}

}
