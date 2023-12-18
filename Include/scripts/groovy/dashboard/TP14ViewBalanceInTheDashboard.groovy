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



class TP14ViewBalanceInTheDashboard {

	@Given("I start the application")
	public void i_start_the_application() {
		WebUI.openBrowser('');
		WebUI.navigateToUrl('http://localhost:8100/login');
	}

	@Given("I am in the dashboard page")
	public void i_am_in_the_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	@Given("I have funds on my account")
	public void i_have_funds_on_my_account() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	//balance
	@Then("I see my balance on the dashboard")
	public void i_see_my_balance_on_the_dashboard() {
		//WebUI.verifyElementText(findTestObject('Object Repository/TP14ViewBalanceInTheDashboard/dashboardBalanceValue'),'199,47 €')
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP14ViewBalanceInTheDashboard/dashboardBalanceValue'))

	}

	@Given("I dont have any funds on my account")
	public void i_dont_have_any_funds_on_my_account() {
		// Write code here that turns the phrase above into concrete actions
		return;
	}

	//No funds text
	@Then("I see the text No Funds on the dashboard")
	public void i_see_the_text_no_funds_on_the_dashboard() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP14ViewBalanceInTheDashboard/dashboardBalanceNoFunds'), 'No funds')
	}
}