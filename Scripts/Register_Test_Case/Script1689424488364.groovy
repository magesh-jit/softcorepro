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

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_nopCommerce demo store/a_Register'), 0)

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_Gender_Gender'))

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_First name_FirstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_Last name_LastName'), GlobalVariable.LastName)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Register/select_Day123456789101112131415161718192021_40ab5b'), 
    '26', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Register/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Register/select_Year19131914191519161917191819191920_eebbaf'), 
    '2000', true)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_Email_Email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_Company name_Company'), GlobalVariable.CompanyName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_Password_Password'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_nopCommerce demo store. Register/input_Confirm password_ConfirmPassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Register/button_Register'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

