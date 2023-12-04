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



class TP42us13filtertransactions {
	@When("I select All in the select box")
	public void i_select_All_in_the_select_box() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-select_AllDebitCredit (2)'))
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-radio_All'))
	}

	@When("I click on the apply button")
	public void i_click_on_the_apply_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Confirm (1)'))

	}
	@When("I select the filter button")
	public void i_click_on_the_filter_button() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Filters (1)'))

	}

	@Then("I should see all my transactions")
	public void i_should_see_all_my_transactions() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-list_Reference9000000032023-10-09 04092_aa224e'),
						0)
	}

	@When("I select Debit Only in the select box")
	public void i_select_Debit_Only_in_the_select_box() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-select_AllDebitCredit (1)'))
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-radio_Credit'))

	}

	@Then("I should see all my debit transactions")
	public void i_should_see_all_my_debit_transactions() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-list_Reference9000000032023-10-09 04092_aa224e'),
				0)

	}

	@Then("I click on the show more transactions")
	public void i_should_see_my_transactions() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-button_Show More (1)'))

	}

	@When("I select Credit Only in the select box")
	public void i_select_Credit_Only_in_the_select_box() {
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-select_AllDebitCredit (1)'))
		WebUI.click(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-radio_Credit'))
	}

	@Then("I should see all my credit transactions")
	public void i_should_see_all_my_credit_transactions() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP-42-us13-filter-transactions-by-all-de/Page_Ionic App/ion-list_Reference9000000032023-10-09 04092_aa224e'),
				0)
	}
}