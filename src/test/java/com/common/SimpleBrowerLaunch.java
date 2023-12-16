package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleBrowerLaunch {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
