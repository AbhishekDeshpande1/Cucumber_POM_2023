package com.test.practice.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.test.practise.utilities.ActionMethods;
import com.test.practise.utilities.Utility.ELEMENT_LOCATE_BY;

public class BuyProductPage extends ActionMethods {

	public static String laptop_Notebook = "//a[normalize-space()='Laptops & Notebooks']";
	public static String showAllLap_Note = "//a[normalize-space()='Show All Laptops & Notebooks']";
	public static String addToCartBtn = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]";
	public static String addtoCartCheckOutBtn = "//button[@id='button-cart']";
	public static String shoppingCartBtn = "//a[contains(text(),'shopping cart')]";
	public static String checkoutBtn = "//a[@class='btn btn-primary']";
	public static String firstname = "//input[@id='input-payment-firstname']";
	public static String lastname = "//input[@id='input-payment-lastname']";
	public static String address = "//input[@id='input-payment-address-1']";
	public static String city = "//input[@id='input-payment-city']";
	public static String postCode = "//input[@id='input-payment-postcode']";
	public static String countryDropDown = "//select[@id='input-payment-country']";
	public static String state = "//select[@id='input-payment-zone']";
	public static String bllingDetailsCtnBtn = "//input[@id='button-payment-address']";
	public static String deliveryDetailsCtnBtn = "//input[@id='button-shipping-address']";
	public static String deliveryMethodCtnBtn = "//input[@id='button-shipping-method']";
	public static String termsAndConditions = "//input[@name='agree']";
	public static String payementMethodCtnBtn = "//input[@id='button-payment-method']";
	public static String confirmBtn = "input#button-confirm";

	public void verifyHomepage() {
		String hompePageTitle = getTitleOfPage();
		System.out.println("User is on " + hompePageTitle);
		System.out.println("HomePage Titile is " +hompePageTitle);
		assertEquals(hompePageTitle, "My Account");
	}

	public void clickLaptop_NotebookMenu() {
		clickElement(laptop_Notebook, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickShowAllLaptop_Notebook() {
		waitForElementPresent(showAllLap_Note, ELEMENT_LOCATE_BY.XPATH, 5);
		clickElement(showAllLap_Note, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickAddToCart() {
		waitForElementPresent(addToCartBtn, ELEMENT_LOCATE_BY.XPATH, 5);
		clickElement(addToCartBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickShoppingCartBtn() {
		waitForElementPresent(shoppingCartBtn, ELEMENT_LOCATE_BY.XPATH, 5);
		clickElement(shoppingCartBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickAddToCartCheckoutBtn() {
		waitForElementPresent(addtoCartCheckOutBtn, ELEMENT_LOCATE_BY.XPATH, 5);
		clickElement(addtoCartCheckOutBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickCheckoutBtn() {
		waitForElementPresent(checkoutBtn, ELEMENT_LOCATE_BY.XPATH, 5);
		clickElement(checkoutBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void enterFirstname(String firstName) {
		waitForElementPresent(firstname, ELEMENT_LOCATE_BY.XPATH, 5);
		inputValue(firstname, firstName, ELEMENT_LOCATE_BY.XPATH);
	}

	public void enterLastname(String lastName) {
		inputValue(lastname, lastName, ELEMENT_LOCATE_BY.XPATH);
	}

	public void enterAddress(String address1) {
		inputValue(address, address1, ELEMENT_LOCATE_BY.XPATH);
	}

	public void enterCity(String city1) {
		inputValue(city, city1, ELEMENT_LOCATE_BY.XPATH);
	}

	public void enterPostcode(String postcode) {
		inputValue(postCode, postcode, ELEMENT_LOCATE_BY.XPATH);
	}

	public void selectCountry(String country) {
		selectElementUsingVisibleText(countryDropDown, ELEMENT_LOCATE_BY.XPATH, "India");
	}

	public void selectState(String state1) {
		selectElementUsingVisibleText(state, ELEMENT_LOCATE_BY.XPATH, "Maharashtra");
	}

	public void clickBillingDetailsCtnBtn() {
		waitForElementPresent(bllingDetailsCtnBtn, ELEMENT_LOCATE_BY.XPATH, 2);
		clickElement(bllingDetailsCtnBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickdeliveryMethodCtnBtn() {
		waitForElementPresent(deliveryMethodCtnBtn, ELEMENT_LOCATE_BY.XPATH, 2);
		clickElement(deliveryMethodCtnBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickdeliveryDetailsCtnBtn() {
		waitForElementPresent(deliveryDetailsCtnBtn, ELEMENT_LOCATE_BY.XPATH, 2);
		clickElement(deliveryDetailsCtnBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void acceptPaymentTermCond() {
		waitForElementPresent(termsAndConditions, ELEMENT_LOCATE_BY.XPATH, 2);
		clickElement(termsAndConditions, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickPaymentMethodCtnBtn() {
		clickElement(payementMethodCtnBtn, ELEMENT_LOCATE_BY.XPATH);
	}

	public void clickConfirmOrderBtn() {
		waitForElementPresent(confirmBtn, ELEMENT_LOCATE_BY.CSSSELECTOR, 2);
		clickElement(confirmBtn, ELEMENT_LOCATE_BY.CSSSELECTOR);
		getScreenshot();

	}

	public void verifyOrderPlaced() {
		waitForCertainPeriod(2000);
		String order = getTitleOfPage();
		assertEquals(order, "Your order has been placed!");
	}

}
