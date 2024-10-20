package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import java.util.*;
@SuppressWarnings("unused")
public class FindFollower {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Properties properties = new Properties();
		  Set<String> savedSet = new HashSet<>();
	        try (FileInputStream fis = new FileInputStream("KOLLink.properties")) {
	            properties.load(fis);
	            for (String key : properties.stringPropertyNames()) {
	                savedSet.add(properties.getProperty(key));
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        Iterator<String> iterator = savedSet.iterator();
	        if (iterator.hasNext()) {
	            String firstElement = iterator.next();
	            System.out.println("Phần tử đầu tiên: " + firstElement);
	            driver.get(firstElement);
	        } else {
	            System.out.println("HashSet rỗng");
	        }
	}

}
