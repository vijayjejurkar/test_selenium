package com.app.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sense.blazemeter.com/gui/");
		driver.findElement(By.xpath(".//*[@id='sr_signin_google_button_text']")).click();
		//driver.wait(5000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("vijayjejurkar974@gmail.com");
		System.out.println("Executed Till Gmail Page opens");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		driver.wait(5000);
		driver.close();
		
	}

}
