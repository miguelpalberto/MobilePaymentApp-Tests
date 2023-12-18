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

WebUI.navigateToUrl('http://localhost:8100/login')

WebUI.setText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/input_Phone_ion-input-0'), '900000001')

WebUI.setEncryptedText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/input_Password_ion-input-1'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/input_PIN_ion-input-2'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-button_Create'))

WebUI.setEncryptedText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/input_Pin_ion-input-3'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-button_Enter'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-button_Welcome, 900000001_ion-color ion_4d55a7'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-toggle_Settings_md in-item toggle-check_4e4602'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-back-button_Show More_md button back-bu_4c1eb1'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/svg_Piggy Bank_bi bi-send'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/h1_Miguel Pedrosa Alberto'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/input_Amount_inputValue'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-label_Send'))

WebUI.setEncryptedText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/input_Confirmation Code_inputCode'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-button_Confirm'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/p_0,01 sent to Miguel Pedrosa Alberto (900000002)'))

WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-button_Continue'))

WebUI.closeBrowser()

