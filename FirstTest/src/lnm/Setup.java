package lnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Setup {
	
	public void Setup() throws InterruptedException {
		
	//	public static void main(String args[]) throws InterruptedException {
	String exePath = "E:\\Automation Soft\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	Actions act=new Actions(driver);
	driver.get("https://selfservice.m-pesaforbusiness.co.ke/LNM/");
	Thread.sleep(4000);
	}

}
