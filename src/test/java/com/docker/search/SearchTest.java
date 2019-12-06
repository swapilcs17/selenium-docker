package com.docker.search;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.docker.pages.SearchPage;
import test.BaseTest;

public class SearchTest extends BaseTest {	

	@Test
	public void registrationTest() {
		SearchPage searchPage = new SearchPage(driver);
		searchPage.goTo();
		
	}

}
