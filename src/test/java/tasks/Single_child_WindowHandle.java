package tasks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_child_WindowHandle {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
	Thread.sleep(2000);
	driver.findElement(By.id("newWindowBtn")).click();
	String wid = driver.getWindowHandle();
	System.out.println(wid);
	Set<String> allid = driver.getWindowHandles();
	System.out.println(allid);
	for(String ids:allid)
	{
		if(wid.equals(ids))
		{
		System.out.println("Nothig");	
		}else {
			driver.switchTo().window(wid).close();
		}
	}
	//driver.quit();
}
}
