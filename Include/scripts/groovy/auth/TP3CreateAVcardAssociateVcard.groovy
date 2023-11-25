package auth
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

class TP3CreateAVcardAssociateVcard {
	@Given("I am in the vcard creation page")
	public void i_am_in_the_vcard_creation_page() {
		WebUI.openBrowser('');
		WebUI.navigateToUrl('http://localhost:8100/login');
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_PhonePasswordPINCreate'), 0)
	}

	@Given("I dont have any vcard associated")
	public void i_dont_have_any_vcard_associated() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@When("I fill the phone with phone")
	public void i_fill_the_phone_with_phone() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '910001001');
	}
	@When("I fill the phone _with {string}")
	public void i_fill_the_phone_with_custom_phone(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), string);
	}
	@When("I fill the phone with phone that has transactions and balance")
	public void i_fill_the_phone_with_phone_that_has_transactions_and_balance() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '900000001');
	}
	@When("I fill the phone with phone that has no transactions and no balance")
	public void i_fill_the_phone_with_phone_that_has_no_transactions_and_no_balance() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '999999999');
	}
	@When("I fill the password with password")
	public void i_fill_the_password_with_password() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Password_ion-input-1'), 'tzH6RvlfSTg=');
	}

	@When("I fill the pin with pin")
	public void i_fill_the_pin_with_pin() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PIN_ion-input-2'), 'tzH6RvlfSTg=');
	}

	@When("I click on the create button")
	public void i_click_on_the_create_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/ion-button_Create'));
	}

	@Then("I should see a message confirming the vcard create")
	public void i_should_see_a_message_confirming_the_vcard_create() {
		// Write code here that turns the phrase above into concrete actions
		//WebUI.click(findTestObject('Object Repository/Page_Ionic App/div_dashboard'));
	}

	@Then("I should see the dashboard page")
	public void i_should_see_the_dashboard_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.getUrl().contains("dashboard")
	}

	@Given("I have a vcard associated")
	public void i_have_a_vcard_associated() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/p_auth_error'));
	}

	@Then("I should see an error message telling me the phone number is invalid")
	public void i_should_see_an_error_message_telling_me_the_phone_number_is_invalid() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/p_Thephonefieldisinvalid'),
				'The phone field is empty or does not have 9 digits or does not start with 9')
	}
	@Then("I should see an error message telling me the credentials are incorrect")
	public void i_should_see_an_error_message_telling_me_the_credencials_are_incorrect() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/p_Invalidcredentials'),
				'Invalid credentials')
	}

	@Then("I should see an error message telling me the password field is empty")
	public void i_should_see_an_error_message_telling_me_the_password_field_is_empty() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/p_Thepasswordfieldisempty'),
				'The password field is empty')
	}
	@Then("I should see an error message telling me the pin is invalid")
	public void i_should_see_an_error_message_telling_me_the_pin_is_invalid() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/p_Thepinfieldemptyor'),
				'The pin field is empty or does not have 3 digits')
	}

	@Then("I should see the vcard creation page")
	public void i_should_see_the_vcard_creation_page() {
		// Write code here that turns the phrase above into concrete actions
		//WebUI.openBrowser('');
		//WebUI.navigateToUrl('http://localhost:8100/login');
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_PhonePasswordPINCreate'), 0)
	}

	@When("I fill the pin with an incorrect pin")
	public void i_fill_the_pin_with_an_incorrect_pin() {
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PIN_ion-input-2'), '7WNIAkt6pzE=');
	}
	@When("I fill the pin with an invalid pin")
	public void i_fill_the_pin_with_an_invalid_pin() {
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PIN_ion-input-2'),
				'CSt51UwWECc=')
	}
	@When("I fill the password with an incorrect password")
	public void i_fill_the_password_with_an_incorrect_password() {
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Password_ion-input-1'), '7WNIAkt6pzE=');
	}
	@When("I leave the password field empty")
	public void i_leave_the_password_field_empty() {
	}

	@When("I fill the phone with an invalid phone")
	public void i_fill_the_phone_with_an_invalid_phone() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '910');
	}
	@And("I close the browser")
	public void close_the_browser() {
		WebUI.closeBrowser()
	}


	@And("I see a modal to enter my pin")
	public void i_see_a_modal_to_enter_my_pin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/div_ModalLoginDashboard'), 0);
	}

	@And("I enter my pin")
	public void i_enter_my_pin() {
		WebUI.setEncryptedText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_PinDashboard'), 'tzH6RvlfSTg=')
	}

	@And("I click on the enter button")
	public void i_click_on_the_enter_button() {
		WebUI.click(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/ion-button_EnterDashboard'))
	}
}