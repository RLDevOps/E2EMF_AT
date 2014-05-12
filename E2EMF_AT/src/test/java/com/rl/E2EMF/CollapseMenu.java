package com.rl.E2EMF;

import org.openqa.selenium.By;

public class CollapseMenu extends MainDriver {

	public static void Menu(){
			driver.findElement(By.xpath("//div[@id='hide-menu']/span/a/i")).click();
		
	}

}
