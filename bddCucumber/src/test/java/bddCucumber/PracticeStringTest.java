package bddCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeStringTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
                "/Users/subhan/Downloads/geckodriver2");

      
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.target.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        
        driver.findElement(By.xpath("//*[@id=\"divLogedOutScreen\"]/div/div[1]/div[1]/div/div[2]/div")).click();

        System.out.println("Hi Worked **********************");
	}

}
