package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.name("q"));
		srcBox.sendKeys("Selenium Tutorial");
		Thread.sleep(2000);
List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"shJ2Vb\"]/ul"));
System.out.print("Number items.." + items.size());

for(WebElement item:items) {
	System.out.println(item.getText());
	if(item.getText().equalsIgnoreCase("selenium tutorial pdf")) {
		item.click();
		break;
	}
}


	}

}
