package com.rl.E2EMF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class FlowDiagrams extends MainDriver {
	
	public static void fd(){
		driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li/a/i")).click();
		driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/*	driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[1]/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	*/ }
	
}
