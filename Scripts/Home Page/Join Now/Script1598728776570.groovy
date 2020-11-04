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

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/a_Join Now'))

WebUI.setText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Join For a Good Start_first_name'), 
    'Mahendra')

WebUI.setText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Join For a Good Start_last_name'), 
    'Amar')

WebUI.setText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Join For a Good Start_username'), 
    'Amaraaa')

WebUI.setText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Join For a Good Start_email'), 
    'mahendram15@gmail.com')

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/a_Start Now'))

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/div_Select Location            Select Locat_ec7491'))

WebUI.setText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Select Location_chosen-search-input'), 
    'India')

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/li_India'))

WebUI.setEncryptedText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_India_password'), 
    '6a+Fd4BYwCgpzGgKvLyRwQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_India_verify_password'), 
    '6a+Fd4BYwCgpzGgKvLyRwQ==')

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/label_Freelancer (Signup as freelancer  get hired)'))

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/label_Agree our terms and conditionsTerms  _93b612'))

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/a_Continue'))

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Weve sent a verification code to your_11fa97'))

WebUI.setText(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/input_Weve sent a verification code to your_11fa97'), 
    '2292')

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/a_Verify now'))

WebUI.click(findTestObject('Object Repository/Join Now_ASC/Page_American Software Contracts  Marketpla_f90b1c/a_Go to dashboard'))

WebUI.closeBrowser()

