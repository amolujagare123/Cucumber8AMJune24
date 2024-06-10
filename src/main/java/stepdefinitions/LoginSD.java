package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("I am on the login page");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
    }
    @When("I Enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I Enter correct username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
    }
    @Then("I should be land on dashboard")
    public void i_should_be_land_on_dashboard() {
        System.out.println("I should be land on dashboard");

        String expected = "https://stock.scriptinglogic.in/dashboard.php";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("this is not a dashboard",expected,actual);
    }

    @When("I Enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {

        driver.findElement(By.id("login-username")).sendKeys("dsdsd");
        driver.findElement(By.id("login-password")).sendKeys("dsdsd");
    }

    @Then("I should get an error")
    public void iShouldGetAnError() {
        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();
        Assert.assertEquals("incorrect or no error messagre",expected,actual);
    }

    @When("I Enter blank username and password")
    public void iEnterBlankUsernameAndPassword() {

        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");
    }

    @When("I Enter {string} and {string} as username and password")
    public void iEnterAndAsUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }
}
