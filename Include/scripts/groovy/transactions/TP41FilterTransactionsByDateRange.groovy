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



class TP41FilterTransactionsByDateRange {

	@When("I click on Filters button")
	public void i_click_on_Filters_button() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/ion-button_Filters'))
	}

	@When("I see the Filters modal")
	public void i_see_the_Filters_modal() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/div_modalFiltros'))
	}

	@When("I click on Start Date")
	public void i_click_on_Start_Date() {
		WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/input_Start Date_dateInput'))
	}

	@When("I see the Calendar modal")
	public void i_see_the_Calendar_modal() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/ion-modalCalendario'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/ion-contentModalCalendario'))
	}

	@When("I choose a year")
	public void i_choose_a_year() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/anoS/pathAbrirAno'))
		//WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/anoS/button_1991-pen-f84-e2aDoesntwork'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/anoS/pathAbrirAno'))

	}

	@When("I choose a month")
	public void i_choose_a_month() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
	}

	@When("I choose a day")
	public void i_choose_a_day() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/dia7/ion-datetime_Start Date_ion-7'))
	}

	@When("I choose an hour")
	public void i_choose_an_hour() {
		WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TimeCalendar/ion-timeCalendar'))
		WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TimeCalendar/ion-timeCalendar'))
	}

	@When("I press OK for the calendar")
	public void i_press_OK_for_the_calendar() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/ion-button_OKCalendar'))
	}

	@When("I click on End Date")
	public void i_click_on_End_Date() {
		WebUI.click(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/input_End Date_dateInput'))
	}

	//@When("I choose a recent month")
	//public void i_choose_a_recent_month() {
	//	WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
	//	WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
	//}

	@When("I press Confirm for the Filters")
	public void i_press_Confirm_for_the_Filters() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/Modal/ion-button_Confirm'))
	}

	@Then("I see the transactions filtered by the date rage selected")
	public void i_see_the_transactions_filtered_by_the_date_rage_selected() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/ion-row_Reference9000000172023-09-25 03540037.33'))

		WebUI.verifyElementText(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/p_2023-09-25 035400'),
				'2023-09-25 03:54:00')

		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/ion-row_Reference9000000132023-11-04 080701-61.46'))

		WebUI.verifyElementText(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/p_2023-11-04 080701'),
				'2023-11-04 08:07:01')
	}
	//////////////////////////////


	@When("I choose the same month as before")
	public void i_choose_the_same_month_as_before() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))

		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))

		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/setaEsquerdaCalendario/ion-button_md_SetaCalEsq'))
	}

	@Then("I see there are no transactions after the filter")
	public void i_see_there_are_no_transactions_after_the_filter() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/p_No transactions'))

		WebUI.verifyElementText(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/p_No transactions'),
				'No transactions')

	}
	//////////////////////////////////


	@When("I press Reset for the Filters")
	public void i_press_Reset_for_the_Filters() {
		WebUI.click(findTestObject('TP41FilterTransactionsByDateRange/Final/Modal/ion-button_Reset'))
	}

	@Then("I see there are no filters being aplied")
	public void i_see_there_are_no_filters_being_aplied() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/SemFiltros/ion-row_Reference9000000172023-09-25 03540037.33'))

		WebUI.verifyElementText(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/SemFiltros/p_2023-09-25 035400'),
				'2023-09-25 03:54:00')

		WebUI.verifyElementVisible(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/SemFiltros/ion-row_ReferencePT477644242408482283459502_0ba38f'))

		WebUI.verifyElementText(findTestObject('Object Repository/TP41FilterTransactionsByDateRange/Final/TransacoesResultado/SemFiltros/p_2023-11-23 065029'),
				'2023-11-23 06:50:29')

	}
}