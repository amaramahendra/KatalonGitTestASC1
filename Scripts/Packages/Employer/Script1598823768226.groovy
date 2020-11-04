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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.wp.americansoftwarecontracts.com/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Employer/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Employer/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Employer/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Employer/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/span_Packages'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/span_Buy Now'))

WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/a_Yes'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input__billing_address_1'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input_(optional)_billing_address_2'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input__billing_city'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input__billing_postcode'), 
    'W1A 1AA')

WebUI.setText(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input__billing_phone'), 
    '12345678')

WebUI.setText(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input__billing_email'), 
    'mahendram15@gmail.com')

WebUI.delay(6)

WebUI.verifyElementClickable(findTestObject('Employer/Page_Checkout  American Software Contracts/input_wwwamericansoftwarecontractscom  wwwa_cf5a95'))

not_run: WebUI.delay(5)

WebUI.check(findTestObject('New CheckBox/Page_Checkout  American Software Contracts/input_wwwamericansoftwarecontractscom  wwwamericanerpcontractscom_terms'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/button_Place order'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/a_Return to dashboard'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/a_Packages'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/a_Buy Now'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/a_Yes'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input_wwwamericansoftwarecontractscom  wwwa_cf5a95'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/button_Proceed to PayPal'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/h3_Mahendra A'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/a_Packages'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/a_Buy Now'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/a_Yes'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/input_wwwamericansoftwarecontractscom  wwwa_cf5a95'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/button_Proceed to PayPal'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/h3_Mahendra A'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Checkout  American Software Contracts/a_Packages'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

not_run: WebUI.click(findTestObject('Object Repository/Employer/Page_Dashboard  American Software Contracts/span_Logout'))

not_run: WebUI.delay(4)

not_run: WebUI.closeBrowser()

