package com.MyTests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.factory.TLDriverFactory;

public class GoogleTest extends TestBase{
	
	
	@Test
	public void Google_tittleTest_1(){
		TLDriverFactory.getTLDriver().get("https://www.google.com/");
		String tittle = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(tittle);
		Assert.assertEquals(tittle, "Google");
	}

	@Test
	public void Google_tittleTest_2(){
		TLDriverFactory.getTLDriver().get("https://www.google.com/");

		String tittle = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(tittle);
		Assert.assertEquals(tittle, "Google");
	}
	
	
	@Test
	public void Google_tittleTest_3(){
		TLDriverFactory.getTLDriver().get("https://www.facebok.com/");

		String tittle = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(tittle);
		Assert.assertEquals(tittle, "Google");
	}
	
	
	
	@Test
	public void Google_tittleTest_4(){
		TLDriverFactory.getTLDriver().get("https://www.facebook.com/");

		String tittle = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(tittle);
		Assert.assertEquals(tittle, "Google");
	}
}
