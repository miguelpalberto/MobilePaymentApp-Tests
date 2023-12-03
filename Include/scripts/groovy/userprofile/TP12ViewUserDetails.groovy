package userprofile
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



class TP12ViewUserDetails {




	@When("I click on the user profile")
	public void i_click_on_the_user_profile() {
		WebUI.click(findTestObject('Object Repository/TP12ViewUserDetails/TP12Bion-button_User'))
	}

	@Then("I am on the user profile page")
	public void i_am_on_the_user_profile_page() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/TP12ViewUserDetails/ion-content_Phone numberNameEmailEdit'), 0)
		//WebUI.verifyElementVisible(findTestObject('Object Repository/TP12ViewUserDetails/mainPaginaProfileB'))
	}
	@And("I see my personal details view")
	public void i_see_my_personal_details_view() {
		//WebUI.verifyElementPresent(findTestObject('Object Repository/TP12ViewUserDetails/ion-list_Phone numberNameEmail'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP12ViewUserDetails/input_PhoneVer'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP12ViewUserDetails/input_NameVer'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/TP12ViewUserDetails/input_EmailVer'))
	}
}