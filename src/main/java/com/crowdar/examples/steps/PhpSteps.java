package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravellsDetailPage;
import com.crowdar.examples.pages.PhpTravellsHomePage;
import com.crowdar.examples.pages.PhpTravellsHotelPage;
import com.crowdar.examples.pages.PhpTravellsPaymentPage;
import io.cucumber.java.en.*;

public class PhpSteps extends PageSteps {

    @Given("The client is in the phptravells page")
    public void home() {
        Injector._page(PhpTravellsHomePage.class).go();
    }

    @When("The client clicks on the Hotel Tab")
    public void theClientClicksOnTheHotelTab() {
        Injector._page(PhpTravellsHomePage.class).clickOnHotelTab();
    }

    @And("The client completes the checkin and checkout")
    public void theClientCompletesTheCheckinAndCheckout() {
        Injector._page(PhpTravellsHomePage.class).seleccionarHotel();
        Injector._page(PhpTravellsHomePage.class).completarCheckIn();
        Injector._page(PhpTravellsHomePage.class).completarCheckOut();
        Injector._page(PhpTravellsHomePage.class).addAChild();
        Injector._page(PhpTravellsHomePage.class).clickBtnSearch();
    }

    @And("The client selects the Room")
    public void theClientSelectsTheRoom() {
        Injector._page(PhpTravellsHotelPage.class).clickFirstCheck();
    }

    @And("The client clicks on the Book Now buton")
    public void theClientClicksOnTheBookNowButon() {
        Injector._page(PhpTravellsHotelPage.class).clickOnButton();
    }

    @And("The client completes the Personal Details. Fist Name: (.*), Last Name: (.*), Email: (.*), Contact Number (.*), Adress: (.*) and Country: (.*)")
    public void theClientCompletesThePersonalDetails(String fName, String lName, String email, String cNumber, String adress, String country) {
        Injector._page(PhpTravellsDetailPage.class).completeForm(fName, lName, email, cNumber, adress, country);
    }

    @And("The client selects an extra")
    public void theClientSelectsAnExtraChampagne() {
        //Injector._page(PhpTravellsDetailPage.class).selectExra();
    }

    @And("The client clicks on the Confirm this booking button")
    public void theClientClicksOnTheConfirmThisBookingButton() {
        Injector._page(PhpTravellsDetailPage.class).clickConfirm();
    }

    @And("The client clicks on the Pay on Arrival button")
    public void theClientClicksOnThePayOnArrivalButton() {
        Injector._page(PhpTravellsPaymentPage.class).clickPayOnArrival();
    }

    @Then("The client verify that The booking status is Reserved")
    public void theClientVerifyThatTheBookingStatusIsReserved() {
        Injector._page(PhpTravellsPaymentPage.class).verifyCompleteFlow();
    }


}
