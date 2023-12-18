package userprofile
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



class TP11US20DismissDeletevCard {

	@Given("I click on the profile page button")
	public void i_click_on_the_profile_page_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_Welcome, 900000001_ion-color ion_4d55a7 (2)'))
	}

	@Given("I am in the profile page")
	public void i_am_in_the_profile_page() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@When("I click on the dismiss vcard button")
	public void i_click_on_the_dismiss_vcard_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_Dismiss (2)'))
	}

	@Then("I see a modal to confirm the dismissal")
	public void i_see_a_modal_to_confirm_the_dismissal() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent((findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_Yes (2)')), 0)

	}

	@Then("I click on the confirm button")
	public void i_click_on_the_confirm_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_Yes (2)'))

	}

	@Then("I see the login page")
	public void i_see_the_login_page() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Then("I click on the cancel button")
	public void i_click_on_the_cancel_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_No'))
	}

	@Then("I see the profile page")
	public void i_see_the_profile_page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_Dismiss (3)'), 0)
	}

	@When("I click on the delete my account button")
	public void i_click_on_the_delete_my_account_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-button_Delete'))

	}

	@Then("I see a modal to confirm the deletion")
	public void i_see_a_modal_to_confirm_the_deletion() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/input_Password_ion-input-7'), 0)
	}

	@Then("I enter my password in the modal")
	public void i_enter_my_password_in_the_modal() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/input_Password_ion-input-7'),
				'tzH6RvlfSTg=')
	}

	@Then("I enter a wrong pin")
	public void i_enter_a_wrong_pin() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/input_PIN_ion-input-8'),
				'lnBUteI2ioQ=')
	}

	@Then("I see an error message in the modal")
	public void i_see_an_error_message_in_the_modal() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/ion-text_The confirmation code is incorrect'), 0)

	}

	@Then("I enter a valid pin in the modal")
	public void i_enter_a_valid_pin_in_the_modal() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/US20DismissDeletevCard/Page_Ionic App/input_PIN_ion-input-8 (1)'),
				'tzH6RvlfSTg=')
	}

	@Given("I fill the phone with phone that has no balance")
	public void i_fill_the_phone_with_phone_that_has_no_balance() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setText(findTestObject('Object Repository/TP3CreateAVcardAssociateVcard/input_Phone_ion-input-0'), '987716001');
	}
}