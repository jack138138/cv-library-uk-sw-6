package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitlexp;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationxp;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;


    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitlexp, jobTitle);

      log.info("enter job Title" + jobTitlexp.toString());

    }

    public void enterLocation(String location) {
        sendTextToElement(locationxp, location);

        log.info("enter Location" + locationxp.toString());
    }

    public void selectDistance(String distance) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);

     log.info("select distance"+ distanceDropDown.toString());
    }

    public void clickOnMoreSearchOptionLink() throws InterruptedException{
        Thread.sleep(1000);
        clickOnElement(moreSearchOptionsLink);

        log.info("click on search option"+ moreSearchOptionsLink.toString());

    }

    public void enterMinSalary(String minSalary) throws InterruptedException {
        sendTextToElement(salaryMin, minSalary);

        log.info("enter min. salary"+salaryMin.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);

   log.info("enter max. salary"+ jobTitlexp.toString());

    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);

       log.info("enter salary Type"+ jobTitlexp.toString());
    }

    public void selectJobType(String jobType) throws InterruptedException {
        Thread.sleep(10000);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);

       log.info("select job type"+ jobTypeDropDown.toString());
    }

    public void clickOnFindJobsButton() throws InterruptedException{
        Thread.sleep(10000);
        clickOnElement(findJobsBtn);

      log.info("click on find job button"+ findJobsBtn.toString());
    }
    public void setAcceptCookies() throws InterruptedException {
        Thread.sleep(10000);

        // driver.switchTo().frame(iframe);
        switchToIframe(iframe);
        System.out.println("we are switching to iFrame");
        clickOnElement(acceptCookies);//click on Acceptall
        System.out.println("We are done with iFrame");

        driver.switchTo().defaultContent();//switch to default window
    }


}

