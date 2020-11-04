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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.wp.americansoftwarecontracts.com/')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Accounts/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.click(findTestObject('Accounts/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Page_Checkout  American Software Contracts/span_Manage Jobs'))

WebUI.click(findTestObject('Page_Dashboard  American Software Contracts/a_Post a job'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_Job description_jobtitle'), 
    Job Title)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/span_Select project level'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Basic Level'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/span_Select job duration'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_01 to 03 months'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/div_Select freelancer typeAgency Freelancer_e62340'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Agency Freelancers'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/span_Select english level'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Basic'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/span_Project location type'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Onsite'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_Remote_chosen-search-input default'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Years of Experience Preferred'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_Solution Architect Experience_jobexpiry_date'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/div_11'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_Solution Architect Experience_jobdeadline'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/div_18'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Page_Dashboard  American Software Contracts/a_Fixed project'))

WebUI.click(findTestObject('Fixed project/Page_Dashboard  American Software Contracts/span_Fixed project'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Fixed project'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_Hourly Based Project_jobproject_cost'), 
    Minimum Price)

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_Hourly Based Project_jobmax_price'), 
    Maximum Price)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/div_BusinessDigital MarketingFun  Lifestyle_7714c3'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Business'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/ul_Languages_chosen-choices'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Afar'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/p'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/body_Test Project'), '<p style="">Test Project</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Android/Page_Dashboard  American Software Contracts/a_Android'))

WebUI.click(findTestObject('Android/Page_Dashboard  American Software Contracts/span_Android'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Android'))

WebUI.click(findTestObject('Page_Dashboard  American Software Contracts/a_Select Location'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/span_Select Location'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/li_Australia'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/input_United States_jobaddress'), 
    Address)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/button_OK'))

WebUI.click(findTestObject('save and update/Page_Dashboard  American Software Contracts/span_Update all the latest changes made by you by just clicking on Save  Update button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Dashboard  American Software Contracts/a_Save  Update'))

WebUI.delay(3)

WebUI.closeBrowser()

WebUI.navigateToUrl('https://www.wp.americansoftwarecontracts.com/')

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Duplicate test/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Duplicate test/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/a_Post a job'))

WebUI.setText(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_Job description_jobtitle'), 
    'Test job')

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Select project level'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Basic Level'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Select job duration'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_01 to 03 months'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/ul_More than 06 months_chosen-choices'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Agency Freelancers'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Select english level'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Basic'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Basic'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Basic'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Project location type'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Onsite'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_Remote_chosen-search-input default'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Years of Experience Preferred'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_Solution Architect Experience_jobexpiry_date'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/div_11'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_Solution Architect Experience_jobdeadline'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/div_17'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Fixed project'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Fixed project'))

WebUI.setText(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_Hourly Based Project_jobproject_cost'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_Hourly Based Project_jobmax_price'), 
    '40')

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/ul_Job Categories_chosen-choices'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Business'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/ul_Languages_chosen-choices'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Afar'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/p'))

WebUI.setText(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/body_Test Project 1'), 
    '<p style="">Test Project 1</p><div id="katalon" style="top: 319px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Android'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Android'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/span_Select Location'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/li_Australia'))

WebUI.setText(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/input_United States_jobaddress'), 
    'united kingdom')

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/button_OK'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/button_OK'))

WebUI.click(findTestObject('Object Repository/Duplicate test/Page_Dashboard  American Software Contracts/a_Save  Update'))

WebUI.closeBrowser()

