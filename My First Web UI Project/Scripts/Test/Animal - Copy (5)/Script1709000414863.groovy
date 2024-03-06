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

WebUI.navigateToUrl('https://www.wikipedia.org/')

WebUI.setText(findTestObject('Object Repository/Page_Wikipedia/input_search'), 'horse')

WebUI.click(findTestObject('Object Repository/Page_Wikipedia/em_Horse'))

WebUI.click(findTestObject('Object Repository/Page_Horse - Wikipedia/p_The horse (Equus caballus)23 is a domesti_6c46e9'))

WebUI.click(findTestObject('Object Repository/Page_Horse - Wikipedia/a_domesticated'))

WebUI.click(findTestObject('Object Repository/Page_Domestication - Wikipedia/a_mutualistic'))

WebUI.click(findTestObject('Object Repository/Page_Mutualism (biology) - Wikipedia/a_interaction'))

WebUI.takeScreenshotAsCheckpoint('')

WebUI.acceptAlert()

