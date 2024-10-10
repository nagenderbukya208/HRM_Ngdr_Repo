package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Enume {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));
	reg.click();
	WebElement ele = driver.findElement(By.xpath("//h1[text()='Register']"));
	boolean displayed = ele.isDisplayed();
	System.out.println(displayed);
//	if(ele.isDisplayed())
//		System.out.println("Registration is done => True");
//	else
//		System.out.println("Not done => False");
	driver.quit();
}
}
