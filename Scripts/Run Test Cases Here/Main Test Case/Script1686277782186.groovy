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

WebUI.callTestCase(findTestCase('LOS RBI/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Dashboard/CID and view ePN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Loan Matrix/Loan Amount/LA_ADD'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Loan Matrix/Loan Amount/LA_EDIT'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Loan Matrix/Loan Amount/LA_DELETE'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Reports/Audit Trail Reports/ATR Generate in PDF'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Loan Matrix/Loan Product/LP_ADD'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Loan Matrix/Loan Product/LP_EDIT'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Loan Matrix/Loan Product/LP_DELETE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Reports/Audit Trail Reports/ATR Generate in PDF'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOS RBI/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

