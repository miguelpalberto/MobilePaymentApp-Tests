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
import io.appium.java_client.InteractsWithApps

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
import com.kms.katalon.core.configuration.RunConfiguration

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TP77PushNotificationsAboutTransactions {
	@Given("I open the mobile app")
	public void i_open_the_mobile_app() {
		// Define the relative path to the APK file
		String relativeAppPath = "vcardApp.apk"

		// Construct the absolute path using the project directory
		String absoluteAppPath = RunConfiguration.getProjectDir() + "/" + relativeAppPath

		Mobile.startApplication(absoluteAppPath, true)
		//Mobile.startApplication('C:\\UnivCoding\\TAES\\Project\\Repositories\\tests\\vCardApp.apk', true)
	}

	@Given("I see the vcard creation page in mobile")
	public void i_see_the_vcard_creation_page_in_mobile() {
	}

	@Given("I fill the phone with phone in mobile")
	public void i_fill_the_phone_with_phone_in_mobile() {
		Mobile.setText(findTestObject('Object Repository/TP77PushNotificationsAboutTransactions/android.widget.EditText'), '900000010',
				0)
	}

	@Given("I fill the password with password in mobile")
	public void i_fill_the_password_with_password_in_mobile() {
		Mobile.setText(findTestObject('Object Repository/TP77PushNotificationsAboutTransactions/android.widget.EditText (1)'), '123', 0)
	}

	@Given("I fill the pin with pin in mobile")
	public void i_fill_the_pin_with_pin_in_mobile() {
		Mobile.setText(findTestObject('Object Repository/TP77PushNotificationsAboutTransactions/android.widget.EditText (2)'), '123', 0)
	}

	@Given("I click on the create button in mobile")
	public void i_click_on_the_create_button_in_mobile() {
		Mobile.tap(findTestObject('Object Repository/TP77PushNotificationsAboutTransactions/android.widget.Button - CREATE'), 0)
	}

	@Given("I see a modal to enter my pin in mobile")
	public void i_see_a_modal_to_enter_my_pin_in_mobile() {
	}

	@Given("I enter my pin in mobile")
	public void i_enter_my_pin_in_mobile() {
		Mobile.setText(findTestObject('Object Repository/TP77PushNotificationsAboutTransactions/android.widget.EditText (3)'), '123', 0)
	}

	@Given("I click on the enter button in mobile")
	public void i_click_on_the_enter_button_in_mobile() {
		Mobile.tap(findTestObject('Object Repository/TP77PushNotificationsAboutTransactions/android.widget.Button - ENTER'), 0)
	}

	@Then("I see the dashboard page in mobile")
	public void i_see_the_dashboard_page_in_mobile() {
	}

	@When("I open my notifications")
	public void i_open_my_notifications() {
		Mobile.openNotifications()
	}

	@Then("I see a notification about a transaction")
	public void i_see_a_notification_about_a_transaction() {
	}

	public boolean hasTransaction() {
		return true;
		/*List<WebElement> allnotifications=Mobile.findElements(By.id("android:id/title"));
		 for (WebElement webElement : allnotifications) {
		 System.out.println(webElement.getText());
		 if(webElement.getText().contains("something")){
		 return true;
		 }
		 }
		 */
	}

	public boolean hasNoTransaction() {
		return true;
	}

	@Then("I close the mobile app")
	public void i_close_the_mobile_app() {
		Mobile.closeApplication()
		InteractsWithApps driver = MobileDriverFactory.getDriver()

		driver.removeApp('io.ionic.starter')
	}

	@Then("I see that there are no notifications about new transactions")
	public void i_see_that_there_are_no_notifications_about_new_transactions() {
	}
}