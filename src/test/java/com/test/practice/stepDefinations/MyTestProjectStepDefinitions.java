package com.test.practice.stepDefinations;

import com.test.practice.pages.BuyProductPage;
import com.test.practice.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyTestProjectStepDefinitions {

	RegistrationPage register = new RegistrationPage();
	BuyProductPage buyProduct = new BuyProductPage();

	@Given("User open application")
	public void user_open_application() {
		register.startBrowser();
		System.out.println("Login to application");
	}

	@Given("User click on new customer register button")
	public void user_click_on_new_customer_register_button() {
		register.clickRegisterBtn();
	}

	@When("User enter personal details with Firstname as {string},LastName as {string},Email as {string},Telephone as {string}")
	public void user_enter_personal_details_with_firstname_as_last_name_as_email_as_telephone_as(String firstname,
			String lastname, String email, String telephone) {
		register.enterPersonalDetails(firstname, lastname, email, telephone);
	}

	@When("User enter password as {string} and confirm password as {string}")
	public void user_enter_password_as_and_confirm_password_as(String password, String confirmPassword) {
		register.enterPassword(password, confirmPassword);
	}

	@When("Accept term and condition")
	public void accept_term_and_condition() {
		register.acceptPrivacyPolicy();
	}

	@Then("User click on continue button to create account")
	public void user_click_on_continue_button_to_create_account() {
		register.clickRegistrationPageCtnBtn();

	}

	@Then("User confirm account has been created and click on continue")
	public void user_confirm_account_has_been_created_and_click_on_continue() {
		register.verifyAccountCreated();
	}

	@Then("User click on continue after account got created")
	public void user_click_on_continue_after_account_got_created() {
		register.clickAccountPageCtnBtn();
	}

	@Then("Verify user is on My Account page")
	public void verify_user_is_on_my_account_page() {
		register.verifyMyAccountPage();
	}

	@Given("User is on homepage")
	public void user_is_on_homepage() {
		buyProduct.verifyHomepage();
	}

	@Given("User click on Laptop and Notebooks menu")
	public void user_click_on_laptop_and_notebooks_menu() {
		buyProduct.clickLaptop_NotebookMenu();
	}

	@Given("User click on show all Laptop and Notebooks")
	public void user_click_on_show_all_laptop_and_notebooks() {
		buyProduct.clickShowAllLaptop_Notebook();
	}

	@When("User select HP Laptopn to buy")
	public void user_select_hp_laptopn_to_buy() {
		buyProduct.clickAddToCart();
	}

	@When("User click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		buyProduct.clickAddToCartCheckoutBtn();
	}

	@When("User click on shopping cart link")
	public void user_click_on_shopping_cart_link() {
		buyProduct.clickShoppingCartBtn();
	}

	@When("User click on checkout to add billing detials")
	public void user_click_on_checkout_to_add_billing_detials() {
		buyProduct.clickCheckoutBtn();
	}

	@Given("User is on checkout page")
	public void user_is_on_checkout_page() {
		System.out.println("Checkout");
	}

	@When("User enter Billing Details with Firstname as {string} ,Lastname as {string},Address as {string},City as {string},Postcode as {string},Country as {string},State as {string}")
	public void user_enter_billing_details_with_firstname_as_lastname_as_address_as_city_as_postcode_as_country_as_state_as_maharashtra(
			String firstname, String lastname, String address, String city, String postcode, String country,
			String state) {
		buyProduct.enterFirstname(firstname);
		buyProduct.enterLastname(lastname);
		buyProduct.enterAddress(address);
		buyProduct.enterCity(city);
		buyProduct.enterPostcode(postcode);
		buyProduct.selectCountry(country);
		buyProduct.selectState(state);
	}

	@When("User click on continue button for delivery details")
	public void user_click_on_continue_button_for_delivery_details() {
		buyProduct.clickBillingDetailsCtnBtn();
	}

	@When("User select delivery details")
	public void user_select_delivery_details() {
		buyProduct.clickdeliveryDetailsCtnBtn();
	}

	@When("User click on continue button for delivery method")
	public void user_click_on_continue_button_for_delivery_method() {
		buyProduct.clickdeliveryMethodCtnBtn();
	}

	@When("User click on continue for payement method")
	public void user_click_on_continue_for_payement_method() {
		buyProduct.clickPaymentMethodCtnBtn();
	}

	@When("User accept term and conditions for delivery")
	public void user_accept_term_and_conditions_for_delivery() {
		buyProduct.acceptPaymentTermCond();
	}

	@When("User click on continue button for confirm order")
	public void user_click_on_continue_button_for_confirm_order() {

	}

	@Then("User click on confirm order button")
	public void user_click_on_confirm_order_button() {
		buyProduct.clickConfirmOrderBtn();
	}

	@Then("User verify order has been placed")
	public void user_verify_order_has_been_placed() {
		buyProduct.verifyOrderPlaced();
	}
}
