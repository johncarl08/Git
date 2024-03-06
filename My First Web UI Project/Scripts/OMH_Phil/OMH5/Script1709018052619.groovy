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

WebUI.click(findTestObject('Object Repository/Page_Buy, Sell, and Rent with the Top Real _8a0609/a_Buy a Home'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/div_Describe your dream home'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/div_Choose from curated properties'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/div_Schedule a property visit'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/div_Apply for home financing'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/div_Finalize your home purchase'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/a_Book an agent'))

WebUI.click(findTestObject('Object Repository/Page_Simple, Reliable, and Free Property Co_b41dc5/a_New Properties'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/div_Id like to rent a placeId like to buy a propertyId like to sell my homeId like to rent a place'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/img_skip-lazy_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Page_Affordable Houses and Lots for Sale 20_1a8e84/a_See all developers'))

