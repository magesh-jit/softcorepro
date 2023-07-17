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

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Computers/a_Desktops'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Desktops/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Desktops/a_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Electronics/a_Camera  photo'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Camera  photo/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Camera  photo/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Shopping Cart/input_1,030.00_termsofservice'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Shopping Cart/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Login/button_Checkout as Guest'))

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_First name_BillingNewAddress.FirstName'), 
    GlobalVariable.FirstName)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Last name_BillingNewAddress.LastName'), 
    GlobalVariable.LastName)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Email_BillingNewAddress.Email'), 
    GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Company_BillingNewAddress.Company'), 
    'Soft')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/select_Select countryUnited StatesAfghanist_6b3112'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/select_Select countryUnited StatesAfghanist_6b3112'), 
    '188', true)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_City_BillingNewAddress.City'), 
    'chennai')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Address 1_BillingNewAddress.Address1'), 
    'no8 samcorner street')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Zip  postal code_BillingNewAddress.Zi_77bd94'), 
    '65200')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
    '7744552233')

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/Continue_1'), 0)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/Continue_1'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/Continue_2'), 0)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/Continue_2'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/Continue_3'), 0)

WebUI.verifyElementClickable(findTestObject('Page_nopCommerce demo store. Checkout/Continue_3'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/Continue_3'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/Continue_4'), 0)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/Continue_4'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/Continue_5'), 0)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/Continue_5'))

WebUI.closeBrowser()

