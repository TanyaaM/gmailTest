package gmailPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Byimport org.openqa.selenium.chrome.ChromeDriver;


public class Mail {

	@Keyword
	def returnDriverInstance() {
		WebDriver driver = DriverFactory.getWebDriver()
		return driver
	}

	@Keyword
	def openGmail() {
		if(GlobalVariable.platform=='web') {
			WebUI.openBrowser('https://gmail.com/')
			WebUI.maximizeWindow()
		} else {

		}
	}
}

	/*
	 * //WebDriver driver = DriverFactory.getWebDriver()
	 //	driver=new ChromeDriver()
	 WebUI.openBrowser('https://gmail.com/')
	 //	driver.get('https://gmail.com/')
	 */