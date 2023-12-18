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

WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_PhonePasswordPINCreate'), 
    0)

WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '900000001')

WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Password_ion-input-1'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PIN_ion-input-2'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/ion-button_Create'))

//Entrar
WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_ModalLoginDashboard'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PinDashboard'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/ion-button_EnterDashboard'))

WebUI.click(findTestObject('TP7ViewListOfTransactions/ion-button_Show More'))

WebUI.verifyElementVisible(findTestObject('TP41FilterTransactionsByDateRange/Lixo/a/ion-content_Filters ReferencePT962'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/ion-button_Filters'))

/////
WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/Modal/ion-button_Confirm'))

//
WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/input_Start Date_dateInput'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/ion-modalCalendario'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/ion-contentModalCalendario'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TimeCalendar/ion-timeCalendar'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/dia7/ion-datetime_Start Date_ion-7'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/ion-button_OKCalendar'))

//
WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/input_End Date_dateInput'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/ion-modalCalendario'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/ion-contentModalCalendario'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TimeCalendar/ion-timeCalendar'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/dia7/ion-datetime_Start Date_ion-7'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/ion-button_OKCalendar'))

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_1-e-ready-552'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_0000-e-ready-e97'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_01-c-input-8b9'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/ion-backdrop_md-erlay-3-00a'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Lixo/c/ion-picker-column-internal_year-column'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/svg_ionicon-ady-222-6b4'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_2023-pen-839-c0e'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/div_End DateOK'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/div_End DateOK'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/svg_ionicon-pen-a46-bb8'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/span_button-inner-ady-44d-a49'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_31-e-ready-c68'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_25-e-ready-e19'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_1955-e-ready-3aa'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_56-c-input-2d9'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/ion-backdrop_md-erlay-4-5e7'))

WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Lixo/a/button_button-native-tton_OK-484'))

WebUI.closeBrowser()

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/anoS/pathAbrirAno'))

WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/anoS/pathAbrirAno'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/div_modalFiltros'))

