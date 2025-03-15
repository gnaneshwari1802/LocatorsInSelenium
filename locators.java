package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.manage().window().maximize();
	 /*id
	 driver.findElement(By.id("name")).sendKeys("rahul");
	 driver.findElement(By.id("email")).sendKeys("rahul@gmail.com");
	 driver.findElement(By.id("phone")).sendKeys("8897585555");
	 driver.findElement(By.id("textarea")).sendKeys("rahul nizamabad"); */
	 /*linked text
	 driver.findElement(By.linkText("merrymoonmary")).click();
	 driver.findElement(By.linkText("Blogger")).click();*/
	 /*partial linked text
	 driver.findElement(By.partialLinkText("B")).click();
	 driver.findElement(By.partialLinkText("Bl")).click();
	 driver.findElement(By.partialLinkText("Blo")).click();
	 driver.findElement(By.partialLinkText("Blog")).click();
	 driver.findElement(By.partialLinkText("Blogg")).click();
	 driver.findElement(By.partialLinkText("Blogge")).click();
	 driver.findElement(By.partialLinkText("Blogger")).click(); */
	 //classname: which is used to find the multiple elements
	 /*
	 List<WebElement> formgrp= driver.findElements(By.className("form-group"));
	 System.out.println("total form groups:"+formgrp.size());*/
	 //tagname:which is used to find the multiple elements
	 /*
	 List<WebElement>links=driver.findElements(By.tagName("a"));
	 System.out.println("total no of links:"+links.size()); */
	 
	 //imaage sources: which is used to find the images on the website 
	 /*
	 List<WebElement>imgsrs=driver.findElements(By.tagName("img"));
	 System.out.println("total no of iamges:"+imgsrs.size()); 
	 driver.close(); */
}
}


package day22; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
public class Locators Demo { 
public static void main(String[] args) { 
WebDriver driver=new ChromeDriver(); 
driver.get("https://demo.opencart.com/"); 
driver.manage().window().maximize(); 
//name 
//driver.findElement(By.name("search")).sendKeys("Mac"); 
//id 
//boolean logoDisplaystatus=driver.findElement(By.id("logo")).is Displayed(); 
//System.out.println(logoDisplaystatus); 
//linktext & partialLinkText 
//driver.findElement(By.linkText("Tablets")).click(); 
//driver.findElement(By.partialLinkText("Table")).click(); 
//name 
//driver.findElement(By.name("search")).sendKeys("Mac"); 
//id 
//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed(); 
//System.out.println(logoDisplaystatus); 
//linktext & partialLinkText 
//driver.findElement(By.linkText("Tablets")).click(); 
//driver.findElement(By.partialLinkText("Table")).click(); 
//classname 
//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item")); 
//System.out.println("total number of header links: "+headerLinks.size()); 
//tagname 
//List<WebElement> links=driver.findElements (By.tagName("a")); 
//System.out.println("total nmber of links: "+links.size()); 
List<WebElement> images=driver.findElements (By.tagName("img")); 
System.out.println("total number of images: "+ images.size());
}
}
	
