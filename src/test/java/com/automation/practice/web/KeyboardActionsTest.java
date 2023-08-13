package com.automation.practice.web;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.miscellaneous.desktop.TextCompareBase;
import com.zebrunner.carina.core.IAbstractTest;

public class KeyboardActionsTest implements IAbstractTest {
	
	@Test
	public void testKeyboardAction() throws AWTException {
		TextCompareBase textCompare = initPage(getDriver(), TextCompareBase.class);
		textCompare.open();
	}

}
