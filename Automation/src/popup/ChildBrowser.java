package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	public static void main(String []  args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		//driver.manage().window().maximize();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList <String>al = new ArrayList<String>(ids);
		
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(7000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='menu-text'])[12]")).click();
		
		Thread.sleep(3000);
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		//driver.quit();
		
		

}
}