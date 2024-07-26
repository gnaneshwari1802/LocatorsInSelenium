package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GtutorLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to test scripts of g-tutor");
		//launching chrome driver//
		ChromeDriver driver=new ChromeDriver();
		//accesing any website through path//
		driver.get("https://gtutornzb.netlify.app/#/login");
		//getting fullscreen //
		driver.manage().window().fullscreen();
		//time 3 seconds//
		Thread.sleep(3000);
		//acceesing the web element through the id,name etc//
		driver.findElement(By.name("email")).sendKeys("rahulgannaji@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("8897672485");
		Thread.sleep(2000);
		//acceesing the click events //
		driver.findElement(By.className("sign in")).click();
		//getting quit//
		driver.quit();


	}

}
