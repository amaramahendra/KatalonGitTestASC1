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

WebUI.navigateToUrl('https://ucf3-zprf-fa-ext.oracledemos.com')

WebUI.maximizeWindow()

WebUI.doubleClick(findTestObject('Object Repository/Test 7/Page_Sign In/input_User ID_userid'))

WebUI.setText(findTestObject('Object Repository/Test 7/Page_Sign In/input_User ID_userid'), 'Susan.Atkins')

WebUI.setEncryptedText(findTestObject('Object Repository/Test 7/Page_Sign In/input_Password_password'), 'XgDWJcwDXfN+h5PixUq8oA==')

WebUI.click(findTestObject('Object Repository/Test 7/Page_Sign In/button_Sign In'))

WebUI.click(findTestObject('Test 7/Page_Welcome/svg_Navigator'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Welcome/a_Person Management'))

WebUI.setText(findTestObject('Object Repository/Test 7/Page_Search Person - Person Management - Or_591149/input_Name__FOpt1_FOr10_FONSr20MAt10pt1Pers_544200'), 
    'Roy')

WebUI.click(findTestObject('Object Repository/Test 7/Page_Search Person - Person Management - Or_591149/button_Search'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Search Person - Person Management - Or_591149/a_Chapin Roy'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Employment - Person Management - Oracl_f68138/img_PrintMe__FOpt1_FOr10_FONSr20_FOTsdiHcmI_e71d1b'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Employment - Person Management - Oracl_f68138/a_Element Entries'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/img_Query By Example__FOpt1_FOr10_FONSr20MA_1218dd'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/a_Press down arrow to access Calendar__FOpt_97d1f7'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/td_29'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/a_Element Name__FOpt1_FOr10_FONSr20MAt20AT1_81964b'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/a_Search'))

WebUI.setText(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/input_Element Name__FOpt1_FOr10_FONSr20MAt2_552693'), 
    'car allowance')

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/button_Search'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/td_Car Allowance'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/button_OK'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/a_Assignment__FOpt1_FOr10_FONSr20MAt20AT1as_06c2d9'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/li_E2251'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/input_Amount__FOpt1_FOr10_FONSr20MAt21evIte_35697b'), 
    '200')

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/button_Submit'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - - Oracle Applications/a_Employment'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Employment - - Oracle Applications/button_Done'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Element Entries - Person Management - _c64f2c/button_Close'))

WebUI.setText(findTestObject('Object Repository/Test 7/Page_Search Person - Person Management - Or_591149/input_Name__FOpt1_FOr10_FONSr20MAt10pt1Pers_544200_1'), 
    'roy')

WebUI.click(findTestObject('Date/Page_Search Person - Person Management - Oracle Applications/a_Effective As-of Date__FOpt1_FOr10_FONSr20MAt10pt1Perso10SP3q1value50glyph'))

WebUI.click(findTestObject('Date/Page_Search Person - Person Management - Oracle Applications/td_29'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Search Person - Person Management - Or_591149/button_Search'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Search Person - Person Management - Or_591149/a_Chapin Roy'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Employment - Person Management - Oracl_f68138/img_PrintMe__FOpt1_FOr10_FONSr20_FOTsdiHcmI_e71d1b'))

WebUI.click(findTestObject('Object Repository/Test 7/Page_Employment - Person Management - Oracl_f68138/a_Element Entries'))

WebUI.delay(3)

WebUI.closeBrowser()

