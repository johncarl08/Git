import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.acceptAlert()

WebUI.navigateToUrl('https://ohmyhome.com/en-sg/')

WebUI.click(findTestObject('Object Repository/Page_One-Stop Platform for Property Transac_ed5822/a_Calculate Home Value'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/div_Play Video'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/button_ytp-play-button ytp-button'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/div_What is Homer AI'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/div_Why should I trust Homer AIs e-Valuation'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/div_What are the property types Homer AI supports'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/div_How Homer AI helps me to manage my property'))

WebUI.click(findTestObject('Object Repository/Page_Homer AI - Discover Your Home Valuatio_b4daff/div_Whats coming next in Homer AI'))

WebUI.takeScreenshotAsCheckpoint('')

