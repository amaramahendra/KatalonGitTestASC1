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

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Proposal for a job/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Proposal for a job/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Dashboard  American Software Contracts/a_Search Freelancers'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Search Freelancers  American Software _f8314d/a_Mahi A'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Mahi A  American Software Contracts/a_Send Offer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Proposal for a job/Page_Mahi A  American Software Contracts/select_Select a projectTestTestTest jobTest86'), 
    '1613', true)

WebUI.setText(findTestObject('Object Repository/Proposal for a job/Page_Mahi A  American Software Contracts/div_HiThis is Test job'), 
    'Hi,<div><br></div><div style="">This is Test job</div>')

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Mahi A  American Software Contracts/a_Send offer (1)'))

WebUI.delay(4)

WebUI.click(findTestObject('Proposal for a job/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Mahi A  American Software Contracts/span_Dashboard'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Proposal for a job/Page_Dashboard  American Software Contracts/a_Logout'))

WebUI.delay(4)

WebUI.closeBrowser()

