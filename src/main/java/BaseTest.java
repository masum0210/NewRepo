import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver dr;
	
	public void openBrowser(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
		
	public HomePage goToUrl() {
		dr.get("https://www.eshopper24.com/");
		return new HomePage(dr);
	}
	}
		
		

}
