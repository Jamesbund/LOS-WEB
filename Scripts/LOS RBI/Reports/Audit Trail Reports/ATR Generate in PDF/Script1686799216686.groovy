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
//
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
//
//
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

//
WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/span_Reports'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/span_Audit Trail Report'))

/*
 *
 */
def today = new Date()

def dateFormat = new SimpleDateFormat('yyyy-MM-dd')

def currentDate = dateFormat.format(today)

/*
 *
 */
// Input the current date into the text box
WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input__startDate1'), currentDate)

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input__endDate1'), currentDate)

WebUI.click(findTestObject('SpyWeb_Elements/Page_LOS Web HomePage/Audit_Trail/div_Audit Trail Report'))

//WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/input__startDate1'))
//
//WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_14'))
//WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/input__endDate1'))
//
//WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_14'))
WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Generate in PDF'))

WebUI.acceptAlert()

WebUI.delay(20)

WebUI.click(findTestObject('SpyWeb_Elements/Page_LOS Web HomePage/Audit_Trail/Buttons/button_'))

WebUI.switchToWindowIndex(0)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

