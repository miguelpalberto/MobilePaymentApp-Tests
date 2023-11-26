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

WebUI.setText(findTestObject('Object Repository/Lixo/input_Phone_ion-input-0 (1)'), '999999998')

WebUI.setEncryptedText(findTestObject('Object Repository/Lixo/input_Password_ion-input-1 (1)'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Lixo/input_PIN_ion-input-2 (1)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Ionic App/slot-_Create-aaf'))

WebUI.setEncryptedText(findTestObject('Object Repository/Lixo/input_Pin_ion-input-3 (1)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Ionic App/button_button-native-n_Enter-c9a'))

//clica user:
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/TP12ViewUserDetails/button_button-native-on_Edit-514'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TP12ViewUserDetails/mainPaginaProfile'), 0)

WebUI.setText(findTestObject('Object Repository/TP12ViewUserDetails/input_Name_ion-input-8'), 'Default User Editado')

WebUI.setText(findTestObject('Object Repository/TP12ViewUserDetails/input_Email_ion-input-9'), 'defaultUser@mail.edited')

WebUI.click(findTestObject('Object Repository/TP12ViewUserDetails/button_button-native-on_Save-e5b'))

WebUI.verifyElementText(findTestObject('null'), 'Success')

WebUI.click(findTestObject('Object Repository/TP12ViewUserDetails/button_button-native-on_User-40e'))

WebUI.closeBrowser()

