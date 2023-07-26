package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTest {
    @Given("I am On Home Page")
    public void iAmOnHomePage() {

    }

    @When("I Accept Coockies all")
    public void iAcceptCoockiesAll() throws InterruptedException {
        new HomePage().setAcceptCookies();

    }

    @And("I enter {string}")
    public void iEnter(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
      new HomePage().enterLocation(location);
    }

    @And("I select {string}")
    public void iSelect(String distance) throws InterruptedException {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more Search option lick")
    public void iClickOnMoreSearchOptionLick()throws InterruptedException {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter Min.Salary {string}")
    public void iEnterMinSalary(String minSalary) throws InterruptedException {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter Max.Salary {string}")
    public void iEnterMaxSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select SalaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select JobType {string}")
    public void iSelectJobType(String jobType) throws InterruptedException{
        new HomePage().selectJobType(jobType);

    }

    @And("I click on FindJobs Button")
    public void iClickOnFindJobsButton()throws InterruptedException {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I should see the {string}")
    public void iShouldSeeThe(String result) throws InterruptedException {
        new ResultPage().verifyTheResults(result);
    }
}