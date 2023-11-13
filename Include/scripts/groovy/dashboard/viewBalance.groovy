package dashboard
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



class viewBalance {

	@Given("I start the application")
	public void i_start_the_application() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Given("I am in the dashboard page")
	public void i_am_in_the_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Given("I have funds in my account")
	public void i_have_funds_in_my_account() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Then("I see a modal to enter my pin")
	public void i_see_a_modal_to_enter_my_pin() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Then("I enter my pin")
	public void i_enter_my_pin() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ionic App/input_Pin_ion-input-3'), 'tzH6RvlfSTg=')

	}

	@Then("I see my balance on the dashboard")
	public void i_see_my_balance_on_the_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		//	   WebUI.click(findTestObject('Object Repository/Page_Ionic App/button_button-native-n_Enter-5f1'))
		WebUI.verifyElementPresent(findTestObject("Object Repository/Page_Ionic App/h1_balance"), 10)

	}

	@Then("I click on the confirm button")
	public void i_click_on_confirm_button() {
		WebUI.click(findTestObject('Object Repository/Page_Ionic App/ion-button_Enter'))
	}

	@Given("I don't have any funds in my account")
	public void i_don_t_have_any_funds_in_my_account() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}


	@Given("I have no funds in my account")
	public void i_have_no_funds_in_my_account() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Then("I see the text {string} on the dashboard")
	public void i_see_the_text_on_the_dashboard(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.getText(findTestObject("Object Repository/Page_Ionic App/h1_balance")).contains(string)
	}
}