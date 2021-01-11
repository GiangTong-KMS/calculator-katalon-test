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

WebUI.openBrowser(GlobalVariable.TEST_PAGE_URL)

// test for normal multiplying
WebUI.click(GlobalVariable.BUTTON_9)

WebUI.click(GlobalVariable.BUTTON_MUL)

WebUI.click(GlobalVariable.BUTTON_3)

WebUI.click(GlobalVariable.BUTTON_SOLVE)

result = WebUI.getText(GlobalVariable.MONITOR)

WebUI.verifyEqual(result, '27', FailureHandling.CONTINUE_ON_FAILURE)

// clear previous data
WebUI.click(GlobalVariable.BUTTON_AC)

// test for multiplying with negative number
WebUI.click(GlobalVariable.BUTTON_9)

WebUI.click(GlobalVariable.BUTTON_SIGN)

WebUI.click(GlobalVariable.BUTTON_MUL)

WebUI.click(GlobalVariable.BUTTON_3)

WebUI.click(GlobalVariable.BUTTON_SIGN)

WebUI.click(GlobalVariable.BUTTON_SOLVE)

result = WebUI.getText(GlobalVariable.MONITOR)

WebUI.verifyEqual(result, '27', FailureHandling.CONTINUE_ON_FAILURE)

// clear previous data
WebUI.click(GlobalVariable.BUTTON_AC)

// test for multiplying with floating point
WebUI.click(GlobalVariable.BUTTON_2)

WebUI.click(GlobalVariable.BUTTON_DOT)

WebUI.click(GlobalVariable.BUTTON_5)

WebUI.click(GlobalVariable.BUTTON_SIGN)

WebUI.click(GlobalVariable.BUTTON_MUL)

WebUI.click(GlobalVariable.BUTTON_4)

WebUI.click(GlobalVariable.BUTTON_SOLVE)

result = WebUI.getText(GlobalVariable.MONITOR)

WebUI.verifyEqual(result, '-10', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
