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



class TP18DisplayLastTransactionInDashboard {


	@When("I look at the Last Transaction panel")
	public void i_look_at_the_Last_Transaction_panel() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP18DisplayLastTransactionInDashboard/ion-lastTransactionWholePannel'),
				0)
	}

	@Then("I see my last transaction on the dashboard")
	public void i_see_my_last_transaction_on_the_dashboard() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP18DisplayLastTransactionInDashboard/div_linhaDaTransacao'),	0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP18DisplayLastTransactionInDashboard/p-valorTransacao'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP18DisplayLastTransactionInDashboard/p-numeroReferenciaTransacao'),
				0)
		//WebUI.verifyElementText(findTestObject('Object Repository/TP18DisplayLastTransactionInDashboard/p-numeroReferenciaTransacao'),'58426-809444419')
	}

	@Then("I see the transaction area displaying the text “No transactions yet”")
	public void i_see_the_transaction_area_displaying_the_text() {
		WebUI.verifyElementText(findTestObject('Object Repository/TP18DisplayLastTransactionInDashboard/p_No transactions yet'),
				'No transactions yet')
	}

	@Given("I did not make or receive any transaction previously")
	public void i_did_not_make_or_receive_any_transaction_previously() {
	}
	@Given("I made or received transactions previously")
	public void i_made_or_received_transactions_previously() {
	}
}