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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('search employers/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/search employers/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/search employers/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/search employers/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/search employers/Page_Dashboard  American Software Contracts/a_Search Employers'))

WebUI.setText(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/input_AdvancedSearch_keyword'), 
    'virendra')

WebUI.click(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/i_AdvancedSearch_fa fa-search'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/span_Open Jobs'))

WebUI.delay(3)

WebUI.back()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/span_Full Profile'))

WebUI.delay(3)

WebUI.back()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/span_Follow'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/search employers/Page_Search Employers  American Software Contracts/span_Dashboard'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/search employers/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/search employers/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

