package com.mindtree.seleniumclass;

import java.sql.Driver;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.moneycontrol.com/");
      driver .manage() .window().maximize();
      driver .findElement(By.id("twotabsearchtextbox")).sendKeys("personal Finance");
      
	}

}
