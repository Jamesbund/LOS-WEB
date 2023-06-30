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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.util.KeywordUtil
//


////
//Random numbers for Minimum Loan Amount
import java.util.Random as Random

// Create an instance of the Random class
def MinLa = new Random()

// Generate a random 4-digit number
def MinimumLA = MinLa.nextInt(9000) + 1000

////

//Random numbers for Maximum Loan Amount
// Create an instance of the Random class
def MaxLa = new Random()

// Generate a random 4-digit number
def MaximumLA = MaxLa.nextInt(90000) + 10000
////

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_Loan Matrix'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/span_Loan Amount Matrix'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Add New Loan Matrix'))

//WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input__txtMinAmount'), '5071')
// Set the generated number in a text field
WebUI.setText(findTestObject('Page_LOS Web HomePage/input__txtMinAmount'), MinimumLA.toString())

//WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Minimum Amount_txtMaxAmount'), '503694')
WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Minimum Amount_txtMaxAmount'), MaximumLA.toString())

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LOS Web HomePage/select_Please Select Role Account Officer S_1fb818'), 
    '1016', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LOS Web HomePage/select_Please Select Action Recommendation _3b373a'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Save'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.delay(3)

