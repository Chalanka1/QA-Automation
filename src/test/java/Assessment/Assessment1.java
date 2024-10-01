package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assessment1 {
	
WebDriver driver;
	
	@Test(priority = 1)
	public void q1(){
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
	}
	@Test(priority = 2)
    public void closeMessageIfAppears() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Dismiss sign-in info.']")));
            closeButton.click();
        } 
        catch (Exception e) {
        }
    }
	
	@Test(priority = 3)
	public void q2() {
		driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']")).click();
		driver.findElement(By.xpath("//div[@data-testid='All languages']//ul[1]/li[2]")).click();
	}
	@Test(priority = 4)
	public void q3() {
		driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']")).click();
		driver.findElement(By.xpath("//div[@data-testid='All currencies']//ul[1]/li[4]")).click();
	}
	@Test(priority = 5)
	public void q4() {
		driver.findElement(By.cssSelector("#accommodations")).click();
	}
	@Test(priority = 6)
	public void q5() {
		driver.findElement(By.xpath("//input[@name='ss']")).sendKeys("Kandy");
	}
	@Test(priority = 7)
	public void q6() {
		driver.findElement(By.xpath("//div[@tabindex='-1' and @class='a1139161bf']")).click();
		driver.findElement(By.cssSelector(".d4babb55ef div:nth-child(2) table tbody tr:nth-child(1)  td:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".d4babb55ef div:nth-child(2) table tbody tr:nth-child(1)  td:nth-child(3)")).click();
		driver.findElement(By.xpath("//button[@data-testid=\"occupancy-config\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"aaf77d2184\"]/div[1]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//button[@class=\"a83ed08757 c21c56c305 bf0537ecb5 ab98298258 a2abacf76b af7297d90d c213355c26 b9fd3c6b3c\"]")).click();
	}
	@Test(priority = 8)
	public void q7() {
		driver.findElement(By.xpath("//button[@class=\"a83ed08757 c21c56c305 a4c1805887 f671049264 a2abacf76b c082d89982 cceeb8986b b9fd3c6b3c\"]")).click();
	}
	

}
