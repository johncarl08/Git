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

WebUI.click(findTestObject('Object Repository/Page_Buy, Sell, and Rent with the Top Real _8a0609/a_Investors'))

WebUI.click(findTestObject('Object Repository/Page_Ohmyhome Investor Relations/i_eicon-close'))

WebUI.click(findTestObject('Object Repository/Page_Ohmyhome Investor Relations/svg'))

WebUI.click(findTestObject('Object Repository/Page_Buy, Sell, and Rent with the Top Real _8a0609/a_Buy a Home'))

WebUI.click(findTestObject('Object Repository/Page_Why You Should Choose Ohmyhome agents _75cf8d/a_Consult our agents'))

