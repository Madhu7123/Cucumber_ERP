package stepDefination;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ERPStepDefinations extends FunctionLibrary{
	
	@Given("Launch Browser")
	public void launch_browser() throws Throwable {
	    driver = FunctionLibrary.startBrowser(driver);
	}
	@Given("launch url in a browser")
	public void launch_url_in_a_browser() {
	    FunctionLibrary.launchUrl();
	}
	@When("Wait for username with {string} and {string}")
	public void waitForUsername(String Ltype, String Lvalue) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Enter username with {string} and {string} and {string}")
	public void enterUsername(String Ltype, String Lvalue, String TestData) {
	   FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}
	@When("Enter password with {string} and {string} and {string}")
	public void enterPassword(String Ltype, String Lvalue, String TestData) {
	    FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}
	@When("click login with {string} and {string}")
	public void clickLogin(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Wait for logout link with {string} and {string}")
	public void waitForLogout(String Ltype, String Lvalue) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Verify page title with {string}")
	public void validatepagetitle(String Actual) {
	   FunctionLibrary.validateTitle(Actual);
	}
	@When("Wait for suppliiers link with {string} and {string}")
	public void waitforSupplierLink(String Ltype, String Lvalue) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Click Suppliers link with {string} and {string}")
	public void clickSupplierLink(String Ltype, String Lvalue) {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Wait for Add Icon with {string} and {string}")
	public void wait_for_add_icon_with_and(String Ltype, String Lvalue) {
		 FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Click Add icon with {string} and {string}")
	public void click_add_icon_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Wait for Supplier Number with {string} and {string}")
	public void waitforSuppliernumber(String Ltype, String Lvalue) {
		 FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Captrure Supplier number with {string} and {string}")
	public void captureSuppliernumber(String Ltype, String Lvalue) {
	   FunctionLibrary.captureSupNumber(Ltype, Lvalue);
	}
	@When("Enter in {string} with {string} and {string}")
	public void fillSupplierDetails(String TestData, String Ltype, String Lvalue) {
	   FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}
	@When("Click Add button with {string} and {string}")
	public void clickaddbutton(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Wait for confirm ok with {string} and {string}")
	public void waitForConfirm(String Ltype, String Lvalue) {
		 FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("click confirm ok button with {string} and {string}")
	public void clickConfirm(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Wait for alert ok with {string} and {string}")
	public void waitForAlert(String Ltype, String Lvalue) {
		 FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("ClickAlert ok with {string} and {string}")
	public void clickAlertOk(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@Then("Verify supplier number")
	public void verifyTable() throws Throwable {
	   FunctionLibrary.supplierTable();
	}
	@When("Close app browser")
	public void closeAppbrowser() {
	   FunctionLibrary.closeBrowser();
	}
	@When("Wait for customers link with {string} and {string}")
	public void wait_for_customers_link_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Click customers link with {string} and {string}")
	public void click_customers_link_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("Wait for cutomer Number with {string} and {string}")
	public void wait_for_cutomer_number_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, "10");
	}
	@When("Captrure customer number with {string} and {string}")
	public void captrure_customer_number_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.captureCusNumber(Ltype, Lvalue);
	}
	@Then("Verify customer number")
	public void verify_customer_number() throws Throwable {
	   FunctionLibrary.customerTable();
	}
}
