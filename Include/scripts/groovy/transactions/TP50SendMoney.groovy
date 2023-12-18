package transactions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.exception.StepFailedException

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class TP50SendMoney {

	@Then("I choose a contact linked to a vCard")
	public void i_choose_a_contact_a_linked_to_vCard() {
		WebUI.click(findTestObject('TP50SendMoney/ion-item-contact-vcard'))
		//WebUI.click(findTestObject('Object Repository/TP50SendMoney/2/h1_Miguel Pedrosa Alberto'))
	}

	@Then("I see the send button not disabled")
	public void i_see_the_send_button_not_disabled() {
		WebUI.verifyElementClickable(findTestObject('TP50SendMoney/ion-button_Send'))
	}

	@When("I press the send button")
	public void i_press_the_send_button() {
		//WebUI.click(findTestObject('TP50SendMoney/ion-button_Send'))
		WebUI.click(findTestObject('Object Repository/TP50SendMoney/2/ion-label_Send'))
	}

	@Then("I see the continue button")
	public void i_see_the_continue_button() {
		WebUI.verifyElementPresent(findTestObject('TP50SendMoney/ion-button_Continue'), 0)
	}

	@Then("I press continue button")
	public void i_press_continue_button() {
		//WebUI.click(findTestObject('TP50SendMoney/ion-button_Continue'))
		WebUI.click(findTestObject('Object Repository/TP50SendMoney/2/ion-button_Continue'))
	}

	@Then("I fill the amount with {string}")
	public void i_fill_the_amount_with(String string) {
		WebUI.setText(findTestObject('TP50SendMoney/input_Amount_inputValue'), string)
		//WebUI.click(findTestObject('Object Repository/TP50SendMoney/2/input_Amount_inputValue'))
	}

	@Then("I fill the confirmation code with my pin")
	public void i_fill_the_confirmation_code_with_my_pin() {
		//boolean isPresent = true;
		WebUI.setEncryptedText(findTestObject('Object Repository/TP50SendMoney/2/input_Confirmation Code_inputCode'),'tzH6RvlfSTg=')
		//try {
		//	WebUI.verifyElementPresent(findTestObject('TP50SendMoney/input_Confirmation Code_ion-input-4'), 0)

		//}
		//catch(StepFailedException ignore) {
		//	isPresent = false;
		//}

		//fix para o element ser o mesmo mas o xpath ser um bocadinho difente
		//if (isPresent) {
		//	WebUI.setEncryptedText(findTestObject('TP50SendMoney/input_Confirmation Code_ion-input-4'), 'tzH6RvlfSTg=')
		//}
		//else {
		//	WebUI.setEncryptedText(findTestObject('TP50SendMoney/input_Confirmation Code_ion-input-6'), 'tzH6RvlfSTg=')
		//}
	}
	@And("I press confirm")
	public void i_press_confirm() {
		//WebUI.click(findTestObject('TP50SendMoney/ion-button_Continue'))
		WebUI.click(findTestObject('Object Repository/TP50SendMoney/2/ion-button_Confirm'))
	}

	@Then("I see the transaction success message")
	public void i_see_the_transaction_success_message() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP50SendMoney/2/p_Transaction Successful'), 'Transaction Successful!')
		//WebUI.verifyElementPresent(findTestObject('TP50SendMoney/ion-content-success-message'), 0)
	}

	@Then("I press the Add New Contact button")
	public void i_press_the_Add_New_Contact_button() {
		WebUI.click(findTestObject('TP50SendMoney/ion-list_Add New Contact'))
	}

	@Then("I fill phone number with a phone that is a vcard")
	public void i_fill_phone_number_with_a_phone_that_is_a_vcard() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('TP50SendMoney/input_Phone Number_ion-input-4'), "900000010")
	}

	@Then("I press the Add button Contact")
	public void i_press_the_Add_button_Contact() {
		WebUI.click(findTestObject('TP50SendMoney/ion-button_Add Contact'))
	}

	@Then("I see an error message below the amount that contains {string}")
	public void i_see_an_error_message_below_the_amount_that_contains(String string) {
		WebUI.getText(findTestObject('TP50SendMoney/ion-text-amount-error'), FailureHandling.STOP_ON_FAILURE).contains(string)
	}

	@Then("I see the send button disabled")
	public void i_see_the_send_button_disabled() {
		WebUI.getAttribute(findTestObject('TP50SendMoney/ion-button_Send'), 'class').contains('button-disabled')
	}

	@Then("I see an error message below the confirmation code that contains {string}")
	public void i_see_an_error_message_below_the_confirmation_code_that_contains(String string) {
		//WebUI.getText(findTestObject('TP50SendMoney/ion-text-confirmation-code-error'), FailureHandling.STOP_ON_FAILURE).contains(string)
		WebUI.verifyElementText(findTestObject('Object Repository/TP50SendMoney/4/ion-text_The confirmation code is incorrectb'),'The confirmation code is incorrect')

	}

	@Then("I fill the confirmation code with an incorrect pin")
	public void i_fill_the_confirmation_code_with_an_incorrect_pin() {
		//WebUI.setEncryptedText(findTestObject('Object Repository/TP50SendMoney/input_Confirmation Code_ion-input-4'), 'CSt51UwWECc=')
		WebUI.setEncryptedText(findTestObject('Object Repository/TP50SendMoney/2/input_Confirmation Code_inputCode'),'CSt51UwWECc=')
	}
	@And("I see the modal to input my pin")
	public void i_see_the_modal_to_input_my_pin() {
		WebUI.setEncryptedText(findTestObject('Object Repository/TP50SendMoney/2/input_Confirmation Code_inputCode'),'tzH6RvlfSTg=')
		//WebUI.verifyElementVisible(findTestObject('Object Repository/TP50SendMoney/2/ion-row_Sending 0,01to Miguel Pedrosa Alber_8b3140'))
	}
	@And("I press cancel")
	public void i_press_cancel() {
		WebUI.click(findTestObject('Object Repository/TP50SendMoney/3/ion-button_Cancel'))
	}
}