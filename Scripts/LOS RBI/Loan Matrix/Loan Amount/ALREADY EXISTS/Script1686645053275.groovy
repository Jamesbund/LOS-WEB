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
WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_Loan Matrix'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/span_Loan Amount Matrix'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Add New Loan Matrix'))

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input__txtMinAmount'), '5000')

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Minimum Amount_txtMaxAmount'), '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LOS Web HomePage/select_Please Select Role Account Officer S_1fb818'), 
    '11052', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LOS Web HomePage/select_Please Select Action Recommendation _3b373a'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Save'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.delay(5)

