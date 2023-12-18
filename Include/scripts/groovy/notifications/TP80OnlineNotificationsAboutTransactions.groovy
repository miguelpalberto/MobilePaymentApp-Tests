package notifications
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



class TP80OnlineNotificationsAboutTransactions {
	@When("I click on the notifications button")
	public void i_click_on_the_notifications_button() {
		WebUI.click(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/cc/ion-button_2'))
	}

	@Then("I see all notifications")
	public void i_see_all_notifications() {
		//		WebUI.verifyElementPresent(findTestObject('TP80OnlineNotificationsAboutTransactions/Final/ion-col_primeiraNotific'),
		//				0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/cc/ion-list_Dismiss all2023-11-11 025908916072_1c9183'), 0)
	}

	@Then("I see no notifications")
	public void i_see_no_notifications() {
		//WebUI.verifyElementPresent(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/d/ion-content_Dismiss all2023-12-18 223848900_eba3bb'),0)
		//WebUI.verifyElementVisible(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/d/ion-itemEmptyNotif'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/e/p_No notifications'))
	}

	@When("I click on the dismiss button")
	public void i_click_on_the_dismiss_button() {
		WebUI.click(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/cc/ion-checkbox_Dismiss all_md in-item interac_5fd74e'))
	}

	@Then("the notification is dismissed")
	public void the_notification_is_dismissed() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/b/ion-checkbox_Dismiss all_md in-item interac_5fd74e'))
		//WebUI.verifyElementPresent(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/b/ion-checkbox_Dismiss all_md in-item interac_5fd74e'),0)

	}

	@When("I click on the dismiss all button")
	public void i_click_on_the_dismiss_all_button() {
		//WebUI.click(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/cc/ion-checkbox_Dismiss all_md in-item interac_5fd74e (1)'))
		WebUI.click(findTestObject('Object Repository/TP80OnlineNotificationsAboutTransactions/f/ion-button_Dismiss all'))
		}

	@Then("all notifications are dismissed")
	public void all_notifications_are_dismissed() {
	}
}