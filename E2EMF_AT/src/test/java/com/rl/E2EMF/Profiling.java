package com.rl.E2EMF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Profiling extends MainDriver {

	public static void profiling(){
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
}
