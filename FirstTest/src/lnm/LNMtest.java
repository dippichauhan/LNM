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

public class LNMtest {
	
	public static void main(String args[]) throws InterruptedException {
		String exePath = "E:\\Automation Soft\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://selfservice.m-pesaforbusiness.co.ke/LNM/");
		Thread.sleep(4000);
			
		driver.findElement(By.className("v-select__selections")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Buygoods']")).click();
	driver.findElement(By.xpath("//*[@id='app']/div[15]/main/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[6]/button/div")).click();;
	Thread.sleep(2000);
	//Form Fill  : names 
 	driver.findElement(By.xpath("//*[@name='business_name']")).sendKeys("Safari");
 	driver.findElement(By.xpath("//*[@name='trading_name']")).sendKeys("Safari");
 
 	driver.findElement(By.xpath("//div[@class='v-select__selections']")).click();
 	Thread.sleep(2000);
 	WebElement MM =driver.findElement(By.xpath("//div[@class='v-select__selections']"));
 	WebElement subMenu=driver.findElement(By.xpath("//*[text()='Contracted services']"));
  	act.moveToElement(MM).click(subMenu).build().perform();
 	
 	Thread.sleep(2000);//Product description
 	driver.findElement(By.xpath("//*[@aria-label='Business Description *']")).sendKeys("Electrical contractors ");;
 	Thread.sleep(2000); 
 	WebElement M2 =driver.findElement(By.xpath("//*[@class='v-list__tile__title']"));
	WebElement subMenu2=driver.findElement(By.xpath("//*[text()='Electrical contractors ']"));
 	act.moveToElement(M2).click(subMenu2).build().perform();
 	
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("//*[@aria-label='Business Postal Address (Optional)']")).sendKeys("Business Postal Address (Optional)");
 	driver.findElement(By.xpath("//*[@aria-label='Business Postal Code (Optional)']")).sendKeys("10008");
 	driver.findElement(By.xpath("//*[@aria-label='Business Physical Address *']")).sendKeys("Westland");
 	driver.findElement(By.xpath("//*[@aria-label='City / Town *']")).sendKeys("Nairobi");
 	driver.findElement(By.xpath("//*[@aria-label='Business Email Address *']")).sendKeys("Masoko@safaricom.com");
 	driver.findElement(By.xpath("//*[@aria-label='Business Phone Number *']")).sendKeys("0742367765");
 	driver.findElement(By.xpath("//*[@aria-label='Individual KRA PIN *']")).sendKeys("120012");
 	driver.findElement(By.xpath("//*[@aria-label='Certificate of registration / Business permit no. *']")).sendKeys("332323");
 	driver.findElement(By.xpath("//*[@aria-label='First Name *']")).sendKeys("Masoko");
 	driver.findElement(By.xpath("//*[@aria-label='Middle Name (Optional)']")).sendKeys("MAS");
 	driver.findElement(By.xpath("//*[@aria-label='Last Name *']")).sendKeys("MAS");
 	driver.findElement(By.xpath("//*[@aria-label='Email Address *']")).sendKeys("MAS@MAS.com");
 	driver.findElement(By.xpath("//*[@aria-label='Phone *']")).sendKeys("0742344356");

 	WebElement M3 =driver.findElement(By.xpath("//*[@aria-label='Document type *']"));
	act.moveToElement(M3).click().build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/div/div/div[1]/a/div/div")).click();
	driver.findElement(By.xpath("//*[@aria-label='Document number *']")).sendKeys("Z3135672");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[2]/div[7]/div/div[1]/label")).click();
	//							 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[2]/div[16]/div/div[1]/label")).click();
	//*[@id=\"app"\]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[2]/div[7]/div/div[1]/label  	
	 List<WebElement> FirstName = driver.findElements(By.xpath("//*[@aria-label='First Name *']"));
	List<WebElement> LastName = driver.findElements(By.xpath("//*[@aria-label='Last Name *']"));
	List<WebElement> EmailAddress = driver.findElements(By.xpath("//*[@aria-label='Email Address *']"));
	List<WebElement> PhoneNumber = driver.findElements(By.xpath("//*[@aria-label='Phone *']"));
	List<WebElement> IdNumber= driver.findElements(By.xpath("//*[text()='ID Number']"));
	List<WebElement> DocumentNumber= driver.findElements(By.xpath("//*[@aria-label='Document number *']"));
	
	List<WebElement> Register= driver.findElements(By.xpath("//*[@class='v-btn__content']"));
		
	FirstName.get(2).sendKeys("asdsada");
	LastName.get(2).sendKeys("asdsad");
	EmailAddress.get(2).sendKeys("masoko@gmail.com");
	PhoneNumber.get(2).sendKeys("0742367798");

	WebElement M5 =driver.findElement(By.xpath("//*[@id=\"app\"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[2]/div[14]/div[1]/div/div[2]/div[1]/div[1]/div[1]/input"));
	act.moveToElement(M5).click().build().perform();
	Thread.sleep(2000);
	IdNumber.get(3).click();
	DocumentNumber.get(2).sendKeys("Z3135672");
	
	driver.findElement(By.xpath("//*[@aria-label='Source of funds *']")).sendKeys("Nairobi");
	driver.findElement(By.xpath("//*[@aria-label='Purpose of funds *']")).sendKeys("Nairobi");
	WebElement M4 =driver.findElement(By.xpath("//*[@aria-label='Expected Turnover per year *']"));
	act.moveToElement(M4).click().build().perform();
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/a/div/div")).click();
	
driver.findElement(By.xpath("//*[@id=\"app\"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[3]/div[3]/div[1]/div/div/div[1]/div/div")).click();
driver.findElement(By.xpath("//*[@aria-label='Name as Registered on M-PESA *']")).sendKeys("Nairobi");;
driver.findElement(By.xpath("//*[@aria-label='M-PESA Registered Phone *']")).sendKeys("74237332");;
driver.findElement(By.xpath("//*[@aria-label='ID Number *']")).sendKeys("233214");;
 	
 	driver.findElement(By.xpath("//*[@id=\"app\"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[4]/div[8]/div[4]/div[1]/div/div/div[1]/div/div")).click();
 	driver.findElement(By.xpath("//*[@id=\"app\"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[5]/div[2]/div/button/div")).click();
 	
	//*[@id="app"]/div[14]/main/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/form/div[2]/div[16]/div/div[1]/label
	
	
	
	
/*	List<WebElement> CopyPaste = driver.findElements(By.xpath("//*[text()='Make same as owner information (Ensure name is as is on document)']"));
	CopyPaste.get(1).click();
	CopyPaste.get(2).click();
		*/
	//driver.findElement(By.xpath("\\*[text() = 'REGISTER]")).click();
				
	
	/*
	List<WebElement> FirstName = driver.findElements(By.xpath("//*[@aria-label='First Name *']"));
	List<WebElement> LastName = driver.findElements(By.xpath("//*[@aria-label='Last Name *']"));
	List<WebElement> EmailAddress = driver.findElements(By.xpath("//*[@aria-label='Email Address *']"));
	List<WebElement> PhoneNumber = driver.findElements(By.xpath("//*[@aria-label='Phone *']"));
	List<WebElement> DocumentNumber= driver.findElements(By.xpath("//*[@aria-label='Document number *']"));
	List<WebElement> DocumentType= driver.findElements(By.xpath("//*[text()='ID Number']"));
 	
	Thread.sleep(3000);
	FirstName.get(2).sendKeys("asdsada");
	LastName.get(2).sendKeys("asdsad");
	EmailAddress.get(2).sendKeys("masoko@gmail.com");
	PhoneNumber.get(2).sendKeys("0742367798");
	WebElement DocType =driver.findElement(By.xpath("//*[@aria-label='Document type *']"));
	act.moveToElement(DocType).click().build().perform();
	Thread.sleep(3000);
	DocumentType.get(2).click();
	Thread.sleep(3000);
	DocumentNumber.get(2).sendKeys("Z3135672");
	*/
	
	 }
	
}
