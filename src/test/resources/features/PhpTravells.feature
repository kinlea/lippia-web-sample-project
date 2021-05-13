Feature: As a user I want to maka a reservation for a Hotel for 2 adults and 1 child

  @challenge
  Scenario: The client goes to the PHPTRAVELLS site
    Given The client is in the phptravells page
    When The client clicks on the Hotel Tab
    And The client completes the checkin and checkout
    And The client clicks on the First Hotel Option
    And The client selects the Room
    And The client clicks on the Book Now buton
    And The client completes the Personal Details. Fist Name: Agustin, Last Name: Molina, Email: agustin@crowdar.com, Contact Number 5492258749, Adress: Mendoza and Country: Argentina
    And The client selects an extra champagne
    And The client clicks on the Confirm this booking buton
    And The client clicks on the Pay on Arrival buton
    Then The client verify that The booking status is Reserved

