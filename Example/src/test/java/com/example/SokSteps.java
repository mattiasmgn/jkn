package com.example;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mm on 06/12/16.
 */
public class SokSteps {
    public SokSteps() {
        System.setProperty("webdriver.chrome.driver","/opt/java/chromdriver/chromedriver");
        System.out.println("Chromdriver set");
    }
    WebDriver driver;
    @Given("^I am on the reg-search-page$")
    public void I_am_on_the_reg_search_page() throws Throwable {
        //WebDriver driver = new FirefoxDriver();
         driver = new ChromeDriver();
        driver.get("http://localhost:8080/sh/klassisk/SokHast?a=sok_hast_regnr_1");
    }

    @When("^I enter regnr \"([^\"]*)\"$")
    public void I_enter_regnr(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.name("regnr"));
        element.sendKeys(arg1);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {}
        element.submit();
    }

    @Then("^\"([^\"]*)\" should show in the hitlist$")
    public void should_show_in_the_hitlist(String arg1) throws Throwable {
        String html = driver.getPageSource();
        int index=html.indexOf(arg1);
        assertNotEquals(index,-1);
    }
}
