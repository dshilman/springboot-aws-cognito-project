package com.airlines.catalog.test;
import com.airlines.catalog.FlightBookingApplication;
import com.airlines.catalog.model.Flight;
import com.airlines.catalog.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*
Create FlightRepositoryTest class to test the FlightRepository class using web environment with random port.
Test cases for testing findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode method that returns an iterable.
First test case method with no results using departure date as "2023-08-01", departure airport code as "CDG"
and arrival airport code as "LAX".
Second test case method with single results using departure date as "2023-08-02", departure airport code as "LHR" and arrival airport code as "CDG" .
Third test case method with multiple results using departure date as "2023-08-01", departure airport code as "MIA" and arrival airport code as "LAX".
*/
@SpringBootTest(classes = FlightBookingApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @Value("${local.server.port}")
    private int port;

    @Test
    public void findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode_NoResults() {
        String departureDate = "2023-08-01";
        String departureAirportCode = "CDG";
        String arrivalAirportCode = "LAX";
        Iterable<Flight> flights = flightRepository.findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode(departureDate, departureAirportCode, arrivalAirportCode);
        Assert.assertNotNull(flights);
        Assert.assertFalse(flights.iterator().hasNext());
    }

    @Test
    public void findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode_SingleResult() {
        String departureDate = "2023-08-02";
        String departureAirportCode = "LHR";
        String arrivalAirportCode = "CDG";
        Iterable<Flight> flights = flightRepository.findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode(departureDate, departureAirportCode, arrivalAirportCode);
        Assert.assertNotNull(flights);
        Assert.assertTrue(flights.iterator().hasNext());
        Assert.assertEquals(1, flights.spliterator().getExactSizeIfKnown());
    }

    @Test
    public void findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode_MultipleResults() {
        String departureDate = "2023-08-01";
        String departureAirportCode = "MIA";
        String arrivalAirportCode = "LAX";
        Iterable<Flight> flights = flightRepository.findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode(departureDate, departureAirportCode, arrivalAirportCode);
        Assert.assertNotNull(flights);
        Assert.assertTrue(flights.iterator().hasNext());
        Assert.assertEquals(2, flights.spliterator().getExactSizeIfKnown());
    }
}