package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.OptionsManger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TLDriverFactory {
	
	public static ThreadLocal<WebDriver>tldriver=new ThreadLocal<WebDriver>();
	//when ever we are talking to threadlocal we have two methods
	//1:set the driver:used togenrate the driver
	//2:get the driver:used to get the same driver
	
	public synchronized static void setTLDriver(String browser){
		
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			//webdriver driver=new chromedriver(); insted of this you shoud write below
			//tldriver=ThreadLocal.withInitial(()->new ChromeDriver(OptionsManger.));
			tldriver = ThreadLocal.withInitial(()-> new ChromeDriver(OptionsManger.getchromeoptions()));
     //()->lamda expression in jdk1.8
		}
		if(browser.equals("firefox")){
		 WebDriverManager.firefoxdriver().setup();
			tldriver = ThreadLocal.withInitial(()-> new FirefoxDriver(OptionsManger.getfirefoxoptions()));

	 }
	}

	public synchronized static WebDriver getTLDriver(){
		return tldriver.get();
	}
}
