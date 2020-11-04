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

WebUI.click(findTestObject('Object Repository/All Sections/Page_American Software Contracts  Marketpla_f90b1c/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/All Sections/Page_American Software Contracts  Marketpla_f90b1c/input_Login_username'), 
    'mahendram15@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/All Sections/Page_American Software Contracts  Marketpla_f90b1c/input_Login_password'), 
    'XUwhRSdIKYJlFl7OB//OUg==')

WebUI.click(findTestObject('Object Repository/All Sections/Page_American Software Contracts  Marketpla_f90b1c/button_login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Click To View'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Click To View_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Upgrade Now'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_View More'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/i_Trail Freelancer_wt-btncancel fa fa-times'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Click To View_1_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Saved Service'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Followed Companies'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Liked Freelancers'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Ongoing Jobs'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Completed Jobs'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Cancelled Jobs'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Posted Jobs'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Ongoing Services'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/main_Pushapjit S            Post a Job     _6b199f'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Completed Services'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Message'))

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/a_Total Cancelled Services'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/All Sections/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Packages_Employer/Page_Checkout  American Software Contracts/span_Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Packages_Employer/Page_Dashboard  American Software Contracts/h3_Mahendra A'))

WebUI.click(findTestObject('Packages_Employer/Page_Dashboard  American Software Contracts/span_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

