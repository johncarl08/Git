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

WebUI.navigateToUrl('https://ohmyhome.com/en-ph/')

WebUI.click(findTestObject('Object Repository/Page_Buy, Sell, and Rent with the Top Real _8a0609/a_Company'))

WebUI.click(findTestObject('Object Repository/Page_Ohmyhome  About Us  Leading Real Estat_b96e5b/a_Contact'))

WebUI.click(findTestObject('Object Repository/Page_Simple, Reliable, and Free Property Co_b41dc5/a_Careers'))

WebUI.click(findTestObject('Object Repository/Page_Careers Philippines  Ohmyhome/span_Explore roles'))

WebUI.switchToWindowTitle('Ohmyhome Pte Ltd - Career page')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ohmyhome Pte Ltd - Career page/select_All Countries                       _716932'), 
    'aa21bf4a85b2c50488e98b0c', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ohmyhome Pte Ltd - Career page/select_All Departments                     _de9b54'), 
    'Technology', true)

