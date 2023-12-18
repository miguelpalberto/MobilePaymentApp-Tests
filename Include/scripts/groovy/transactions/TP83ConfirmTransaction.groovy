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
import com.kms.katalon.core.exception.StepFailedException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import java.lang.Thread;



class TP83ConfirmTransaction {

	@When("I enter my confirmation code as {string}")
	public void i_enter_my_confirmation_code_as(String string) {
		WebUI.setText(findTestObject('TP83ConfirmTransaction/input_Transaction-confirmation-code'), string)
	}

	@And("I click on the confirm button")
	public void i_click_on_the_confirm_button() {
		WebUI.click(findTestObject('TP83ConfirmTransaction/ion-button_Confirm-Transaction'))
	}
	
	@When("I click on the continue button")
	public void i_click_on_the_continue_button() {
		WebUI.click(findTestObject('TP83ConfirmTransaction/ion-button_Continue-after-transaction'))
	}

	@Then("I should see a success message")
	public void i_should_see_a_success_message() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('TP83ConfirmTransaction/p_Transaction Successful'), 0)
	}
	
	@Then("I should see the error message {string}")
	public void i_should_see_the_error_message(String string) {
		WebUI.getText(findTestObject('TP83ConfirmTransaction/ion-text_transaction_error'), FailureHandling.STOP_ON_FAILURE).contains(string)
	}

	@When("I click on the cancel button")
	public void i_click_on_the_cancel_button() {
		WebUI.click(findTestObject('TP83ConfirmTransaction/ion-button-Cancel-Transaction'))
	}

	@Then("I should see my contacts page")
	public void i_should_see_my_contacts_page() {
		WebUI.verifyElementPresent(findTestObject('TP83ConfirmTransaction/div_contacts'), 0)
	}
	
	@Then("I see a modal to confirm my transaction")
	public void i_see_a_modal_to_confirm_my_transaction() {
		Thread.sleep(1000)
		WebUI.verifyElementPresent(findTestObject('TP83ConfirmTransaction/ion-modal-confirm-transaction'), 0)
	}
}