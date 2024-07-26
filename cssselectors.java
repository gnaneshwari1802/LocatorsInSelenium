package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) throws InterruptedException {
		// css selectors is used to find the elements with the help of symbols
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//tag id #id
		/*
		driver.findElement(By.cssSelector("#name")).sendKeys("rahul");
		driver.findElement(By.cssSelector("#email")).sendKeys("rahul45");
		driver.findElement(By.cssSelector("#phone")).sendKeys("258963147"); */
		//tag class .classNames
		/*
		driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("numbers");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click(); */
		//tag attribute (tag[attribute='name'])
		//driver.findElement(By.cssSelector("input[id='Wikipedia1_wikipedia-search-input']")).sendKeys("rahul");
		//tag class attribute tag.classname[attribute='value']
		/*
		driver.findElement(By.cssSelector("input.form-control[id='name']")).sendKeys("hi this is rahul");
		driver.findElement(By.cssSelector("input.form-control[id='email']")).sendKeys("hi this is rahul");
		driver.findElement(By.cssSelector("input.form-control[id='phone']")).sendKeys("hi this is rahul");
		Thread.sleep(2000);
		driver.close();
		*/
		

	}

}
