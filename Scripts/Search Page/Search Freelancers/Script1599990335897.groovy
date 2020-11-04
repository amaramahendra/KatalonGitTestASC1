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

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Search Freelancers/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Search Freelancers/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Dashboard  American Software Contracts/a_Search Freelancers'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/label_Sort By A-Z'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/label_Sort By Z-A'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/label_Sort By Rating DESC'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/label_Sort By Rating ASC'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/span_Clear Sorting'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/input_AdvancedSearch_keyword'))

WebUI.setText(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/input_AdvancedSearch_keyword'), 
    'Igor')

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/i_AdvancedSearch_fa fa-search'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/input_AdvancedSearch_keyword'))

WebUI.setText(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/input_AdvancedSearch_keyword'), 
    '')

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/i_AdvancedSearch_fa fa-search'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Hourly Rate                           5_c012a1'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Freelancer type( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Hourly Rate'))

not_run: WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/label_5 - 10'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Industrial experiences( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Specialization( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Skills( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_English Level( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Location( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/div_Languages( 0 selected )'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/input_Click Apply Filter to apply latest ch_975b30'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Search Freelancers  American Software _f8314d/span_Dashboard'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Object Repository/Search Freelancers/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(4)

WebUI.closeBrowser()

