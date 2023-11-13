package balance
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


class ViewPiggyBankVaultBalance {

	@When("I look at the Piggy Bank panel")
	public void i_look_at_the_Piggy_Bank_panel() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ionic App/span_Piggy Bank'), 0)
	}

	@Then("I should see the Piggy Bank Vault balance")
	public void i_should_see_the_Piggy_Bank_Vault_balance() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ionic App/h1_piggy_bank_balance'), 0)
	}

	@Then("I should see the text under the Piggy Bank panel {string}")
	public void i_should_see_the_text_No_Balance(String text) {
		// Write code here that turns the phrase above into concrete actions
		WebUI.getText(findTestObject("Object Repository/Page_Ionic App/h1_piggy_bank_balance")).contains(text)
	}
}