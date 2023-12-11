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
	}

	@Then("I should see the send button not disabled")
	public void i_should_see_the_send_button_not_disabled() {
		WebUI.verifyElementClickable(findTestObject('TP50SendMoney/ion-button_Send'))
	}

	@When("I press the save button")
	public void i_press_the_save_button() {
		WebUI.click(findTestObject('TP50SendMoney/ion-button_Send'))
	}

	@Then("I should see the continue button")
	public void i_should_see_the_continue_button() {
		WebUI.verifyElementPresent(findTestObject('TP50SendMoney/ion-button_Continue'), 0)
	}

	@Then("I press continue button")
	public void i_press_continue_button() {
		WebUI.click(findTestObject('TP50SendMoney/ion-button_Continue'))
	}

	@Then("I fill the amount with {string}")
	public void i_fill_the_amount_with(String string) {
		WebUI.setText(findTestObject('TP50SendMoney/input_Amount_inputValue'), string)
	}

	@Then("I fill the confirmation code with my pin")
	public void i_fill_the_confirmation_code_with_my_pin() {
		boolean isPresent = true;

		try {
			WebUI.verifyElementPresent(findTestObject('TP50SendMoney/input_Confirmation Code_ion-input-4'), 0)
		}
		catch(StepFailedException ignore) {
			isPresent = false;
		}

		//fix para o element ser o mesmo mas o xpath ser um bocadinho difente
		if (isPresent) {
			WebUI.setEncryptedText(findTestObject('TP50SendMoney/input_Confirmation Code_ion-input-4'), 'tzH6RvlfSTg=')
		}
		else {
			WebUI.setEncryptedText(findTestObject('TP50SendMoney/input_Confirmation Code_ion-input-6'), 'tzH6RvlfSTg=')
		}
	}

	@Then("I should see the transaction success message")
	public void i_should_see_the_transaction_success_message() {
		WebUI.verifyElementPresent(findTestObject('TP50SendMoney/ion-content-success-message'), 0)
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

	@Then("I should see an error message below the amount that contains {string}")
	public void i_should_see_an_error_message_below_the_amount_that_contains(String string) {
		WebUI.getText(findTestObject('TP50SendMoney/ion-text-amount-error'), FailureHandling.STOP_ON_FAILURE).contains(string)
	}

	@Then("I see the save button disabled")
	public void i_see_the_save_button_disabled() {
		WebUI.getAttribute(findTestObject('TP50SendMoney/ion-button_Send'), 'class').contains('button-disabled')
	}

	@Then("I should see an error message below the confirmation code that contains {string}")
	public void i_should_see_an_error_message_below_the_confirmation_code_that_contains(String string) {
		WebUI.getText(findTestObject('TP50SendMoney/ion-text-confirmation-code-error'), FailureHandling.STOP_ON_FAILURE).contains(string)
	}

	@Then("I fill the confirmation code with an incorrect pin")
	public void i_fill_the_confirmation_code_with_an_incorrect_pin() {
		WebUI.setEncryptedText(findTestObject('Object Repository/TP50SendMoney/input_Confirmation Code_ion-input-4'), '7WNIAkt6pzE=')
	}
}