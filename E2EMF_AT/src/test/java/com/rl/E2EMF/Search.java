package com.rl.E2EMF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Search extends MainDriver {

	 public static void search(){
		 	driver.findElement(By.xpath("//form[@id='frm-header-search']/button")).click();
			driver.findElement(By.id("searchterm")).sendKeys("Sales orders Details");
			driver.findElement(By.id("search")).click();
			driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
	 }
}
