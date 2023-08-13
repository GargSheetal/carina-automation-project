package com.miscellaneous.desktop;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class TextCompareBase extends AbstractPage {

	public TextCompareBase(WebDriver driver) {
		super(driver);
	}

	public abstract void performCopyAction() throws AWTException;
}
