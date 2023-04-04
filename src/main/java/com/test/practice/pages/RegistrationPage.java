package com.test.practice.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.test.practise.utilities.ActionMethods;
import com.test.practise.utilities.ConfigReader;
import com.test.practise.utilities.Utility.ELEMENT_LOCATE_BY;

public class RegistrationPage extends ActionMethods {

	public static String registrayionBtn = "a[class='btn btn-primary']";
	public static String firstName = "//input[@id='input-firstname']";
	public static String lastName = "//input[@id='input-lastname']";
	public static String email = "#input-email";
	public static String telePhone = "#input-telephone";
	public static String password = "//input[@id='input-password']";
	public static String confirmPassword = "//input[@id='input-confirm']";
	public static String privacyPolicyChkbox = "//input[@type='checkbox']";
	public static String registationPageCtnBtn = "//input[@value='Continue']";
	public static String accountPageCtnBtn = ".btn.btn-primary";

	public void startBrowser() {
		driver.get(ConfigReader.getProperties("applicationUrl"));
	}

	public void clickRegisterBtn() {
		waitForElementPresent(registrayionBtn, ELEMENT_LOCATE_BY.CSSSELECTOR, 1);
		clickElement(registrayionBtn, ELEMENT_LOCATE_BY.CSSSELECTOR);
	}

	public void enterPersonalDetails(String firstname, String lastname, String mail, String telephone) {
		inputValue(firstName, firstname, ELEMENT_LOCATE_BY.XPATH);
		inputValue(lastName, lastname, ELEMENT_LOCATE_BY.XPATH);
		inputValue(email, mail, ELEMENT_LOCATE_BY.CSSSELECTOR);
		inputValue(telePhone, telephone, ELEMENT_LOCATE_BY.CSSSELECTOR);
		getScreenshot();

	}

	public void enterPassword(String pwd, String confirmPwd) {
		inputValue(password, pwd, ELEMENT_LOCATE_BY.XPATH);
		inputValue(confirmPassword, confirmPwd, ELEMENT_LOCATE_BY.XPATH);

	}

	public void acceptPrivacyPolicy() {
		clickElement(privacyPolicyChkbox, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickRegistrationPageCtnBtn() {
		clickElement(registationPageCtnBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void verifyAccountCreated() {
		String title = getTitleOfPage();
		System.out.println("Title of Page is :" + title);
		assertEquals(title, "Your Account Has Been Created!");
		getScreenshot();
	}

	public void clickAccountPageCtnBtn() {
		waitForElementPresent(accountPageCtnBtn, ELEMENT_LOCATE_BY.CSSSELECTOR, 5);
		clickElement(accountPageCtnBtn, ELEMENT_LOCATE_BY.CSSSELECTOR);
	}

	public void verifyMyAccountPage() {
		String accountPageTitle = getTitleOfPage();
		System.out.println("Title of Account Page is :" + accountPageTitle);
		assertEquals(accountPageTitle, "My Account");
		getScreenshot();


	}

}
