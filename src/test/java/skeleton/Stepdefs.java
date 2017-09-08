package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Stepdefs {
    @Given("^I load the Top Rated Movies page$")
    public void I_load_the_top_rated_movie_page() throws Throwable {
        TopRated toprated = new TopRated();
        toprated.runcukes();
    }

    @Given("^I refine by Genre \"([^\"]*)\"$")
    public void i_refine_by_Genre(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^the list of movies should only contain relevant results$")
        public void the_list_of_movies_should_only_contain_relevant_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^I sort the list by \"([^\"]*)\"$")
        public void i_sort_the_list_by(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^the list of movies should be displayed in order of release date$")
        public void the_list_of_movies_should_be_displayed_in_order_of_release_date() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }
}
