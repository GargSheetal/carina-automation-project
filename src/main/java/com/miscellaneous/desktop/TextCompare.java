package com.miscellaneous.desktop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = TextCompareBase.class)
public class TextCompare extends TextCompareBase{
	
	@FindBy(id = "inputText1")
	private ExtendedWebElement textArea1;
	
	@FindBy(id = "inputText2")
	private ExtendedWebElement textArea2;
	
	public TextCompare(WebDriver driver) {
		super(driver);
	}

	public void sendText(String text) {
		textArea1.type(text);
	}
	
	public void performCopyAction() throws AWTException {
		Robot robot = new Robot();
		textArea1.sendKeys(Keys.DOWN);
		textArea1.sendKeys(Keys.CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		textArea1.sendKeys(Keys.UP);
		textArea1.sendKeys(Keys.DOWN);
		textArea1.sendKeys(Keys.CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		textArea1.sendKeys(Keys.UP);
		textArea1.sendKeys(Keys.TAB);
		
	}
	
	public void performPasteAction() throws AWTException {
		Robot robot = new Robot();
		textArea2.sendKeys(Keys.DOWN);
		textArea2.sendKeys(Keys.CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		textArea1.sendKeys(Keys.UP);
	}
}
