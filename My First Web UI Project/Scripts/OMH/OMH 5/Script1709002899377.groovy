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

WebUI.navigateToUrl('https://ohmyhome.com/en-sg/')

WebUI.click(findTestObject('Object Repository/Page_One-Stop Platform for Property Transac_ed5822/img_attachment-medium_large size-medium_lar_18ec5c'))

WebUI.click(findTestObject('Object Repository/Page_When Is the Best Time to Sell Your HDB_eeb79f/svg'))

WebUI.click(findTestObject('Object Repository/Page_One-Stop Platform for Property Transac_ed5822/a_Home Services'))

WebUI.click(findTestObject('Object Repository/Page_Aircon, Cleaning, Handyman, Painting H_dfb995/a_img fetchpriorityhigh decodingasync width_7b5d41'))

WebUI.switchToWindowTitle('DreamR')

WebUI.click(findTestObject('Object Repository/Page_DreamR/a_Office'))

WebUI.takeScreenshotAsCheckpoint('')

