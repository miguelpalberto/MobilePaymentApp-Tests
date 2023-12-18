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



class TP51CheckIfPhoneContactIsVCard {
	@Given("I have a vCard contact")
	public void i_have_a_vCard_contact() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP51CheckIfPhoneContactIsVCard/ion-non_vcard_contact'), 0);
	}

	@Then("I should see a vCard icon on that contact")
	public void i_should_see_a_vCard_icon_on_that_contact() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP51CheckIfPhoneContactIsVCard/ion-icon_vcard'), 0);
	}
	@When("I have a contact that is not associated to vCard")
	public void i_have_a_contact_that_is_not_associated_to_vCard() {

	}
	
	@Then("I should see that contact without a vCard icon")
	public void i_should_see_that_contact_without_a_vCard_icon() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP51CheckIfPhoneContactIsVCard/ion-icon_vcard'), 0);
	}
}