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

WebUI.click(findTestObject('Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/a_Reset Password'))

WebUI.click(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/a_Get Password'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/p_Please add email address'), 
    'Please add email address.')

WebUI.click(findTestObject('Page_American Software Contracts  Marketpla_f90b1c/i_LinkedIn_lnr lnr-cross'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/input_LinkedIn_email'), 
    'amaramahendra1989@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/a_Get Password'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/p_A link has been sent please check your email'), 
    'A link has been sent, please check your email.')

WebUI.click(findTestObject('Object Repository/Page_American Software Contracts  Marketpla_f90b1c/i_LinkedIn_lnr lnr-cross_1'))

WebUI.delay(4)

WebUI.closeBrowser()

