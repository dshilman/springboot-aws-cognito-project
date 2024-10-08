package com.airlines.catalog.service;

import com.airlines.catalog.dto.FlightDetails;
import com.airlines.catalog.model.Airport;
import com.airlines.catalog.model.Flight;
import com.airlines.catalog.repository.AirportRepository;
import com.airlines.catalog.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/* Create FlightDetailsService class */
@Service
public class FlightDetailsService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    AirportRepository airportRepository;

    /* Create private method populateFlightDetails method which takes flight, arrival airport and departure airport
as input parameters and returns flightDetails object. */
    private FlightDetails populateFlightDetails(Flight flight, Airport arrivalAirport, Airport departureAirport) {
        /* Match and Assign all the attributes from flight, arrivalAirport and departureAirport object
    to flightDetails object. */
        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setFlightId(flight.getId());
        flightDetails.setDepartureDate(flight.getDepartureDate());
        flightDetails.setDepartureTime(flight.getDepartureTime());
        flightDetails.setArrivalDate(flight.getArrivalDate());
        flightDetails.setArrivalTime(flight.getArrivalTime());
        flightDetails.setArrivalAirportCode(arrivalAirport.getAirportCode());
        flightDetails.setArrivalAirportName(arrivalAirport.getAirportName());
        flightDetails.setArrivalAirportCity(arrivalAirport.getAirportCity());
        flightDetails.setArrivalAirportLocale(arrivalAirport.getAirportLocale());
        flightDetails.setDepartureAirportCode(departureAirport.getAirportCode());
        flightDetails.setDepartureAirportName(departureAirport.getAirportName());
        flightDetails.setDepartureAirportCity(departureAirport.getAirportCity());
        flightDetails.setDepartureAirportLocale(departureAirport.getAirportLocale());
        flightDetails.setFlightDuration(flight.getFlightDuration());
        flightDetails.setTicketPrice(flight.getTicketPrice());
        flightDetails.setTicketCurrency(flight.getTicketCurrency());
        flightDetails.setSeatAvailable(flight.getSeatAvailable());
        flightDetails.setFlightNumber(flight.getFlightNumber());
        flightDetails.setAirlineName(flight.getAirlineName());
        flightDetails.setStops(flight.getStops());
        return flightDetails;
    }

    /* Create a method  for findFlights which takes departureDate, departureAirportCode,
    arrivalAirportCode, flightRepository and airportRepository as parameters and returns a
    list of flightDetails object
    */
    public List<FlightDetails> findFlights(String departureDate, String departureAirportCode,
                                        String arrivalAirportCode, FlightRepository flightRepository,
                                        AirportRepository airportRepository) {
        /* first call the flightRepository
        findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode method to get the iterable object of flight.*/
        Iterable<Flight> flights = flightRepository.findByDepartureDateAndDepartureAirportCodeAndArrivalAirportCode(departureDate, departureAirportCode, arrivalAirportCode);
        List<FlightDetails> flightDetailsList = new ArrayList<>();
        /* for each  flight in the iterable object: */
        for (Flight flight : flights) {
            /* call the airportRepository findByAirportCode method to get
            the arrivalAirport and departureAirport objects */
            Airport arrivalAirport = airportRepository.findByAirportCode(flight.getArrivalAirportCode());
            Airport departureAirport = airportRepository.findByAirportCode(flight.getDepartureAirportCode());
            /* call the populateFlightDetails method to get the flightDetails object and add it to the flightDetailsList */
            FlightDetails flightDetails = populateFlightDetails(flight, arrivalAirport, departureAirport);
            flightDetailsList.add(flightDetails);
        }
        /* return the flightDetailsList */
        return flightDetailsList;

    }

}