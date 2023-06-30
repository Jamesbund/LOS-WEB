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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Thursday, June 8, 2023_txtSearchCID'), '1030091995')

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Search'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 150)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SpyWeb_Elements/Page_LOS Web HomePage/Dashboard/Page_LOS Web HomePage/a_64e443173f8090c620230605085556467'))

WebUI.delay(10)

WebUI.switchToWindowIndex(0)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

