package JavaPackageblackbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
public class login{
	public static void main(String[] args) {
		
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neonp\\Desktop\\Java testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://github.com/login");
		WebElement username=driver.findElement(By.id("login_field"));		
		System.out.println(username);
		WebElement password=driver.findElement(By.id("password"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btn"));
		System.out.println(login);
		username.sendKeys("SomeRandomGmail.com");
		password.sendKeys("Not gonna leak my password");
		login.click();
	}
}
