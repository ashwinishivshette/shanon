package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkart {
public static void main(String[] args) {
ChromeOptions options=new	ChromeOptions();
options.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Ashwini Shivshette\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32 (3)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 20000");
driver.findElement(By.xpath("//div[@class='_2kHMtA']/descendant::div[text()='₹15,999']")).click();
}
}
