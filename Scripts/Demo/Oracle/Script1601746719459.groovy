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

WebUI.navigateToUrl('https://adc2-zpix-fa-ext.oracledemos.com')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Oracle Objects/Page_Sign In/input_User ID_userid'))

WebUI.setText(findTestObject('Object Repository/Oracle Objects/Page_Sign In/input_User ID_userid'), 'Susan.Atkins')

WebUI.setEncryptedText(findTestObject('Object Repository/Oracle Objects/Page_Sign In/input_Password_password'), 'XgDWJcwDXfN+h5PixUq8oA==')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Oracle Objects/Page_Sign In/button_Sign In'))

WebUI.delay(12)

WebUI.click(findTestObject('Object Repository/Oracle Extension/Page_Welcome/svg_Navigator'))

not_run: WebUI.click(findTestObject('Object Repository/Oracle Extension/Page_Welcome/path_INSTANCE Refreshed On SEPT 2020_svg-outline'))

WebUI.click(findTestObject('Object Repository/Oracle Extension/Page_Welcome/div_Tools'))

WebUI.click(findTestObject('Object Repository/Oracle Extension/Page_Welcome/span_Reports and Analytics'))

WebUI.click(findTestObject('Object Repository/Oracle Extension/Page_Reports and Analytics - Reports and An_a26765/button_Browse Catalog'))

WebUI.switchToWindowTitle('Oracle BI Catalog')

WebUI.delay(7)

not_run: WebUI.doubleClick(findTestObject('Page_Shared Folders - Oracle BI Catalog/span_Shared Folders'))

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Shared Folders - Oracle BI Catalog/span_Custom'))

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Page_Custom - Oracle BI Catalog/span_Human Capital Management'))

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Test Object 2/Page_Oracle BI Catalog/span_My Information'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Test Object 2/Page_Oracle BI Catalog/a_Expand'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Test Object 2/Page_Oracle BI Catalog/a_Open'))

not_run: WebUI.delay(2)

not_run: WebUI.acceptAlert()

not_run: WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Shared Folders - Oracle BI Catalog/span_Shared Folders'))

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Shared Folders - Oracle BI Catalog/span_Custom'))

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Custom - Oracle BI Catalog/span_Human Capital Management'))

not_run: WebUI.delay(2)

not_run: WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Oracle BI Catalog/span_My Information'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Oracle BI Catalog/a_Expand'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Oracle BI Catalog/a_Open'))

not_run: WebUI.delay(2)

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Shared Folders - Oracle BI Catalog/span_Shared Folders'))

WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Custom - Oracle BI Catalog/span_Custom'))

WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Human Capital Management - Oracle BI Catalog/span_Human Capital Management'))

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Human Capital Management - Oracle BI Catalog/a_Expand'))

WebUI.doubleClick(findTestObject('Object Repository/Test Object 3/Page_Gopu - Oracle BI Catalog/span_Gopu'))

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Gopu - Oracle BI Catalog/a_Open'))

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Employee Information - Oracle BI Publisher/img'))

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Employee Information - Oracle BI Publisher/div_PDF'))

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Employee Information - Oracle BI Publisher/img'))

WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Employee Information - Oracle BI Publisher/div_RTF'))

not_run: WebUI.click(findTestObject('Object Repository/Test Object 3/Page_Employee Information - Oracle BI Publisher/img_View Report_xdoviewFormatIcon'))

