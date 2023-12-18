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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TP81AutoSaveMoneyInThePiggyBank {
	@Given("I click on the settings button")
	public void i_click_on_the_settings_button() {
		WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/1/ion-button_Welcome, 900000001_ion-color ion_4d55a7'))
	}

	@Then("I see the settings page")
	public void i_see_the_settings_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/2/ion-content_Auto-SavingsNotifications'))
	}

	@Then("I disable the auto-saving option")
	public void i_disable_the_auto_saving_option() {
		WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/2/ion-toggle2'))
	}
	@Then("I press back")
	public void i_press_back() {
		//WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/2/ion-back-button_Show More_md button back-bu_4c1eb1'))
		WebUI.click(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/3/ion-back-button3'))
	}

	@Then("I dont see the message with the value saved in piggy bank balance")
	public void i_dont_see_the_message_with_the_value_saved_in_piggy_bank_balance() {
		!WebUI.verifyElementText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/2/p_0.90 saved to your Piggy Bank Vault'), '0.90€ saved to your Piggy Bank Vault')
	}
	@Then("I see the message with the value saved in piggy bank balance")
	public void i_see_the_message_with_the_value_saved_in_piggy_bank_balance() {
		//WebUI.verifyElementText(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/2/p_0.90 saved to your Piggy Bank Vault'), '0.90€ saved to your Piggy Bank Vault')
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP81AutoSaveMoneyInPiggyBank/3/p_0.99 saved to your Piggy Bank Vault'))
	}
}