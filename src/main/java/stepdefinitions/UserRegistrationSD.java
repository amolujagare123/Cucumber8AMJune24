package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UserRegistrationSD {

    WebDriver driver;

    @Given("I am on user registration page")
    public void userRegistrationPage()
    {
       // driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://amolujagare.net/contact/");
    }


    @When("I enter below details")
    public void iEnterBelowDetails(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();
        driver.findElement(By.xpath("//input[@id='field_rgden']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@id='field_psuor']")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[@id='field_rmejg']")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//input[@id='field_es5y1']")).sendKeys(data.get(0).get(3));
    }


    @And("I click on submit button")
    public void iClickOnSubmitButton() {

    }

    @Then("user should be added")
    public void userShouldBeAdded() {
    }

    



/*    @When("I enter below details")
    public void i_enter_below_details(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }*/
}
