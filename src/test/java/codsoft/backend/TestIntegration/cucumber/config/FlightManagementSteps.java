package codsoft.backend.TestIntegration.cucumber.config;

import codsoft.backend.dtos.FlightDTO;
import codsoft.backend.models.Flight;
import codsoft.backend.repositories.FlightRepository;
import codsoft.backend.services.FlightService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class FlightManagementSteps {

    @Autowired
    private FlightRepository repo;

    @Autowired
    private FlightService flightService;

    private Flight flight;
    private FlightDTO flightDTO;

    // Scénario 1: Créer un nouveau vol
    @Given("a new flight request with the following details:")
    public void createFlightWithDetails(io.cucumber.datatable.DataTable dataTable) {
        var flightData = dataTable.asMaps(String.class, String.class).get(0);
        flightDTO = new FlightDTO();

        flightDTO.setDirect_flight(Boolean.parseBoolean(flightData.get("direct_flight")));
        flightDTO.setFlightType(flightData.get("flightType"));
        flightDTO.setFromcity(flightData.get("fromcity"));
        flightDTO.setTocity(flightData.get("tocity"));
        flightDTO.setAddNearbyAirportsFrom(Boolean.parseBoolean(flightData.get("addNearbyAirportsFrom")));
        flightDTO.setAddNearbyAirportsTo(Boolean.parseBoolean(flightData.get("addNearbyAirportsTo")));
        flightDTO.setTravelClass(flightData.get("travelClass"));
        flightDTO.setDepartureDate(flightData.get("departureDate"));
        flightDTO.setReturnDate(flightData.get("returnDate"));
        flightDTO.setAdults(Integer.parseInt(flightData.get("adults")));
        flightDTO.setChildren(Integer.parseInt(flightData.get("children")));


    }

    @When("the flight creation request is sent")
    public void sendFlightCreationRequest() {
        flight = flightService.createFlight(flightDTO);
    }

    @Then("the flight should be successfully created and available in the flights list")
    public void verifyFlightCreation() {
        assertEquals(flight, repo.findById(flight.getId()));
    }

    // Scénario 2
    @Given("an existing flight with ID {int} and departure date {string}")
    public void existingFlightWithDepartureDate(long id, String oldDepartureDate) {
        Optional<Flight> flight1= repo.findById(id);
        flight1.ifPresent(value -> assertEquals(oldDepartureDate, value.getDepartureDate()));
    }

    @When("the departure date is updated to {string} of the flight with ID {int}")
    public void updateDepartureDate(String newDepartureDate, int id) {
        flightService.updateDepartureDate(id, newDepartureDate);
    }

    @Then("the flight should reflect the updated departure date as {string}")
    public void verifyUpdatedDepartureDate(String newDepartureDate) {
        assertEquals(newDepartureDate, flight.getDepartureDate());
    }

    // Scénario 3
    @Given("an existing flight with ID {int} and return date {string}")
    public void existingFlightWithReturnDate(long id, String oldReturnDate) {
        Optional<Flight> flight1= repo.findById(id);
        flight1.ifPresent(value -> assertEquals(oldReturnDate, value.getReturnDate()));
    }

    @When("the return date is updated to {string}")
    public void updateReturnDate(String newReturnDate) {
        flightService.updateReturnDate(flight.getId(), newReturnDate);
    }

    @Then("the flight should reflect the updated return date as {string}")
    public void verifyUpdatedReturnDate(String newReturnDate) {
        assertEquals(newReturnDate, flight.getReturnDate());
    }

    // Scénario 4
    @Given("an existing flight with ID {int} and {int} children")
    public void existingFlightWithChildren(long id, int currentChildren) {
        Optional<Flight> flight1= repo.findById(id);
        flight1.ifPresent(value -> assertEquals(currentChildren, value.getChildren()));
    }

    @When("the number of children is increased by {int}")
    public void increaseChildren(int newChildren) {
        flightService.Addchildren(flight.getId(), newChildren);
    }

    @Then("the total children should be {int} on the flight")
    public void verifyTotalChildren(int totalChildren) {
        assertEquals(totalChildren, flight.getChildren());
    }

    // Scénario 5
    @Given("an existing flight with ID {int} and {int} adults")
    public void existingFlightWithAdults(long id, int currentAdults) {
        Optional<Flight> flight1= repo.findById(id);
        flight1.ifPresent(value -> assertEquals(currentAdults, value.getChildren()));
    }

    @When("the number of adults is increased by {int}")
    public void increaseAdults(int newAdults) {
        flightService.AddAdults(flight.getId(), newAdults);
    }

    @Then("the total adults should be {int} on the flight")
    public void verifyTotalAdults(int totalAdults) {
        assertEquals(totalAdults, flight.getAdults());
    }

    @When("the user changes the flight type to {string}")
    public void updateFlightType(String flightType) {
        flight.setFlightType(flightType);
        repo.save(flight);
    }

    @When("the user changes the travel class to {string}")
    public void updateTravelClass(String travelClass) {
        flight.setTravelClass(travelClass);
        repo.save(flight);
    }

    @When("the user sets the number of adults to {int}")
    public void setNumberOfAdults(int adults) {
        flight.setAdults(adults);
        repo.save(flight);
    }

    @Then("the flight's departure city should be {string}")
    public void verifyFromCity(String expectedFromCity) {
        assertEquals(expectedFromCity, flight.getFromcity());
    }

    @Then("the flight's destination city should be {string}")
    public void verifyToCity(String expectedToCity) {
        assertEquals(expectedToCity, flight.getTocity());
    }
}
