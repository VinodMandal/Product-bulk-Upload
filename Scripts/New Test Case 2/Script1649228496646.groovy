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

WebUI.navigateToUrl('https://test.acviss.co/dashboard/login/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Acviss/input_Username_username'), 'acvissadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Acviss/input_Password_password'), 'zrSyU2fyX5QABPE4FtQkfw==')

WebUI.click(findTestObject('Object Repository/Page_Login  Acviss/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Acviss/span_Home'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  Acviss/input_concat(id(, , select2-selectCustomer-_6470a2'), 
    'crop protection')

WebUI.sendKeys(findTestObject('Object Repository/Page_Dashboard  Acviss/input_concat(id(, , select2-selectCustomer-_6470a2'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Acviss/a_storage Product Management'))

WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/span_Product Details_mdc-tab__ripple mdc-ri_d91f00'))

WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_add'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Product Upload  Acviss/button_Add single product'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product Management  Acviss/select_Select Parent CategoryCrop Protection'), 
    '5', true)

WebUI.click(findTestObject('Page_Product Management  Acviss/span_Select Child category'))

