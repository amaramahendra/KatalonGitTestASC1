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

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Send offer/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'amaramahendra1989@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Send offer/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Send offer/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Dashboard  American Software Contracts/a_Search Employers'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Search Employers  American Software Contracts/a_Mahendra A'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Mahendra A  American Software Contracts/a_View Job_1'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Test  American Software Contracts/a_Send Proposal'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Send offer/Page_Submit Proposal  American Software Contracts/input__proposed_amount'), 
    '15')

WebUI.selectOptionByValue(findTestObject('Object Repository/Send offer/Page_Submit Proposal  American Software Contracts/select_Select time period01 to 03 months03 _f937bf'), 
    'weekly', true)

WebUI.setText(findTestObject('Object Repository/Send offer/Page_Submit Proposal  American Software Contracts/textarea_American Software Contracts_propos_f915c9'), 
    'Temporary work')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Submit Proposal  American Software Contracts/a_Send Now'))

WebUI.delay(4)

WebUI.click(findTestObject('Send offer/Page_Dashboard  American Software Contracts/h3_Test T'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Test  American Software Contracts/span_Dashboard'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Send offer/Page_Dashboard  American Software Contracts/h3_Test T'))

WebUI.click(findTestObject('Object Repository/Send offer/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(4)

WebUI.closeBrowser()

