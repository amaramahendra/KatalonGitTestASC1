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

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/IN -HE -SU/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/IN -HE -SU/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/span_Invoices'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/a_View'))

WebUI.delay(3)

WebUI.switchToWindowTitle('My account – American Software Contracts')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_My account  American Software Contracts/a_Return to dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/span_Help and Support'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/textarea_Ask your query_message'), 
    'test')

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/a_Submit'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('IN -HE -SU/Page_Dashboard  American Software Contracts/select_Select query typeQueryQuery Type'), 
    'Query Type', true)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/a_Submit'))

WebUI.delay(8)

WebUI.setText(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/textarea_Ask your query_message'), 
    'test45')

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/a_Submit'))

WebUI.delay(8)

WebUI.selectOptionByValue(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/select_Select query typeQueryQuery Type'), 
    'Query Type', true)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/a_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/IN -HE -SU/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

