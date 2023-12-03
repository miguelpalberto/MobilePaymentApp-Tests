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

WebUI.openBrowser('');

WebUI.navigateToUrl('http://localhost:8100/login');
WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_PhonePasswordPINCreate'), 0);

WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '900000001');
WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Password_ion-input-1'), '7WNIAkt6pzE=');
WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PIN_ion-input-2'), 'tzH6RvlfSTg=');
WebUI.click(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/ion-button_Create'));

WebUI.verifyElementText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/p_Invalidcredentials'), 
    'Invalid credentials')

WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_PhonePasswordPINCreate'), 0);
WebUI.closeBrowser()