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

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Projects/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Projects/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Projects/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Projects/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Projects/Page_Dashboard  American Software Contracts/a_Search Projects'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/input_AdvancedSearch_keyword'), 
    'Mahendra')

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/i_AdvancedSearch_fa fa-search'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/span_Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Projects/Page_Dashboard  American Software Contracts/a_Search Projects'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Job Type'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/label_Onsite'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Project Type'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/span_Hourly Based Project_ui-slider-handle _1337f6'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/span_Hourly Based Project_ui-slider-handle _1337f6'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Project TypeAllFixed projectHourly Base_975348'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Project TypeAllFixed projectHourly Base_975348'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Project Length'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/label_01 to 03 months'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Freelancer Type( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Experience'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Categories( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Skills( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_WordPress_mCSB_6_dragger_vertical'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Location( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/div_Languages( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/input_Click Apply Filter to apply latest ch_975b30'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/span_Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Projects/Page_Dashboard  American Software Contracts/a_Search Projects'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/a_View Job'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Projects/Page_Test job  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Search Projects  American Software Contracts/span_Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Projects/Page_Test job  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Projects/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(4)

WebUI.closeBrowser()

