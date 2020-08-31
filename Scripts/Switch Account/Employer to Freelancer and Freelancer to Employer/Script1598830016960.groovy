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

WebUI.click(findTestObject('Object Repository/Accounts/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Accounts/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Accounts/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Accounts/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/span_Switch Account'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/span_Select Location'))

WebUI.setText(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/input_Select Location_chosen-search-input'), 
    'India')

WebUI.click(findTestObject('Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/li_India'))

WebUI.setEncryptedText(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/input_India_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/input_India_verify_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.check(findTestObject('Accounts/Page_Dashboard  American Software Contracts/div_Freelancer (Signup as freelancer  get hired)'))

not_run: WebUI.click(findTestObject('Accounts/Page_Dashboard  American Software Contracts/label_Agree our terms and conditionsTerms  _93b612'), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'testPackage.clickUsingJS.refreshBrowser'(findTestObject('Accounts/Page_Dashboard  American Software Contracts/label_Agree our terms and conditionsTerms  _93b612'), 
    30)

CustomKeywords.'testPackage.clickUsingJS.clickElement'(findTestObject('Accounts/Page_Dashboard  American Software Contracts/label_Agree our terms and conditionsTerms  _93b612'), 
    30)

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/a_Continue'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/span_Switch Account'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/span_Select Location'))

WebUI.setText(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/input_Select Location_chosen-search-input'), 
    'India')

WebUI.click(findTestObject('Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/li_India'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/label_2 - 9 Employees'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/label_Engineering Or Product Management'))

WebUI.check(findTestObject('Accounts/Page_Dashboard  American Software Contracts/label_Agree our terms and conditionsTerms  Conditions'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/a_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/input_India_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/input_India_verify_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/a_Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Accounts/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.closeBrowser()

