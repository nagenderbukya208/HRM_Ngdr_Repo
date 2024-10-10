package tasks;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.google.protobuf.Duration;

public class PopUp_samp1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	driver.switchTo().alert().sendKeys("Hello World");
	String text = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	System.out.println(text);
	Thread.sleep(5000);
	driver.quit();	
}
}
