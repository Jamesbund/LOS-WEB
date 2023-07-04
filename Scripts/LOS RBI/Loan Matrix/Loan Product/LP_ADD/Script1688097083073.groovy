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
///////////////////////////////////////////////////////////////////////////////////////////////////
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
//Text with random number
import java.util.Random as Random

String ftext = 'Test Product'

Random snum = new Random()

int randomNumber = snum.nextInt(100000)

String lpname = ftext + randomNumber

///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
//Random number
Random snum1 = new Random()

int randomNumber1 = snum1.nextInt(99999)

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_Loan Matrix'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_Loan Product Matrix'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/a_Add Loan Product'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/label_Loan Product'))

//WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Update Loan Product_txtDescription'), 'Test Product')
WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Update Loan Product_txtDescription'), lpname)

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/label_Product Code'))

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Loan Product_txtProductCode'), randomNumber1.toString())

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_LOS Web HomePage/select_Select Interest ComputationFlat Rate_1f4460'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/label_Flat Rate'))

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Product Code_txtFlatRate'), '2')

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/label_Pro Rate on Half'))

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Flat Rate_txtProRate'), '2')

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/input_Require PPI_chkRequirePPI'))

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/input_WEEKLY_modeCheck'))

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_WEEKLY_txtNewMinTerm_1'), '5')

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Minimum Term_txtNewMaxTerm_1'), '50')

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Maximum Term_txtNewMinAmount_1'), '50')

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_Minimum Amount_txtNewMaxAmount_1'), '200000')

WebUI.click(findTestObject('Object Repository/Page_LOS Web HomePage/button_Add Loan Product'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Page_LOS Web HomePage/input_search'), 'Test Product')

WebUI.delay(5)

