package com.qa.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManger {
	
	public static ChromeOptions getchromeoptions(){
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start maximized--");
		//opt.addArguments("--headless--");

		opt.addArguments("--ignore certifivate errors--");
		opt.addArguments("--disable popupblocking--");
		opt.addArguments("--incognito--");
		
		return opt;


		
	}
	//get firefox options
public static FirefoxOptions getfirefoxoptions(){
		
		FirefoxOptions fio=new FirefoxOptions();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
	    profile.setAssumeUntrustedCertificateIssuer(false);
	    fio.setCapability(FirefoxDriver.PROFILE, profile);
	    
	    return fio;
		


		
	}

}
