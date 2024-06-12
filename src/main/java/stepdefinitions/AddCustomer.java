package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static stepdefinitions.Hooks.getDriver;

public class AddCustomer {
    static WebDriver driver;
    @Given("I am on add customer page")
    public void i_am_on_add_customer_page() {

        driver = getDriver();
        driver.findElement(By.linkText("Add Customer")).click();
    }

    @When("I Enter {}, {}, {}, {}")
    public void iEnterDetails(String name, String address, String contact1, String contact2) {
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);

    }
    @When("I click on add button")
    public void i_click_on_add_button() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("customer should be added")
    public void customer_should_be_added() {

    }

}
