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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://url')

WebUI.setText(findTestObject('Object Repository/Page_Login  Acviss/input_Username_username'), 'acvissadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Acviss/input_Password_password'), 'zrSyU2fyX5SHSO0lDO9yJw==')

WebUI.click(findTestObject('Object Repository/Page_Login  Acviss/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Acviss/span_Home'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  Acviss/input_concat(id(, , select2-selectCustomer-_6470a2'), 
    'BASF')

WebUI.sendKeys(findTestObject('Object Repository/Page_Dashboard  Acviss/input_concat(id(, , select2-selectCustomer-_6470a2'), 
    Keys.chord(Keys.ENTER))

for (def row = 1; row <= 20; row++) {
    WebUI.click(findTestObject('Object Repository/Page_Dashboard  Acviss/a_storage Product Management'))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/span_Product Details_mdc-tab__ripple mdc-ri_d91f00'))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_add'))

    WebUI.click(findTestObject('Object Repository/Page_Bulk Product Upload  Acviss/button_Add single product'))

    'Option value helps to find category type from drop down, now its 6 and for crop protection its 4\r\n'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Product Management  Acviss/select_Select Parent CategoryCrop Protection'), 
        '6', false)

    WebUI.click(findTestObject('Page_Product Management  Acviss/span_Select Child category'))

    'Add child category\r\n'
    WebUI.setText(findTestObject('Page_Product Management  Acviss/Page_1649153999524/child category'), 'agriculture')

    WebUI.sendKeys(findTestObject('Page_Product Management  Acviss/Page_1649153999524/child category'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/Page_Product Management  Acviss/input__name'), Product.getValue(1, row))

    WebUI.click(findTestObject('Page_Product Management  Acviss/label_No'))

    //WebUI.uploadFile(findTestObject('Image field/Image field'), Image.getValue(5, 1))
    //C:\Users\AcvissDev_18H2\Desktop\Crop protection images\Assert.jpg
    String Link = Image.getValue(5, row)

    WebUI.uploadFile(findTestObject('Image field/Image field'), Link)

    WebUI.setText(findTestObject('Object Repository/Page_Product Management  Acviss/textarea_Product description_description'), 
        Description.getValue(2, row))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('Page_Product Management  Acviss/Key1'), 'SKU')

    WebUI.setText(findTestObject('Page_Product Management  Acviss/value1'), SKU.getValue(3, row))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('specification/Page_1649148806510/Key2'), 'package size')

    WebUI.setText(findTestObject('specification/Page_1649148806510/value2'), packsize.getValue(4, row))

    WebUI.click(findTestObject('Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('specification/Page_1649148806510/Key3'), 'reg')

    WebUI.setText(findTestObject('specification/Page_1649148806510/value3'), regno.getValue(6, row))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('specification/Page_1649148806510/Key4'), 'Manufactured')

    WebUI.setText(findTestObject('specification/Page_1649148806510/value4'), manfactured.getValue(7, row))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('specification/Page_1649148806510/Key5'), 'Marketed By')

    WebUI.setText(findTestObject('specification/Page_1649148806510/Value5'), marketd.getValue(8, row))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('specification/Page_1649148806510/Page_1649150285814/Key6'), 'Customer Care no')

    WebUI.setText(findTestObject('specification/Page_1649148806510/Page_1649150285814/value6'), customer.getValue(9, row))

    WebUI.click(findTestObject('Object Repository/Page_Product Management  Acviss/button_Add Specification'))

    WebUI.setText(findTestObject('specification/Page_1649148806510/Page_1649150285814/Key7'), 'Customer Email ID')

    WebUI.setText(findTestObject('specification/Page_1649148806510/Page_1649150285814/Value7'), customermail.getValue(10, 
            row))

    WebUI.click(findTestObject('specification/Page_1649148806510/Page_1649150285814/Page_1649152172679/Add button'))
}

