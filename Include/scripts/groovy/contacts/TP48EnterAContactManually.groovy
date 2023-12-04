package contacts
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



class TP48EnterAContactManually {
	@And("I click the Add New Contact button")
	public void i_click_the_Add_New_Contact_button() {
		WebUI.click(findTestObject('TP48EnterAContactManually/ion-item_Add New Contact'));
	}
	
	@And("I fill the phone with phone")
	public void i_fill_the_phone_with_phone() {
		WebUI.setText(findTestObject('Object Repository/TP48EnterAContactManually/input_Phone_Number_Add_Contact'), '900000006');
	}
	
	@And("I fill the name with name")
	public void i_fill_the_name_with_name() {
		WebUI.setText(findTestObject('Object Repository/TP48EnterAContactManually/input_Name (optional)_ion-input-5'), 'Test')
	}
	
	@And("I press confirm button")
	public void i_press_confirm_button() {
		WebUI.click(findTestObject('TP48EnterAContactManually/ion-button_Add Contact'))
	}
	
	@And("I check the checkbox to save in my contacts")
	public void i_check_the_checkbox_save_to_contacts() {
		WebUI.click(findTestObject('TP48EnterAContactManually/ion-checkbox_Save contact in my contacts list'));
	}
	
	@Then("I should see the Send Money page")
	public void i_should_see_the_send_money_page() {
		WebUI.verifyTextPresent('Send Money', false)
	}
	
	@And("I click on the go back button")
	public void i_click_goback_button() {
		WebUI.click(findTestObject('Object Repository/TP48EnterAContactManually/ion-back-button'));
	}
	
	@Then("I should see the contacts list")
	public void i_should_see_the_contacts_list() {
		WebUI.verifyElementVisible(findTestObject("Object Repository/TP48EnterAContactManually/ion-list_phone_contacts_list"));
	}
	
	@Then("I should see the contact name")
	public void i_should_see_the_contact_name() {
		WebUI.verifyTextPresent('Test', false);
	}
	
	@Then("I should see the contact phone")
	public void i_should_see_the_contact_phone() {
		WebUI.verifyTextPresent('900000006', false)
	}
	
	@And("I should see the send to contact name")
	public void i_should_see_Send_to_name() {
		WebUI.verifyTextPresent('Test', false)
	}
	
	@And("I should not see the contact name")
	public void i_should_not_see_contact_name() {
		WebUI.verifyTextNotPresent('Test', false)
	}
	
	@And("I should not see the contact phone")
	public void i_should_not_see_contact_phone() {
		WebUI.verifyTextNotPresent('900000006', false)
	}
	
	@Then("I fill the phone with invalid phone")
	public void i_fill_the_phone_with_invalid_phone() {
		WebUI.setText(findTestObject('Object Repository/TP48EnterAContactManually/input_Phone_Number_Add_Contact'), '800000006');
	}
	
	
	@Then("I should see the invalid phone error")
	public void i_should_see_the_invalid_phone_error() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP48EnterAContactManually/ion-text_Phone number must be a valid Portuguese mobile phone number (1)'));
	}
	
	@Then("I fill the phone with phone that has no vcard")
	public void i_fill_the_phone_with_phone_that_has_no_vcard() {
		WebUI.setText(findTestObject('Object Repository/TP48EnterAContactManually/input_Phone_Number_Add_Contact'), '918821097');
	}
	
	@Then("I should see the invalid vcard error")
	public void i_should_see_the_invalid_vcard_error() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP48EnterAContactManually/ion-text_Phone number is not associated with a vCard'));
	}
}