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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8100/')

WebUI.setText(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/input_Phone_ion-input-0 (2)'), 
    '900000001')

WebUI.setEncryptedText(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/input_Password_ion-input-1 (2)'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/input_PIN_ion-input-2 (2)'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Create (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/input_Pin_ion-input-3 (2)'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Enter (2)'))

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Show More (2)'))

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Filters (2)'))

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-select_AllDebitCredit (2)'))

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-radio_All'))

WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Confirm (2)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-list_Reference9000000032023-10-09 04092_aa224e'), 
    0)

