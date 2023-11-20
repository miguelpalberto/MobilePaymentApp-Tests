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



class TP13EditUserDetails {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I click on the user profile image")
	public void i_click_on_the_user_profile_image() {
		WebUI.click(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-button_User'))
	}

	@Then("I should be on the user profile page")
	public void i_should_be_on_the_user_profile_page() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP12ViewUserDetails/ion-content_Phone numberNameEmailEdit'), 0)
	}

	@Given("I click on the Edit button")
	public void i_click_on_the_Edit_button() {
		WebUI.click(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-button_Edit'))
	}

	@When("I change my name")
	public void i_change_my_name() {
		WebUI.setText(findTestObject('Object Repository/TP12ViewUserDetails/input_Name_ion-input-8'), 'Default User Editado')
	}

	@When("I change my email")
	public void i_change_my_email() {
		WebUI.setText(findTestObject('Object Repository/TP12ViewUserDetails/input_Email_ion-input-9'), 'defaultUser@mail.edited')
	}

	@When("I change my email with a mistake")
	public void i_change_my_email_with_a_mistake() {
		WebUI.setText(findTestObject('Object Repository/TP12ViewUserDetails/input_Email_ion-input-9'), 'defaultU')
	}
	
	@When("I click on Save button")
	public void i_click_on_Save_button() {
		WebUI.click(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-button_Save'))
	}

	@Then("I should see a modal confirming my profile changes")
	public void i_should_see_a_modal_confirming_my_profile_changes() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-card-title_Success'), 'Success')
	}

	@Then("I dismiss the confirming modal")
	public void i_dismiss_the_confirming_modal() {
		WebUI.click(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-button_Close'))
	}

	@Then("I should see an error modal for unsuccessful profile changes")
	public void i_should_see_an_error_modal_for_unsuccessful_profile_changes() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-card-title_Error'), 'Error')
	}

	@Then("I dismiss the error modal")
	public void i_dismiss_the_error_modal() {
		WebUI.click(findTestObject('Object Repository/TP13EditUserDetails/TP13Bion-button_CloseError'))
	}
}