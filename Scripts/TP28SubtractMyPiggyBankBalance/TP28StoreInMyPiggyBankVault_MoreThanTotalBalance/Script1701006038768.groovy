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

WebUI.setText(findTestObject('Object Repository/TP28SubtractMyPiggyBankBalance/input_Phone_ion-input-0'), '900000001')

WebUI.setEncryptedText(findTestObject('Object Repository/TP28SubtractMyPiggyBankBalance/input_Password_ion-input-1'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/TP28SubtractMyPiggyBankBalance/input_PIN_ion-input-2'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Create'))

WebUI.setEncryptedText(findTestObject('Object Repository/TP28SubtractMyPiggyBankBalance/input_Pin_ion-input-3'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Enter'))

WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Piggy Bank'))

WebUI.setText(findTestObject('Object Repository/TP28SubtractMyPiggyBankBalance/input_Piggy Bank Balance_inputValue'), '1000000000')

WebUI.verifyElementPresent(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Apply'), 0)

WebUI.verifyElementNotClickable(findTestObject('TP28SubtractMyPiggyBankBalance/button_button-native-n_Apply-237'))

WebUI.verifyElementPresent(findTestObject('TP28SubtractMyPiggyBankBalance/ion-label-piggy-bank-errors'), 0)

WebUI.getText(findTestObject('TP28SubtractMyPiggyBankBalance/ion-label-piggy-bank-errors'), FailureHandling.STOP_ON_FAILURE).contains(
    'Cannot store more money than the Total Balance in the Piggy Bank Vault')

WebUI.closeBrowser()

