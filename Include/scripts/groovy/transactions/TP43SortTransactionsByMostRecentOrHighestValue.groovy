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



class TP43SortTransactionsByMostRecentOrHighestValue {

	@When("I select the Sort By Date button")
	public void i_select_the_Sort_By_Date_button() {
		WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsB/ion-button_SortDate'))
		//WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsC/button_button-native-cusable-901'))
		//WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsC/ion-button_Filters_custom-button-sorts date-button md button button- button-solid ion-activatable ion-focusable'))
		//WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsC/ion-button_Filters_c'))
		//WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsC/span_button-inner-cusable-af8'))
		//WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsC/Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/Page_Ionic App/ion-button_Filters_custom-button-sorts date-button md button button- button-solid ion-activatable ion-focusable'))
	}

	@When("I select the Ascendent button")
	public void i_select_the_Ascendent_button() {
		WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ButtonsB/ion-button_SortAscDesc'))
	}

	@Then("I see my transactions sorted by ascendent date")
	public void i_see_my_transactions_sorted_by_ascendent_date() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/p_2023-11-21 014046'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/p_2023-11-21 014046'),
				'2023-11-21 01:40:46')

		WebUI.verifyElementPresent(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/p_2023-09-25 095118'),
				0)

		WebUI.verifyElementText(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/p_2023-09-25 095118'),
				'2023-09-25 09:51:18')
	}


	@When("I select the Sort By Amount button")
	public void i_select_the_Sort_By_Amount_button() {
		WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/Buttons/ion-button_SortDate'))

		WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/Buttons/ion-button_SortAmount'))
	}

	@When("I select the Decrescent button")
	public void i_select_the_Decrescent_button() {
		WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/Buttons/ion-button_SortAscDesc'))

		WebUI.click(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/Buttons/ion-button_SortAscDesc'))
	}

	@Then("I see my transactions sorted by decrescent amount")
	public void i_see_my_transactions_sorted_by_decrescent_amount() {
WebUI.verifyElementPresent(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ion-col_ReferencePT96208402479312057159036'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/h1_1348.47'), 
    '+1348.47€')

WebUI.verifyElementPresent(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/ion-col_Reference42231-399679499'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/TP43SortTransactionsByMostRecentOrHighestValue/h1_-863.36'), 
    '-863.36€')
	}
}