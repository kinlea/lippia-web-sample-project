package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravellsHomePage;
import com.crowdar.examples.pages.PhpTravellsHotelPage;
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

    @And("The client clicks on the First Hotel Option")
    public void theClientClicksOnTheFirstHotelOption() {
        Injector._page(PhpTravellsHomePage.class).clickFirstHotel();
    }

    @And("The client selects the Triple Rooms")
    public void theClientSelectsTheTripleRooms() {
        Injector._page(PhpTravellsHotelPage.class).clickFirstCheck();
    }

    @And("The client clicks on the Book Now buton")
    public void theClientClicksOnTheBookNowButon() {
        Injector._page(PhpTravellsHotelPage.class).clickOnButton();
    }

    @And("The client completes the Personal Details. Fist Name: (.*), Last Name: (.*), Email: (.*), Contact Number (.*), Adress: (.*) and Country: (.*)")
    public void theClientCompletesThePersonalDetails(String fName, String lName, String email, String cNumber, String adress, String country) {

    }

    @And("The client selects an extra champagne")
    public void theClientSelectsAnExtraChampagne() {
    }

    @And("The client clicks on the Confirm this booking buton")
    public void theClientClicksOnTheConfirmThisBookingButon() {
    }

    @And("The client clicks on the Pay on Arrival buton")
    public void theClientClicksOnThePayOnArrivalButon() {
    }

    @And("The client clicks on Aceptar en el modal")
    public void theClientClicksOnAceptarEnElModal() {
    }

    @Then("The client verify that The booking status is Reserved")
    public void theClientVerifyThatTheBookingStatusIsReserved() {
    }
}
