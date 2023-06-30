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
//import java.text.SimpleDateFormat as SimpleDateFormat
//import java.util.Date as Date

//
import java.util.Calendar as Calendar
import java.text.SimpleDateFormat as SimpleDateFormat
//
WebUI.callTestCase(findTestCase('LOS RBI/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/span_Reports'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/span_Audit Trail Report'))

/*
 *
 */
// Get the current date and create a Calendar instance
Calendar calendar = Calendar.getInstance()

// Add 5 days to the current date
calendar.add(Calendar.DAY_OF_MONTH, 5)

// Format the date as "mm/dd/yyyy"
SimpleDateFormat dateFormat = new SimpleDateFormat('MM-dd-yyyy hh:mm a')

String futureDate = dateFormat.format(calendar.time)

// Log the future date
println('Future Date: ' + futureDate)

/*
 *
 */
// Input the current date into the text box
WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input__startDate1'), futureDate)

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input__endDate1'), futureDate)

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

