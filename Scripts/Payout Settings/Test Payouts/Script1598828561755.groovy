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

WebUI.click(findTestObject('Object Repository/Settings/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Settings/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Settings/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Settings/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/span_Payouts Settings'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/img'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/img_1'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/button_Submit'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/a_Your Payouts'))

WebUI.delay(2)

WebUI.click(findTestObject('Settings/Page_Dashboard  American Software Contracts/a_Payouts Settings'))

WebUI.click(findTestObject('Settings/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

