package JavaPackageblackbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample1 {
	public static void main(String[] args) {
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neonp\\Desktop\\Java testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/Jyothish-0089/CSA3735-Software-Testing");
		// TODO Auto-generated method stub
	}
}
