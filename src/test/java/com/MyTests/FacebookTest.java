package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.factory.TLDriverFactory;

public class FacebookTest extends TestBase {
	

	@Test
	public void FB_tittleTest_1(){
		TLDriverFactory.getTLDriver().get("https://www.google.com/");

		String tittle = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(tittle);
		Assert.assertEquals(tittle, "Facebook – log in or sign up");
		
	}

		@Test
		public void FB_tittleTest_2(){
			TLDriverFactory.getTLDriver().get("https://www.google.com/");

			String tittle = TLDriverFactory.getTLDriver().getTitle();
			System.out.println(tittle);
			Assert.assertEquals(tittle, "Facebook – log in or sign up");

}
}