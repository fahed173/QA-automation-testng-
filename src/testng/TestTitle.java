package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TestTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver chrom\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String user = "standard_user";
		String pass = "secret_sauce" ; 
		String numofex = "6" ; 
	 
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		Thread.sleep(2000);
	
		List <WebElement> listadd = driver.findElements(By.className("btn"));
		for(int i = 0 ; i < listadd.size() ; i++) {
			listadd.get(i).click();
		}

		String numofac = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(numofex, numofac);

}
}