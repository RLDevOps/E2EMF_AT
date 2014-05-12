package com.rl.E2EMF;

import org.openqa.selenium.By;

public class TestLogout extends MainDriver {

	public static void tl(){
		driver.findElement(By.xpath("//div[@id='logout']/span/a/i")).click();
		driver.findElement(By.xpath("//div[@id='Msg1']/div/div/button[2]")).click();
	}
}
