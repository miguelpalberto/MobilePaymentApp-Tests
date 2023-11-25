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

WebUI.setText(findTestObject('Object Repository/Lixo/input_Phone_ion-input-0 (2)'), '999999998')

WebUI.setEncryptedText(findTestObject('Object Repository/Lixo/input_Password_ion-input-1 (2)'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Lixo/input_PIN_ion-input-2 (2)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Ionic App/slot-_Create-aaf (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Lixo/input_Pin_ion-input-3 (2)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Ionic App/span_button-inner-n_Enter-e91'))

WebUI.click(findTestObject('Object Repository/Page_Ionic App/button_button-native-on_User-9b1 (2)'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Lixo/input_Email_ion-input-9 (2)'))

WebUI.setText(findTestObject('Object Repository/Lixo/input_Name_ion-input-8 (2)'), 'Default User Editado')

WebUI.setText(findTestObject('Object Repository/Lixo/input_Email_ion-input-9 (2)'), 'defaultUser')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('Object Repository/TP12ViewUserDetails/ion-card-title_Error'), 'Error')

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

