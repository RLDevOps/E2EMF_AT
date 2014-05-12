package com.rl.E2EMF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScripts extends MainDriver {

	
	public static void openBrowser(){
	
	    		//driver = new HtmlUnitDriver();
	    		//System.setProperty("webdriver.firefox.bin","/usr/local/bin/firefox");
	    		driver = new FirefoxDriver();
	    		//String deployUrl=System.getProperty("url");
	    		String deployUrl="http://192.168.103.30:8080/E2EMF/";
	    		driver.manage().window().maximize();
	    		driver.get(deployUrl);
	        		
	}

	public static void closeBrowser(){
		driver.close();
	}

		
		public static void login(){

			
    		driver.findElement(By.id("username")).sendKeys("jjuser");
			driver.findElement(By.id("password")).sendKeys("jjuser");
			driver.findElement(By.xpath("//form[@id='login-form']/footer/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
		}
		
		@Test
		public void testLogin(){
			openBrowser();
			login();
			closeBrowser();
		}
		
	/*	@Test
		public void flowDiagrams(){
			openBrowser();
			login();
			FlowDiagrams.fd();
			closeBrowser();
		}
		
		@Test
		public void profiling(){
			openBrowser();
			login();
			Profiling.profiling();
			 closeBrowser();
		}
*/
		@Test
		public void search(){
			openBrowser();
			login();
			Search.search();
			 closeBrowser();
		}
		
		@Test
		public void CollapseMenu(){
			openBrowser();
			login();
			CollapseMenu.Menu();
			closeBrowser();
		}
		
		@Test
		public void testLogout(){
			openBrowser();
			login();
			TestLogout.tl();	
			closeBrowser();	
		}

}
