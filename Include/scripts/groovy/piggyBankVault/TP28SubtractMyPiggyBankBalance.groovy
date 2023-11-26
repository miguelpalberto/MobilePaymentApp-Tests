package piggyBankVault
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



class TP28SubtractMyPiggyBankBalance {
	@Then("I click the Piggy Bank Vault button")
	public void i_click_the_Piggy_Bank_Vault_button() {
		WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Piggy Bank'))
	}

	@Then("I fill the amount with the {string}")
	public void i_fill_the_amount_with_the(String string) {
		WebUI.setText(findTestObject('Object Repository/TP28SubtractMyPiggyBankBalance/input_Piggy Bank Balance_inputValue'), string)
	}

	@Then("I should see the Apply button")
	public void i_should_see_the_Apply_button() {
		WebUI.verifyElementPresent(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Apply'), 0)
	}

	@When("I click the Apply button")
	public void i_click_the_Apply_button() {
		WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Apply'))
	}

	@Then("I should see a modal with a success message in my Piggy Bank Vault page")
	public void i_should_see_a_modal_with_a_success_message_in_my_Piggy_Bank_Vault_page() {
		WebUI.verifyElementText(findTestObject('TP28SubtractMyPiggyBankBalance/ion-card-title_Success'), 'Success')
	}

	@Then("I close the modal in my Piggy Bank Vault Page")
	public void i_close_the_modal_in_my_Piggy_Bank_Vault_Page() {
		WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Close'))
	}

	@Then("I switch the operation from storing to withdrawal")
	public void i_switch_the_operation_from_storing_to_withdrawal() {
		WebUI.click(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button-switch-action'))
	}

	@And("I see that the Apply button is disabled")
	public void i_see_that_the_apply_button_is_disabled() {
		WebUI.verifyElementNotClickable(findTestObject('TP28SubtractMyPiggyBankBalance/button_button-native-n_Apply-237'))
	}

	@Then("I see an error message")
	public void i_see_an_error_message() {
		WebUI.verifyElementPresent(findTestObject('TP28SubtractMyPiggyBankBalance/ion-label-piggy-bank-errors'), 0)
	}

	@Then("I verify that the error message is {string}")
	public void i_verify_that_the_error_message_is_Cannot_store_more_money_than_the_Total_Balance_in_the_Piggy_Bank_Vault(String string) {
		WebUI.getText(findTestObject('TP28SubtractMyPiggyBankBalance/ion-label-piggy-bank-errors'), FailureHandling.STOP_ON_FAILURE).contains(string)
	}

	@Then("I should not see the Apply button")
	public void i_should_not_see_the_Apply_button() {
		WebUI.verifyElementNotPresent(findTestObject('TP28SubtractMyPiggyBankBalance/ion-button_Apply'), 0)
	}
}