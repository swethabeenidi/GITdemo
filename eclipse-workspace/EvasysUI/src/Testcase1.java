import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	//@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/#/index");

		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Practice Projects")).click();

		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("swethabeenidi");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swethagiri9097@gmail.com");

		driver.findElement(By.xpath("//button[@id='form-submit']")).click();

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Automation Practise - 2']")).click();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		
				
	}

}
